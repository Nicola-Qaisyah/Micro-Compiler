// Generated from Micro.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MicroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MicroVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programRule}
	 * labeled alternative in {@link MicroParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramRule(MicroParser.ProgramRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MicroParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#pgm_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgm_body(MicroParser.Pgm_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declRule}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclRule(MicroParser.DeclRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_declRule}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declRule(MicroParser.Var_declRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon1Rule}
	 * labeled alternative in {@link MicroParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon1Rule(MicroParser.Epsilon1RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#string_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_decl(MicroParser.String_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(MicroParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(MicroParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatRule}
	 * labeled alternative in {@link MicroParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatRule(MicroParser.FloatRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntRule}
	 * labeled alternative in {@link MicroParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntRule(MicroParser.IntRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code any_typeRule}
	 * labeled alternative in {@link MicroParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_typeRule(MicroParser.Any_typeRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidRule}
	 * labeled alternative in {@link MicroParser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidRule(MicroParser.VoidRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(MicroParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id_tailRule}
	 * labeled alternative in {@link MicroParser#id_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_tailRule(MicroParser.Id_tailRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon2Rule}
	 * labeled alternative in {@link MicroParser#id_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon2Rule(MicroParser.Epsilon2RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param_decl_listRule}
	 * labeled alternative in {@link MicroParser#param_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_listRule(MicroParser.Param_decl_listRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon3Rule}
	 * labeled alternative in {@link MicroParser#param_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon3Rule(MicroParser.Epsilon3RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(MicroParser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param_decl_tailRule}
	 * labeled alternative in {@link MicroParser#param_decl_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_tailRule(MicroParser.Param_decl_tailRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon4Rule}
	 * labeled alternative in {@link MicroParser#param_decl_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon4Rule(MicroParser.Epsilon4RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func_declarationsRule}
	 * labeled alternative in {@link MicroParser#func_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declarationsRule(MicroParser.Func_declarationsRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon5Rule}
	 * labeled alternative in {@link MicroParser#func_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon5Rule(MicroParser.Epsilon5RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(MicroParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(MicroParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt_listRule}
	 * labeled alternative in {@link MicroParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_listRule(MicroParser.Stmt_listRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon6Rule}
	 * labeled alternative in {@link MicroParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon6Rule(MicroParser.Epsilon6RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basic_stmtRule}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_stmtRule(MicroParser.Basic_stmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_stmtRule}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmtRule(MicroParser.If_stmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_stmtRule}
	 * labeled alternative in {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmtRule(MicroParser.For_stmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmtRule(MicroParser.Assign_stmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmtRule(MicroParser.Read_stmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wrire_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrire_stmtRule(MicroParser.Wrire_stmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_stmtRule}
	 * labeled alternative in {@link MicroParser#basic_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmtRule(MicroParser.Return_stmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(MicroParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(MicroParser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(MicroParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(MicroParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(MicroParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(MicroParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code else_partRule}
	 * labeled alternative in {@link MicroParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_partRule(MicroParser.Else_partRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon7Rule}
	 * labeled alternative in {@link MicroParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon7Rule(MicroParser.Epsilon7RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(MicroParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualRule(MicroParser.EqualRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notequalRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequalRule(MicroParser.NotequalRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterequalThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterequalThanRule(MicroParser.GreaterequalThanRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallerequalThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerequalThanRule(MicroParser.SmallerequalThanRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanRule(MicroParser.GreaterThanRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallerThanRule}
	 * labeled alternative in {@link MicroParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerThanRule(MicroParser.SmallerThanRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(MicroParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code init_exprRule}
	 * labeled alternative in {@link MicroParser#init_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_exprRule(MicroParser.Init_exprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon8Rule}
	 * labeled alternative in {@link MicroParser#init_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon8Rule(MicroParser.Epsilon8RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incr_exprRule}
	 * labeled alternative in {@link MicroParser#incr_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncr_exprRule(MicroParser.Incr_exprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon9Rule}
	 * labeled alternative in {@link MicroParser#incr_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon9Rule(MicroParser.Epsilon9RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MicroParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprprefixRule}
	 * labeled alternative in {@link MicroParser#expr_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprprefixRule(MicroParser.ExprprefixRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon10Rule}
	 * labeled alternative in {@link MicroParser#expr_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon10Rule(MicroParser.Epsilon10RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MicroParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon11Rule}
	 * labeled alternative in {@link MicroParser#factor_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon11Rule(MicroParser.Epsilon11RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorprefixRule}
	 * labeled alternative in {@link MicroParser#factor_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorprefixRule(MicroParser.FactorprefixRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryRule}
	 * labeled alternative in {@link MicroParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryRule(MicroParser.PrimaryRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call_exprRule}
	 * labeled alternative in {@link MicroParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_exprRule(MicroParser.Call_exprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryexprRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryexprRule(MicroParser.PrimaryexprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdRule(MicroParser.IdRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intliteralRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntliteralRule(MicroParser.IntliteralRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatliteralRule}
	 * labeled alternative in {@link MicroParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatliteralRule(MicroParser.FloatliteralRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroParser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(MicroParser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_listRule}
	 * labeled alternative in {@link MicroParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_listRule(MicroParser.Expr_listRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon12Rule}
	 * labeled alternative in {@link MicroParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon12Rule(MicroParser.Epsilon12RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_list_tailRule}
	 * labeled alternative in {@link MicroParser#expr_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_tailRule(MicroParser.Expr_list_tailRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilon13Rule}
	 * labeled alternative in {@link MicroParser#expr_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilon13Rule(MicroParser.Epsilon13RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addopRule}
	 * labeled alternative in {@link MicroParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddopRule(MicroParser.AddopRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subopRule}
	 * labeled alternative in {@link MicroParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubopRule(MicroParser.SubopRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulopRule}
	 * labeled alternative in {@link MicroParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulopRule(MicroParser.MulopRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divopRule}
	 * labeled alternative in {@link MicroParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivopRule(MicroParser.DivopRuleContext ctx);
}