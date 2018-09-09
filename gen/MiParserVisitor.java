// Generated from C:/Users/Kathe/IdeaProjects/ANTLR-Project\MiParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(MiParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(MiParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(MiParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(MiParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#formPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormPars(MiParser.FormParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#actPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActPars(MiParser.ActParsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MiParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#condTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondTerm(MiParser.CondTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#condFact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondFact(MiParser.CondFactContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MiParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(MiParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(MiParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(MiParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(MiParser.MulopContext ctx);
}