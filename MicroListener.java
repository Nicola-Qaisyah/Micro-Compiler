// Generated from Micro.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MicroParser}.
 */
public interface MicroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programRule}
	 * labeled alternative in {@link MicroParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramRule(MicroParser.ProgramRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programRule}
	 * labeled alternative in {@link MicroParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramRule(MicroParser.ProgramRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MicroParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MicroParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(MicroParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(MicroParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declRule}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclRule(MicroParser.DeclRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declRule}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclRule(MicroParser.DeclRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_declRule}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_declRule(MicroParser.Var_declRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_declRule}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_declRule(MicroParser.Var_declRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon1Rule}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon1Rule(MicroParser.Epsilon1RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon1Rule}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon1Rule(MicroParser.Epsilon1RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(MicroParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(MicroParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(MicroParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(MicroParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(MicroParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(MicroParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatRule}
	 * labeled alternative in {@link MicroParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterFloatRule(MicroParser.FloatRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatRule}
	 * labeled alternative in {@link MicroParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitFloatRule(MicroParser.FloatRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntRule}
	 * labeled alternative in {@link MicroParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterIntRule(MicroParser.IntRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntRule}
	 * labeled alternative in {@link MicroParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitIntRule(MicroParser.IntRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code any_typeRule}
	 * labeled alternative in {@link MicroParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_typeRule(MicroParser.Any_typeRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code any_typeRule}
	 * labeled alternative in {@link MicroParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_typeRule(MicroParser.Any_typeRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidRule}
	 * labeled alternative in {@link MicroParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterVoidRule(MicroParser.VoidRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidRule}
	 * labeled alternative in {@link MicroParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitVoidRule(MicroParser.VoidRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(MicroParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(MicroParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_tailRule}
	 * labeled alternative in {@link MicroParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tailRule(MicroParser.Id_tailRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_tailRule}
	 * labeled alternative in {@link MicroParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tailRule(MicroParser.Id_tailRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon2Rule}
	 * labeled alternative in {@link MicroParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon2Rule(MicroParser.Epsilon2RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon2Rule}
	 * labeled alternative in {@link MicroParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon2Rule(MicroParser.Epsilon2RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param_decl_listRule}
	 * labeled alternative in {@link MicroParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_listRule(MicroParser.Param_decl_listRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param_decl_listRule}
	 * labeled alternative in {@link MicroParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_listRule(MicroParser.Param_decl_listRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon3Rule}
	 * labeled alternative in {@link MicroParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon3Rule(MicroParser.Epsilon3RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon3Rule}
	 * labeled alternative in {@link MicroParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon3Rule(MicroParser.Epsilon3RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(MicroParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(MicroParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param_decl_tailRule}
	 * labeled alternative in {@link MicroParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tailRule(MicroParser.Param_decl_tailRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param_decl_tailRule}
	 * labeled alternative in {@link MicroParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tailRule(MicroParser.Param_decl_tailRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon4Rule}
	 * labeled alternative in {@link MicroParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon4Rule(MicroParser.Epsilon4RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon4Rule}
	 * labeled alternative in {@link MicroParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon4Rule(MicroParser.Epsilon4RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_declarationsRule}
	 * labeled alternative in {@link MicroParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarationsRule(MicroParser.Func_declarationsRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_declarationsRule}
	 * labeled alternative in {@link MicroParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarationsRule(MicroParser.Func_declarationsRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon5Rule}
	 * labeled alternative in {@link MicroParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon5Rule(MicroParser.Epsilon5RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon5Rule}
	 * labeled alternative in {@link MicroParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon5Rule(MicroParser.Epsilon5RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(MicroParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(MicroParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(MicroParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(MicroParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt_listRule}
	 * labeled alternative in {@link MicroParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_listRule(MicroParser.Stmt_listRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt_listRule}
	 * labeled alternative in {@link MicroParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_listRule(MicroParser.Stmt_listRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon6Rule}
	 * labeled alternative in {@link MicroParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon6Rule(MicroParser.Epsilon6RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon6Rule}
	 * labeled alternative in {@link MicroParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon6Rule(MicroParser.Epsilon6RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basic_stmtRule}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBasic_stmtRule(MicroParser.Basic_stmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basic_stmtRule}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBasic_stmtRule(MicroParser.Basic_stmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_stmtRule}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmtRule(MicroParser.If_stmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_stmtRule}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmtRule(MicroParser.If_stmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_stmtRule}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmtRule(MicroParser.For_stmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_stmtRule}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmtRule(MicroParser.For_stmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmtRule(MicroParser.Assign_stmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmtRule(MicroParser.Assign_stmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmtRule(MicroParser.Read_stmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmtRule(MicroParser.Read_stmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wrire_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrire_stmtRule(MicroParser.Wrire_stmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wrire_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrire_stmtRule(MicroParser.Wrire_stmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmtRule(MicroParser.Return_stmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmtRule(MicroParser.Return_stmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(MicroParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(MicroParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(MicroParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(MicroParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(MicroParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(MicroParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(MicroParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(MicroParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(MicroParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(MicroParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MicroParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MicroParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code else_partRule}
	 * labeled alternative in {@link MicroParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_partRule(MicroParser.Else_partRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code else_partRule}
	 * labeled alternative in {@link MicroParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_partRule(MicroParser.Else_partRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon7Rule}
	 * labeled alternative in {@link MicroParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon7Rule(MicroParser.Epsilon7RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon7Rule}
	 * labeled alternative in {@link MicroParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon7Rule(MicroParser.Epsilon7RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(MicroParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(MicroParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterEqualRule(MicroParser.EqualRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitEqualRule(MicroParser.EqualRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notequalRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterNotequalRule(MicroParser.NotequalRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notequalRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitNotequalRule(MicroParser.NotequalRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterequalThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterGreaterequalThanRule(MicroParser.GreaterequalThanRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterequalThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitGreaterequalThanRule(MicroParser.GreaterequalThanRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallerequalThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterSmallerequalThanRule(MicroParser.SmallerequalThanRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallerequalThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitSmallerequalThanRule(MicroParser.SmallerequalThanRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanRule(MicroParser.GreaterThanRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanRule(MicroParser.GreaterThanRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallerThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterSmallerThanRule(MicroParser.SmallerThanRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallerThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitSmallerThanRule(MicroParser.SmallerThanRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(MicroParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(MicroParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code init_exprRule}
	 * labeled alternative in {@link MicroParser#init_expr}.
	 * @param ctx the parse tree
	 */
	void enterInit_exprRule(MicroParser.Init_exprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code init_exprRule}
	 * labeled alternative in {@link MicroParser#init_expr}.
	 * @param ctx the parse tree
	 */
	void exitInit_exprRule(MicroParser.Init_exprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon8Rule}
	 * labeled alternative in {@link MicroParser#init_expr}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon8Rule(MicroParser.Epsilon8RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon8Rule}
	 * labeled alternative in {@link MicroParser#init_expr}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon8Rule(MicroParser.Epsilon8RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incr_exprRule}
	 * labeled alternative in {@link MicroParser#incr_expr}.
	 * @param ctx the parse tree
	 */
	void enterIncr_exprRule(MicroParser.Incr_exprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incr_exprRule}
	 * labeled alternative in {@link MicroParser#incr_expr}.
	 * @param ctx the parse tree
	 */
	void exitIncr_exprRule(MicroParser.Incr_exprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon9Rule}
	 * labeled alternative in {@link MicroParser#incr_expr}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon9Rule(MicroParser.Epsilon9RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon9Rule}
	 * labeled alternative in {@link MicroParser#incr_expr}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon9Rule(MicroParser.Epsilon9RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MicroParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MicroParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprprefixRule}
	 * labeled alternative in {@link MicroParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExprprefixRule(MicroParser.ExprprefixRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprprefixRule}
	 * labeled alternative in {@link MicroParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExprprefixRule(MicroParser.ExprprefixRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon10Rule}
	 * labeled alternative in {@link MicroParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon10Rule(MicroParser.Epsilon10RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon10Rule}
	 * labeled alternative in {@link MicroParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon10Rule(MicroParser.Epsilon10RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MicroParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MicroParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon11Rule}
	 * labeled alternative in {@link MicroParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon11Rule(MicroParser.Epsilon11RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon11Rule}
	 * labeled alternative in {@link MicroParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon11Rule(MicroParser.Epsilon11RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorprefixRule}
	 * labeled alternative in {@link MicroParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactorprefixRule(MicroParser.FactorprefixRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorprefixRule}
	 * labeled alternative in {@link MicroParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactorprefixRule(MicroParser.FactorprefixRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryRule}
	 * labeled alternative in {@link MicroParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryRule(MicroParser.PrimaryRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryRule}
	 * labeled alternative in {@link MicroParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryRule(MicroParser.PrimaryRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call_exprRule}
	 * labeled alternative in {@link MicroParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterCall_exprRule(MicroParser.Call_exprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call_exprRule}
	 * labeled alternative in {@link MicroParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitCall_exprRule(MicroParser.Call_exprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryexprRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryexprRule(MicroParser.PrimaryexprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryexprRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryexprRule(MicroParser.PrimaryexprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdRule(MicroParser.IdRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdRule(MicroParser.IdRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intliteralRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIntliteralRule(MicroParser.IntliteralRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intliteralRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIntliteralRule(MicroParser.IntliteralRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatliteralRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFloatliteralRule(MicroParser.FloatliteralRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatliteralRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFloatliteralRule(MicroParser.FloatliteralRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(MicroParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(MicroParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_listRule}
	 * labeled alternative in {@link MicroParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_listRule(MicroParser.Expr_listRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_listRule}
	 * labeled alternative in {@link MicroParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_listRule(MicroParser.Expr_listRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon12Rule}
	 * labeled alternative in {@link MicroParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon12Rule(MicroParser.Epsilon12RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon12Rule}
	 * labeled alternative in {@link MicroParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon12Rule(MicroParser.Epsilon12RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_list_tailRule}
	 * labeled alternative in {@link MicroParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tailRule(MicroParser.Expr_list_tailRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_list_tailRule}
	 * labeled alternative in {@link MicroParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tailRule(MicroParser.Expr_list_tailRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilon13Rule}
	 * labeled alternative in {@link MicroParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterEpsilon13Rule(MicroParser.Epsilon13RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilon13Rule}
	 * labeled alternative in {@link MicroParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitEpsilon13Rule(MicroParser.Epsilon13RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addopRule}
	 * labeled alternative in {@link MicroParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddopRule(MicroParser.AddopRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addopRule}
	 * labeled alternative in {@link MicroParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddopRule(MicroParser.AddopRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subopRule}
	 * labeled alternative in {@link MicroParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterSubopRule(MicroParser.SubopRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subopRule}
	 * labeled alternative in {@link MicroParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitSubopRule(MicroParser.SubopRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulopRule}
	 * labeled alternative in {@link MicroParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulopRule(MicroParser.MulopRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulopRule}
	 * labeled alternative in {@link MicroParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulopRule(MicroParser.MulopRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divopRule}
	 * labeled alternative in {@link MicroParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterDivopRule(MicroParser.DivopRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divopRule}
	 * labeled alternative in {@link MicroParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitDivopRule(MicroParser.DivopRuleContext ctx);
}