// Generated from C:/Users/CHRISTIAN/IdeaProjects/Scanner1\MiParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PYC=1, PLUS=2, MINUS=3, MULT=4, DIV=5, COLON=6, IF=7, THEN=8, ELSE=9, 
		WHILE=10, LET=11, BEGIN=12, END=13, IN=14, DO=15, CONST=16, VAR=17, SYMBOL1=18, 
		PARENTHESIS_OPEN=19, PARENTHESIS_CLOSED=20, ASSIGN=21, ID=22, NUMBER=23, 
		WS=24;
	public static final int
		RULE_program = 0, RULE_singleCommand = 1, RULE_command = 2, RULE_expression = 3, 
		RULE_primaryExpression = 4, RULE_singleDeclaration = 5, RULE_declaration = 6;
	public static final String[] ruleNames = {
		"program", "singleCommand", "command", "expression", "primaryExpression", 
		"singleDeclaration", "declaration"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'+'", "'-'", "'*'", "'/'", "':'", "'if'", "'then'", "'else'", 
		"'while'", "'let'", "'begin'", "'end'", "'in'", "'do'", "'const'", "'var'", 
		"'~'", "'('", "')'", "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PYC", "PLUS", "MINUS", "MULT", "DIV", "COLON", "IF", "THEN", "ELSE", 
		"WHILE", "LET", "BEGIN", "END", "IN", "DO", "CONST", "VAR", "SYMBOL1", 
		"PARENTHESIS_OPEN", "PARENTHESIS_CLOSED", "ASSIGN", "ID", "NUMBER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			singleCommand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTHESIS_OPEN() { return getToken(MiParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSED() { return getToken(MiParser.PARENTHESIS_CLOSED, 0); }
		public TerminalNode IF() { return getToken(MiParser.IF, 0); }
		public TerminalNode THEN() { return getToken(MiParser.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(MiParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(MiParser.DO, 0); }
		public TerminalNode LET() { return getToken(MiParser.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(MiParser.IN, 0); }
		public TerminalNode BEGIN() { return getToken(MiParser.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(MiParser.END, 0); }
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleCommand);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(16);
				match(ID);
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					{
					setState(17);
					match(ASSIGN);
					setState(18);
					expression();
					}
					}
					break;
				case PARENTHESIS_OPEN:
					{
					{
					setState(19);
					match(PARENTHESIS_OPEN);
					setState(20);
					expression();
					setState(21);
					match(PARENTHESIS_CLOSED);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(25);
				match(IF);
				setState(26);
				expression();
				setState(27);
				match(THEN);
				setState(28);
				singleCommand();
				setState(29);
				match(ELSE);
				setState(30);
				singleCommand();
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(32);
				match(WHILE);
				setState(33);
				expression();
				setState(34);
				match(DO);
				setState(35);
				singleCommand();
				}
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(37);
				match(LET);
				setState(38);
				declaration();
				setState(39);
				match(IN);
				setState(40);
				singleCommand();
				}
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(42);
				match(BEGIN);
				setState(43);
				command();
				setState(44);
				match(END);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> PYC() { return getTokens(MiParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(MiParser.PYC, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			singleCommand();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PYC) {
				{
				{
				setState(49);
				match(PYC);
				setState(50);
				singleCommand();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MiParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MiParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(MiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiParser.ID, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MiParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MiParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MiParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MiParser.MINUS, i);
		}
		public List<TerminalNode> MULT() { return getTokens(MiParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(MiParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(MiParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MiParser.DIV, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			primaryExpression();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << ID))) != 0)) {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case MULT:
				case DIV:
					{
					setState(57);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(58);
					match(NUMBER);
					}
					break;
				case ID:
					{
					setState(59);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MiParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(MiParser.ID, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(MiParser.PARENTHESIS_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSED() { return getToken(MiParser.PARENTHESIS_CLOSED, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primaryExpression);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(ID);
				}
				break;
			case PARENTHESIS_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(PARENTHESIS_OPEN);
				setState(68);
				expression();
				setState(69);
				match(PARENTHESIS_CLOSED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(MiParser.CONST, 0); }
		public List<TerminalNode> ID() { return getTokens(MiParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiParser.ID, i);
		}
		public TerminalNode SYMBOL1() { return getToken(MiParser.SYMBOL1, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MiParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(MiParser.COLON, 0); }
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitSingleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDeclaration);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(73);
				match(CONST);
				setState(74);
				match(ID);
				setState(75);
				match(SYMBOL1);
				setState(76);
				expression();
				}
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(77);
				match(VAR);
				setState(78);
				match(ID);
				setState(79);
				match(COLON);
				setState(80);
				match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> PYC() { return getTokens(MiParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(MiParser.PYC, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			singleDeclaration();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PYC) {
				{
				{
				setState(84);
				match(PYC);
				setState(85);
				singleDeclaration();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\32\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3\4\7\4\66\n\4\f"+
		"\4\16\49\13\4\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7\3\b\3\b\3\b"+
		"\7\bY\n\b\f\b\16\b\\\13\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\4\7\2b\2\20"+
		"\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b:\3\2\2\2\nI\3\2\2\2\fS\3\2\2\2\16"+
		"U\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\31\7\30\2\2\23\24\7\27\2\2\24"+
		"\32\5\b\5\2\25\26\7\25\2\2\26\27\5\b\5\2\27\30\7\26\2\2\30\32\3\2\2\2"+
		"\31\23\3\2\2\2\31\25\3\2\2\2\32\61\3\2\2\2\33\34\7\t\2\2\34\35\5\b\5\2"+
		"\35\36\7\n\2\2\36\37\5\4\3\2\37 \7\13\2\2 !\5\4\3\2!\61\3\2\2\2\"#\7\f"+
		"\2\2#$\5\b\5\2$%\7\21\2\2%&\5\4\3\2&\61\3\2\2\2\'(\7\r\2\2()\5\16\b\2"+
		")*\7\20\2\2*+\5\4\3\2+\61\3\2\2\2,-\7\16\2\2-.\5\6\4\2./\7\17\2\2/\61"+
		"\3\2\2\2\60\22\3\2\2\2\60\33\3\2\2\2\60\"\3\2\2\2\60\'\3\2\2\2\60,\3\2"+
		"\2\2\61\5\3\2\2\2\62\67\5\4\3\2\63\64\7\3\2\2\64\66\5\4\3\2\65\63\3\2"+
		"\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29\67\3\2\2\2:@\5"+
		"\n\6\2;<\t\2\2\2<?\7\31\2\2=?\7\30\2\2>;\3\2\2\2>=\3\2\2\2?B\3\2\2\2@"+
		">\3\2\2\2@A\3\2\2\2A\t\3\2\2\2B@\3\2\2\2CJ\7\31\2\2DJ\7\30\2\2EF\7\25"+
		"\2\2FG\5\b\5\2GH\7\26\2\2HJ\3\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2J\13"+
		"\3\2\2\2KL\7\22\2\2LM\7\30\2\2MN\7\24\2\2NT\5\b\5\2OP\7\23\2\2PQ\7\30"+
		"\2\2QR\7\b\2\2RT\7\30\2\2SK\3\2\2\2SO\3\2\2\2T\r\3\2\2\2UZ\5\f\7\2VW\7"+
		"\3\2\2WY\5\f\7\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\17\3\2\2\2"+
		"\\Z\3\2\2\2\n\31\60\67>@ISZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}