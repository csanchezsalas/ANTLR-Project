// Generated from C:/Users/CHRISTIAN/IdeaProjects/Scanner1\MiParser.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link MiParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCommand(MiParser.SingleCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(MiParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(MiParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeclaration(MiParser.SingleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MiParser.DeclarationContext ctx);
}