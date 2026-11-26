public class Visitor extends MicroBaseVisitor<Void> {

    public SymbolTable symbolTable = new SymbolTable();
    private int blockCounter = 1;
    private String currentType;

    public Visitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    // helper for scope naming
    private String formatScopeName(String name) {
        if (name == null || name.isEmpty()) return name;
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }

    @Override
    public Void visitProgramRule(MicroParser.ProgramRuleContext ctx) {
        symbolTable.enterScope(formatScopeName("global"));
        visit(ctx.pgm_body());
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitPgm_body(MicroParser.Pgm_bodyContext ctx) {
        visit(ctx.decl());
        visit(ctx.func_declarations());
        return null;
    }

    @Override
    public Void visitString_decl(MicroParser.String_declContext ctx) {
        String name = ctx.id().getText();
        String value = ctx.str().getText();
        symbolTable.addSymbol(name, "STRING", value);
        return null;
    }

    @Override
    public Void visitVar_decl(MicroParser.Var_declContext ctx) {
        currentType = ctx.var_type().getText();
        visit(ctx.id_list());
        return null;
    }

    @Override
    public Void visitId_list(MicroParser.Id_listContext ctx) {
        String first = ctx.id().getText();
        symbolTable.addSymbol(first, currentType);

        MicroParser.Id_tailContext tail = ctx.id_tail();

        while (tail instanceof MicroParser.Id_tailRuleContext node) {
            String id = node.id().getText();
            symbolTable.addSymbol(id, currentType);
            tail = node.id_tail();
        }

        return null;
    }

    @Override
    public Void visitParam_decl(MicroParser.Param_declContext ctx) {
        currentType = ctx.var_type().getText();
        String id = ctx.id().getText();
        symbolTable.addSymbol(id, currentType);
        return null;
    }

    @Override
    public Void visitParam_decl_tailRule(MicroParser.Param_decl_tailRuleContext ctx) {

        MicroParser.Param_decl_tailContext tail = ctx;

        while (tail instanceof MicroParser.Param_decl_tailRuleContext node) {
            MicroParser.Param_declContext param = node.param_decl();

            String type = param.var_type().getText();
            String id = param.id().getText();
            symbolTable.addSymbol(id, type);

            tail = node.param_decl_tail();
        }

        return null;
    }

    @Override
    public Void visitFunc_decl(MicroParser.Func_declContext ctx) {
        String funcName = ctx.id().getText();

        symbolTable.enterScope(formatScopeName(funcName));

        visit(ctx.param_decl_list());
        visit(ctx.func_body());

        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitFunc_body(MicroParser.Func_bodyContext ctx) {
        visit(ctx.decl());
        visit(ctx.stmt_list());
        return null;
    }

    @Override
    public Void visitIf_stmt(MicroParser.If_stmtContext ctx) {
        symbolTable.enterScope("Block #" + blockCounter++);
        visit(ctx.decl());
        visit(ctx.stmt_list());
        symbolTable.exitScope();
        visit(ctx.else_part());
        return null;
    }

    @Override
    public Void visitElse_partRule(MicroParser.Else_partRuleContext ctx) {
        symbolTable.enterScope("Block #" + blockCounter++);

        if (ctx.decl() != null) {
            visit(ctx.decl());
            visit(ctx.stmt_list());
        }

        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitFor_stmt(MicroParser.For_stmtContext ctx) {
        symbolTable.enterScope("Block #" + blockCounter++);
        visit(ctx.decl());
        visit(ctx.stmt_list());
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitRead_stmt(MicroParser.Read_stmtContext ctx) {
        return null;
    }

    @Override
    public Void visitWrite_stmt(MicroParser.Write_stmtContext ctx) {
        return null;
    }
}