// Generated from C:/Users/Kathe/IdeaProjects/ANTLR-Project\MiParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiParser}.
 */
public interface MiParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(MiParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(MiParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(MiParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(MiParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(MiParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(MiParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(MiParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(MiParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#formPars}.
	 * @param ctx the parse tree
	 */
	void enterFormPars(MiParser.FormParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#formPars}.
	 * @param ctx the parse tree
	 */
	void exitFormPars(MiParser.FormParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#actPars}.
	 * @param ctx the parse tree
	 */
	void enterActPars(MiParser.ActParsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#actPars}.
	 * @param ctx the parse tree
	 */
	void exitActPars(MiParser.ActParsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MiParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MiParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#condTerm}.
	 * @param ctx the parse tree
	 */
	void enterCondTerm(MiParser.CondTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#condTerm}.
	 * @param ctx the parse tree
	 */
	void exitCondTerm(MiParser.CondTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#condFact}.
	 * @param ctx the parse tree
	 */
	void enterCondFact(MiParser.CondFactContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#condFact}.
	 * @param ctx the parse tree
	 */
	void exitCondFact(MiParser.CondFactContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(MiParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(MiParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(MiParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(MiParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(MiParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(MiParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(MiParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(MiParser.MulopContext ctx);
}