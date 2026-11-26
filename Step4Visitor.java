import java.util.ArrayList;
import java.util.List;

public class Step4Visitor extends MicroBaseVisitor<String> {

    private final List<String> IR = new ArrayList<>();
    private int tempCount = 0;
    private int labelCount = 0;
    private final SymbolTable symbolTable;

    public Step4Visitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    private String newTemp() {
        return "$T" + (++tempCount);
    }

    public List<String> getIRList() {
        return IR;
    }

    // -------------------- IR formatting (ONLY ADDITION) --------------------
    private void emit(String... parts) {
        IR.add(String.join("  ", parts));
    }

    // Program scope (global)
    @Override public String visitProgramRule(MicroParser.ProgramRuleContext ctx) {
        symbolTable.enterScope("GLOBAL");
        return visit(ctx.pgm_body());
    }

    @Override public String visitPgm_body(MicroParser.Pgm_bodyContext ctx) {
        visit(ctx.decl());
        visit(ctx.func_declarations());
        return null;
    }

    @Override public String visitFunc_declarationsRule(MicroParser.Func_declarationsRuleContext ctx) {
        if (ctx.func_decl() != null) visit(ctx.func_decl());
        if (ctx.func_declarations() != null) visit(ctx.func_declarations());
        return null;
    }

    @Override public String visitString_decl(MicroParser.String_declContext ctx) {
        String name = ctx.id().getText();
        String value = ctx.str().getText();
        symbolTable.addSymbol(name, "STRING", value);
        return null;
    }

    private String currentType;

    @Override public String visitVar_decl(MicroParser.Var_declContext ctx) {
        currentType = ctx.var_type().getText();
        visit(ctx.id_list());
        return null;
    }

    @Override public String visitParam_decl(MicroParser.Param_declContext ctx) {
        currentType = ctx.var_type().getText();
        String id = ctx.id().getText();
        symbolTable.addSymbol(id, currentType);
        return null;
    }

    @Override public String visitFunc_decl(MicroParser.Func_declContext ctx) {
        String funcName = ctx.id().getText();
        emit("LABEL", funcName);
        visit(ctx.func_body());
        return null;
    }

    @Override public String visitFunc_body(MicroParser.Func_bodyContext ctx) {
        visit(ctx.decl());
        visit(ctx.stmt_list());
        return null;
    }

    @Override public String visitStmt_listRule(MicroParser.Stmt_listRuleContext ctx) {
        if (ctx.stmt() != null) visit(ctx.stmt());
        if (ctx.stmt_list() != null) visit(ctx.stmt_list());
        return null;
    }

    @Override public String visitAssign_stmt(MicroParser.Assign_stmtContext ctx) {
        return visit(ctx.assign_expr());
    }

    @Override public String visitAssign_expr(MicroParser.Assign_exprContext ctx) {
        String lhs = ctx.id().getText();
        String rhs = visit(ctx.expr());
        String type = symbolTable.getType(lhs);
        if (type == null) {
            throw new RuntimeException("Variable " + lhs + " is not declared.");
        }
        String opcode = type.equals("FLOAT") ? "STOREF" : "STOREI";
        emit(opcode, rhs, lhs);
        return null;
    }

    @Override
    public String visitExpr(MicroParser.ExprContext ctx) {
        String prefixResult = evalExprPrefix(ctx.expr_prefix());
        String termResult   = visit(ctx.term());

        if (prefixResult == null) {
            return termResult;
        }

        int sep = prefixResult.lastIndexOf(':');
        String left = prefixResult.substring(0, sep);
        String op   = prefixResult.substring(sep + 1);
        return generateBinaryOp(left, termResult, op);
    }

    private String evalExprPrefix(MicroParser.Expr_prefixContext ctx) {
        if (ctx.getChildCount() == 0) return null;

        MicroParser.ExprprefixRuleContext rule =
                (MicroParser.ExprprefixRuleContext) ctx;

        String deeperPrefix = evalExprPrefix(rule.expr_prefix());
        String termVal      = visit(rule.term());

        String combined;
        if (deeperPrefix == null) {
            combined = termVal;
        } else {
            int sep = deeperPrefix.lastIndexOf(':');
            String left = deeperPrefix.substring(0, sep);
            String op   = deeperPrefix.substring(sep + 1);
            combined = generateBinaryOp(left, termVal, op);
        }

        return combined + ":" + rule.addop().getText();
    }

    @Override
    public String visitTerm(MicroParser.TermContext ctx) {
        String prefixResult = evalFactorPrefix(ctx.factor_prefix());
        String factorResult = visit(ctx.factor());

        if (prefixResult == null) {
            return factorResult;
        }

        int sep = prefixResult.lastIndexOf(':');
        String left = prefixResult.substring(0, sep);
        String op   = prefixResult.substring(sep + 1);
        return generateBinaryOp(left, factorResult, op);
    }

    private String evalFactorPrefix(MicroParser.Factor_prefixContext ctx) {
        if (ctx.getChildCount() == 0) return null;

        MicroParser.FactorprefixRuleContext rule =
                (MicroParser.FactorprefixRuleContext) ctx;

        String deeperPrefix = evalFactorPrefix(rule.factor_prefix());
        String factorVal    = visit(rule.factor());

        String combined;
        if (deeperPrefix == null) {
            combined = factorVal;
        } else {
            int sep = deeperPrefix.lastIndexOf(':');
            String left = deeperPrefix.substring(0, sep);
            String op   = deeperPrefix.substring(sep + 1);
            combined = generateBinaryOp(left, factorVal, op);
        }

        return combined + ":" + rule.mulop().getText();
    }

    @Override public String visitFactorprefixRule(MicroParser.FactorprefixRuleContext ctx) {
        return null;
    }

    @Override public String visitPrimaryexprRule(MicroParser.PrimaryexprRuleContext ctx) {
        return visit(ctx.expr());
    }

    @Override public String visitAddopRule(MicroParser.AddopRuleContext ctx) { return ctx.getText(); }
    @Override public String visitSubopRule(MicroParser.SubopRuleContext ctx) { return ctx.getText(); }
    @Override public String visitMulopRule(MicroParser.MulopRuleContext ctx) { return ctx.getText(); }
    @Override public String visitDivopRule(MicroParser.DivopRuleContext ctx) { return ctx.getText(); }

    @Override public String visitIntliteralRule(MicroParser.IntliteralRuleContext ctx) {
        return ctx.INTLITERAL().getText();
    }

    @Override public String visitFloatliteralRule(MicroParser.FloatliteralRuleContext ctx) {
        return ctx.FLOATLITERAL().getText();
    }

    @Override public String visitIdRule(MicroParser.IdRuleContext ctx) {
        return ctx.id().getText();
    }

    @Override public String visitRead_stmt(MicroParser.Read_stmtContext ctx) {
        visitIdList(ctx.id_list(), true);
        return null;
    }

    @Override public String visitWrite_stmt(MicroParser.Write_stmtContext ctx) {
        visitIdList(ctx.id_list(), false);
        return null;
    }

    private void visitIdList(MicroParser.Id_listContext ctx, boolean isRead) {
        String idName = ctx.id().getText();

        if (idName.equals("newline")) {
            emit("WRITES", idName);
        } else {
            String type = symbolTable.getType(idName);
            String opcode;

            if (isRead) {
                opcode = type.equals("FLOAT") ? "READF" : "READI";
            } else {
                opcode = type.equals("STRING") ? "WRITES"
                       : type.equals("FLOAT")  ? "WRITEF"
                       : "WRITEI";
            }
            emit(opcode, idName);
        }

        visitIdTail(ctx.id_tail(), isRead);
    }

    private void visitIdTail(MicroParser.Id_tailContext ctx, boolean isRead) {
        if (ctx.getChildCount() == 0) return;

        String idName = ctx.getChild(1).getText();
        emitIO(idName, isRead);

        visitIdTail((MicroParser.Id_tailContext) ctx.getChild(2), isRead);
    }

    private void emitIO(String id, boolean isRead) {
        String type = symbolTable.getType(id);

        if (isRead) {
            emit(type.equals("FLOAT") ? "READF" : "READI", id);
        } else {
            if ("STRING".equals(type))     emit("WRITES", id);
            else if ("FLOAT".equals(type)) emit("WRITEF", id);
            else                           emit("WRITEI", id);
        }
    }

    @Override public String visitReturn_stmt(MicroParser.Return_stmtContext ctx) {
        String val = visit(ctx.expr());
        emit("RETURN", val);
        return null;
    }

    private String newLabel() {
        return "L" + (++labelCount);
    }

    @Override public String visitIf_stmt(MicroParser.If_stmtContext ctx) {
        boolean hasElse = ctx.else_part() != null
                && ctx.else_part().getText().length() > 0;

        String labelFalse = newLabel();
        String labelEnd   = hasElse ? newLabel() : null;

        MicroParser.CondContext c = ctx.cond();
        String left  = visit(c.expr(0));
        String right = visit(c.expr(1));
        String cmp   = c.compare().getText();

        emit(getInverseComparisonOpcode(cmp), left, right, labelFalse);

        visit(ctx.decl());
        visit(ctx.stmt_list());

        if (hasElse) {
            emit("JUMP", labelEnd);
            emit("LABEL", labelFalse);
            visit(ctx.else_part());
            emit("LABEL", labelEnd);
        } else {
            emit("LABEL", labelFalse);
        }

        return null;
    }

    private String getInverseComparisonOpcode(String cmp) {
        return switch (cmp) {
            case ">"  -> "LE";
            case "<"  -> "GE";
            case ">=" -> "LT";
            case "<=" -> "GT";
            case "="  -> "NE";
            case "!=" -> "EQ";
            default   -> throw new RuntimeException("Unknown comparison: " + cmp);
        };
    }

    @Override public String visitElse_partRule(MicroParser.Else_partRuleContext ctx) {
        visit(ctx.decl());
        visit(ctx.stmt_list());
        return null;
    }

    @Override public String visitFor_stmt(MicroParser.For_stmtContext ctx) {
        String labelStart = newLabel();
        String labelEnd   = newLabel();

        visit(ctx.init_expr());
        emit("LABEL", labelStart);

        MicroParser.CondContext c = ctx.cond();
        String left  = visit(c.expr(0));
        String right = visit(c.expr(1));
        String cmp   = c.compare().getText();

        emit(getInverseComparisonOpcode(cmp), left, right, labelEnd);

        visit(ctx.decl());
        visit(ctx.stmt_list());
        visit(ctx.incr_expr());

        emit("JUMP", labelStart);
        emit("LABEL", labelEnd);

        return null;
    }

    @Override public String visitId_list(MicroParser.Id_listContext ctx) {
        symbolTable.addSymbol(ctx.id().getText(), currentType);

        MicroParser.Id_tailContext tail = ctx.id_tail();
        while (tail instanceof MicroParser.Id_tailRuleContext) {
            MicroParser.Id_tailRuleContext cont =
                    (MicroParser.Id_tailRuleContext) tail;
            symbolTable.addSymbol(cont.id().getText(), currentType);
            tail = cont.id_tail();
        }
        return null;
    }

    private String generateBinaryOp(String left, String right, String op) {
        String type = resolveType(left, right);
        String opcode;

        switch (op) {
            case "+": opcode = type.equals("FLOAT") ? "ADDF"  : "ADDI";  break;
            case "-": opcode = type.equals("FLOAT") ? "SUBF"  : "SUBI";  break;
            case "*": opcode = type.equals("FLOAT") ? "MULTF" : "MULTI"; break;
            case "/": opcode = type.equals("FLOAT") ? "DIVF"  : "DIVI";  break;
            default: throw new RuntimeException("Unknown operator: " + op);
        }

        String temp = newTemp();
        symbolTable.addSymbol(temp, type);

        emit(opcode, left, right, temp);
        return temp;
    }

    private String operandType(String operand) {
        String declared = symbolTable.getType(operand);
        if (declared != null) return declared;
        if (operand.matches("-?\\d+\\.\\d+")) return "FLOAT";
        if (operand.matches("-?\\d+"))        return "INT";
        throw new RuntimeException("Unknown operand: " + operand);
    }

    private String resolveType(String left, String right) {
        String t1 = operandType(left);
        String t2 = operandType(right);
        return (t1.equals("FLOAT") || t2.equals("FLOAT")) ? "FLOAT" : "INT";
    }
}