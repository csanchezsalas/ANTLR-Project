// Generated from C:/Users/Kathe/IdeaProjects/ANTLR-Project\MiParser.g4 by ANTLR 4.7
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
		WS=1, COMMENT=2, LINE_COMMENT=3, COMMENT2=4, IF=5, ELSE=6, BREAK=7, CLASS=8, 
		CONST=9, NEW=10, READ=11, RETURN=12, VOID=13, WHILE=14, WRITE=15, FOR=16, 
		NUMBER=17, IDENT=18, LETTER=19, FLOAT=20, PRINTABLECHAR=21, CHARCONST=22, 
		STRING=23, BOOL=24, SUMA=25, SUMAS=26, RESTA=27, RESTAS=28, MULT=29, SLASH=30, 
		PORC=31, IGUAL=32, IGUALES=33, DIFERENTE=34, MAYOR=35, MAY_IGUAL=36, MENOR=37, 
		MEN_IGUAL=38, AND=39, OR=40, PYC=41, COMA=42, PUNTO=43, PARENT_ABIERTO=44, 
		PARENT_CERRADO=45, LLAVE_ABIERTA=46, LLAVE_CERRADA=47, CURLY_ABIERTO=48, 
		CURLY_CERRADO=49;
	public static final int
		RULE_program = 0, RULE_constDecl = 1, RULE_varDecl = 2, RULE_classDecl = 3, 
		RULE_methodDecl = 4, RULE_formPars = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_block = 8, RULE_actPars = 9, RULE_condition = 10, RULE_condTerm = 11, 
		RULE_condFact = 12, RULE_expr = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_designator = 16, RULE_relop = 17, RULE_addop = 18, RULE_mulop = 19;
	public static final String[] ruleNames = {
		"program", "constDecl", "varDecl", "classDecl", "methodDecl", "formPars", 
		"type", "statement", "block", "actPars", "condition", "condTerm", "condFact", 
		"expr", "term", "factor", "designator", "relop", "addop", "mulop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'if'", "'else'", "'break'", "'class'", 
		"'const'", "'new'", "'read'", "'return'", "'void'", "'while'", "'write'", 
		"'for'", null, null, null, null, null, null, null, null, "'+'", "'++'", 
		"'-'", "'--'", "'*'", "'/'", "'%'", "'='", "'=='", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'&&'", "'||'", "';'", "','", "'.'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LINE_COMMENT", "COMMENT2", "IF", "ELSE", "BREAK", 
		"CLASS", "CONST", "NEW", "READ", "RETURN", "VOID", "WHILE", "WRITE", "FOR", 
		"NUMBER", "IDENT", "LETTER", "FLOAT", "PRINTABLECHAR", "CHARCONST", "STRING", 
		"BOOL", "SUMA", "SUMAS", "RESTA", "RESTAS", "MULT", "SLASH", "PORC", "IGUAL", 
		"IGUALES", "DIFERENTE", "MAYOR", "MAY_IGUAL", "MENOR", "MEN_IGUAL", "AND", 
		"OR", "PYC", "COMA", "PUNTO", "PARENT_ABIERTO", "PARENT_CERRADO", "LLAVE_ABIERTA", 
		"LLAVE_CERRADA", "CURLY_ABIERTO", "CURLY_CERRADO"
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public TerminalNode CLASS() { return getToken(MiParser.CLASS, 0); }
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public TerminalNode CURLY_ABIERTO() { return getToken(MiParser.CURLY_ABIERTO, 0); }
		public TerminalNode CURLY_CERRADO() { return getToken(MiParser.CURLY_CERRADO, 0); }
		public TerminalNode EOF() { return getToken(MiParser.EOF, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(CLASS);
			setState(41);
			match(IDENT);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << CONST) | (1L << IDENT))) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(42);
					constDecl();
					}
					break;
				case IDENT:
					{
					setState(43);
					varDecl();
					}
					break;
				case CLASS:
					{
					setState(44);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(CURLY_ABIERTO);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==IDENT) {
				{
				{
				setState(51);
				methodDecl();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(CURLY_CERRADO);
			setState(58);
			match(EOF);
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

	public static class ConstDeclContext extends ParserRuleContext {
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
	 
		public ConstDeclContext() { }
		public void copyFrom(ConstDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstDASTContext extends ConstDeclContext {
		public TerminalNode CONST() { return getToken(MiParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public TerminalNode IGUAL() { return getToken(MiParser.IGUAL, 0); }
		public TerminalNode PYC() { return getToken(MiParser.PYC, 0); }
		public TerminalNode NUMBER() { return getToken(MiParser.NUMBER, 0); }
		public TerminalNode CHARCONST() { return getToken(MiParser.CHARCONST, 0); }
		public ConstDASTContext(ConstDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitConstDAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constDecl);
		int _la;
		try {
			_localctx = new ConstDASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CONST);
			setState(61);
			type();
			setState(62);
			match(IDENT);
			setState(63);
			match(IGUAL);
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==CHARCONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(PYC);
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

	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDASTContext extends VarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiParser.IDENT, i);
		}
		public TerminalNode PYC() { return getToken(MiParser.PYC, 0); }
		public List<TerminalNode> COMA() { return getTokens(MiParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiParser.COMA, i);
		}
		public VarDASTContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitVarDAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			_localctx = new VarDASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			type();
			setState(68);
			match(IDENT);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(69);
				match(COMA);
				setState(70);
				match(IDENT);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(PYC);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
	 
		public ClassDeclContext() { }
		public void copyFrom(ClassDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDASTContext extends ClassDeclContext {
		public TerminalNode CLASS() { return getToken(MiParser.CLASS, 0); }
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public TerminalNode CURLY_ABIERTO() { return getToken(MiParser.CURLY_ABIERTO, 0); }
		public TerminalNode CURLY_CERRADO() { return getToken(MiParser.CURLY_CERRADO, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ClassDASTContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitClassDAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDecl);
		int _la;
		try {
			_localctx = new ClassDASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(CLASS);
			setState(79);
			match(IDENT);
			setState(80);
			match(CURLY_ABIERTO);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(81);
				varDecl();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(CURLY_CERRADO);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	 
		public MethodDeclContext() { }
		public void copyFrom(MethodDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDASTContext extends MethodDeclContext {
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public TerminalNode PARENT_ABIERTO() { return getToken(MiParser.PARENT_ABIERTO, 0); }
		public TerminalNode PARENT_CERRADO() { return getToken(MiParser.PARENT_CERRADO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(MiParser.VOID, 0); }
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public MethodDASTContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMethodDAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			_localctx = new MethodDASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(89);
				type();
				}
				break;
			case VOID:
				{
				setState(90);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			match(IDENT);
			setState(94);
			match(PARENT_ABIERTO);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(95);
				formPars();
				}
			}

			setState(98);
			match(PARENT_CERRADO);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(99);
				varDecl();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			block();
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

	public static class FormParsContext extends ParserRuleContext {
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
	 
		public FormParsContext() { }
		public void copyFrom(FormParsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormPASTContext extends FormParsContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiParser.IDENT, i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiParser.COMA, i);
		}
		public FormPASTContext(FormParsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitFormPAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formPars);
		int _la;
		try {
			_localctx = new FormPASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			type();
			setState(108);
			match(IDENT);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(109);
				match(COMA);
				setState(110);
				type();
				setState(111);
				match(IDENT);
				}
				}
				setState(117);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeASTContext extends TypeContext {
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public TerminalNode LLAVE_ABIERTA() { return getToken(MiParser.LLAVE_ABIERTA, 0); }
		public TerminalNode LLAVE_CERRADA() { return getToken(MiParser.LLAVE_CERRADA, 0); }
		public TypeASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			_localctx = new TypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENT);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LLAVE_ABIERTA) {
				{
				setState(119);
				match(LLAVE_ABIERTA);
				setState(120);
				match(LLAVE_CERRADA);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadStatASTContext extends StatementContext {
		public TerminalNode READ() { return getToken(MiParser.READ, 0); }
		public TerminalNode PARENT_ABIERTO() { return getToken(MiParser.PARENT_ABIERTO, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PARENT_CERRADO() { return getToken(MiParser.PARENT_CERRADO, 0); }
		public TerminalNode PYC() { return getToken(MiParser.PYC, 0); }
		public ReadStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitReadStatAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatASTContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MiParser.RETURN, 0); }
		public TerminalNode PYC() { return getToken(MiParser.PYC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitReturnStatAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PycStatASTContext extends StatementContext {
		public TerminalNode PYC() { return getToken(MiParser.PYC, 0); }
		public PycStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitPycStatAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatASTContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MiParser.WHILE, 0); }
		public TerminalNode PARENT_ABIERTO() { return getToken(MiParser.PARENT_ABIERTO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARENT_CERRADO() { return getToken(MiParser.PARENT_CERRADO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitWhileStatAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteStatASTContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(MiParser.WRITE, 0); }
		public TerminalNode PARENT_ABIERTO() { return getToken(MiParser.PARENT_ABIERTO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENT_CERRADO() { return getToken(MiParser.PARENT_CERRADO, 0); }
		public TerminalNode PYC() { return getToken(MiParser.PYC, 0); }
		public TerminalNode COMA() { return getToken(MiParser.COMA, 0); }
		public TerminalNode NUMBER() { return getToken(MiParser.NUMBER, 0); }
		public WriteStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitWriteStatAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesignatorStatASTContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PYC() { return getToken(MiParser.PYC, 0); }
		public TerminalNode IGUAL() { return getToken(MiParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENT_ABIERTO() { return getToken(MiParser.PARENT_ABIERTO, 0); }
		public TerminalNode PARENT_CERRADO() { return getToken(MiParser.PARENT_CERRADO, 0); }
		public TerminalNode SUMAS() { return getToken(MiParser.SUMAS, 0); }
		public TerminalNode RESTAS() { return getToken(MiParser.RESTAS, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public DesignatorStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitDesignatorStatAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatASTContext extends StatementContext {
		public TerminalNode IF() { return getToken(MiParser.IF, 0); }
		public TerminalNode PARENT_ABIERTO() { return getToken(MiParser.PARENT_ABIERTO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PARENT_CERRADO() { return getToken(MiParser.PARENT_CERRADO, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiParser.ELSE, 0); }
		public IfStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitIfStatAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatASTContext extends StatementContext {
		public TerminalNode FOR() { return getToken(MiParser.FOR, 0); }
		public TerminalNode PARENT_ABIERTO() { return getToken(MiParser.PARENT_ABIERTO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(MiParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(MiParser.PYC, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitForStatAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatASTContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitBlockStatAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatASTContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MiParser.BREAK, 0); }
		public TerminalNode PYC() { return getToken(MiParser.PYC, 0); }
		public BreakStatASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitBreakStatAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new DesignatorStatASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				designator();
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IGUAL:
					{
					setState(124);
					match(IGUAL);
					setState(125);
					expr();
					}
					break;
				case PARENT_ABIERTO:
					{
					setState(126);
					match(PARENT_ABIERTO);
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NUMBER) | (1L << IDENT) | (1L << CHARCONST) | (1L << BOOL) | (1L << RESTA) | (1L << PARENT_ABIERTO))) != 0)) {
						{
						setState(127);
						actPars();
						}
					}

					setState(130);
					match(PARENT_CERRADO);
					}
					break;
				case SUMAS:
					{
					setState(131);
					match(SUMAS);
					}
					break;
				case RESTAS:
					{
					setState(132);
					match(RESTAS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				match(PYC);
				}
				break;
			case IF:
				_localctx = new IfStatASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(137);
				match(IF);
				setState(138);
				match(PARENT_ABIERTO);
				setState(139);
				condition();
				setState(140);
				match(PARENT_CERRADO);
				setState(141);
				statement();
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(142);
					match(ELSE);
					setState(143);
					statement();
					}
					break;
				}
				}
				}
				break;
			case FOR:
				_localctx = new ForStatASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(146);
				match(FOR);
				setState(147);
				match(PARENT_ABIERTO);
				setState(148);
				expr();
				setState(149);
				match(PYC);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NUMBER) | (1L << IDENT) | (1L << CHARCONST) | (1L << BOOL) | (1L << RESTA) | (1L << PARENT_ABIERTO))) != 0)) {
					{
					setState(150);
					condition();
					}
				}

				setState(153);
				match(PYC);
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(154);
					statement();
					}
					break;
				}
				setState(157);
				statement();
				}
				}
				break;
			case WHILE:
				_localctx = new WhileStatASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(159);
				match(WHILE);
				setState(160);
				match(PARENT_ABIERTO);
				setState(161);
				condition();
				setState(162);
				match(PARENT_CERRADO);
				setState(163);
				statement();
				}
				}
				break;
			case BREAK:
				_localctx = new BreakStatASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(165);
				match(BREAK);
				setState(166);
				match(PYC);
				}
				}
				break;
			case RETURN:
				_localctx = new ReturnStatASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(167);
				match(RETURN);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NUMBER) | (1L << IDENT) | (1L << CHARCONST) | (1L << BOOL) | (1L << RESTA) | (1L << PARENT_ABIERTO))) != 0)) {
					{
					setState(168);
					expr();
					}
				}

				setState(171);
				match(PYC);
				}
				}
				break;
			case READ:
				_localctx = new ReadStatASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(172);
				match(READ);
				setState(173);
				match(PARENT_ABIERTO);
				setState(174);
				designator();
				setState(175);
				match(PARENT_CERRADO);
				setState(176);
				match(PYC);
				}
				}
				break;
			case WRITE:
				_localctx = new WriteStatASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(178);
				match(WRITE);
				setState(179);
				match(PARENT_ABIERTO);
				setState(180);
				expr();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(181);
					match(COMA);
					setState(182);
					match(NUMBER);
					}
				}

				setState(185);
				match(PARENT_CERRADO);
				setState(186);
				match(PYC);
				}
				}
				break;
			case CURLY_ABIERTO:
				_localctx = new BlockStatASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				block();
				}
				break;
			case PYC:
				_localctx = new PycStatASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(189);
				match(PYC);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockASTContext extends BlockContext {
		public TerminalNode CURLY_ABIERTO() { return getToken(MiParser.CURLY_ABIERTO, 0); }
		public TerminalNode CURLY_CERRADO() { return getToken(MiParser.CURLY_CERRADO, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockASTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitBlockAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			_localctx = new BlockASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(CURLY_ABIERTO);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << BREAK) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << WRITE) | (1L << FOR) | (1L << IDENT) | (1L << PYC) | (1L << CURLY_ABIERTO))) != 0)) {
				{
				{
				setState(193);
				statement();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(CURLY_CERRADO);
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

	public static class ActParsContext extends ParserRuleContext {
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
	 
		public ActParsContext() { }
		public void copyFrom(ActParsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActParsASTContext extends ActParsContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiParser.COMA, i);
		}
		public ActParsASTContext(ActParsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitActParsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actPars);
		int _la;
		try {
			_localctx = new ActParsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			expr();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(202);
				match(COMA);
				setState(203);
				expr();
				}
				}
				setState(208);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionASTContext extends ConditionContext {
		public List<CondTermContext> condTerm() {
			return getRuleContexts(CondTermContext.class);
		}
		public CondTermContext condTerm(int i) {
			return getRuleContext(CondTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MiParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MiParser.OR, i);
		}
		public ConditionASTContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitConditionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			_localctx = new ConditionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			condTerm();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(210);
				match(OR);
				setState(211);
				condTerm();
				}
				}
				setState(216);
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

	public static class CondTermContext extends ParserRuleContext {
		public CondTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condTerm; }
	 
		public CondTermContext() { }
		public void copyFrom(CondTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondTermASTContext extends CondTermContext {
		public List<CondFactContext> condFact() {
			return getRuleContexts(CondFactContext.class);
		}
		public CondFactContext condFact(int i) {
			return getRuleContext(CondFactContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MiParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MiParser.AND, i);
		}
		public CondTermASTContext(CondTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCondTermAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondTermContext condTerm() throws RecognitionException {
		CondTermContext _localctx = new CondTermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condTerm);
		int _la;
		try {
			_localctx = new CondTermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			condFact();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(218);
				match(AND);
				setState(219);
				condFact();
				}
				}
				setState(224);
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

	public static class CondFactContext extends ParserRuleContext {
		public CondFactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condFact; }
	 
		public CondFactContext() { }
		public void copyFrom(CondFactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondFactASTContext extends CondFactContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondFactASTContext(CondFactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCondFactAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondFactContext condFact() throws RecognitionException {
		CondFactContext _localctx = new CondFactContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condFact);
		try {
			_localctx = new CondFactASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expr();
			setState(226);
			relop();
			setState(227);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprASTContext extends ExprContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode RESTA() { return getToken(MiParser.RESTA, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExprASTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitExprAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			_localctx = new ExprASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTA) {
				{
				setState(229);
				match(RESTA);
				}
			}

			setState(232);
			term();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				{
				setState(233);
				addop();
				setState(234);
				term();
				}
				}
				setState(240);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermASTContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermASTContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitTermAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			_localctx = new TermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			factor();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << SLASH) | (1L << PORC))) != 0)) {
				{
				{
				setState(242);
				mulop();
				setState(243);
				factor();
				}
				}
				setState(249);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolFactorASTContext extends FactorContext {
		public TerminalNode BOOL() { return getToken(MiParser.BOOL, 0); }
		public BoolFactorASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitBoolFactorAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewFactorASTContext extends FactorContext {
		public TerminalNode NEW() { return getToken(MiParser.NEW, 0); }
		public TerminalNode IDENT() { return getToken(MiParser.IDENT, 0); }
		public NewFactorASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitNewFactorAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesignatorFactorASTContext extends FactorContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PARENT_ABIERTO() { return getToken(MiParser.PARENT_ABIERTO, 0); }
		public TerminalNode PARENT_CERRADO() { return getToken(MiParser.PARENT_CERRADO, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public DesignatorFactorASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitDesignatorFactorAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberFactorASTContext extends FactorContext {
		public TerminalNode NUMBER() { return getToken(MiParser.NUMBER, 0); }
		public NumberFactorASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitNumberFactorAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentFactorASTContext extends FactorContext {
		public TerminalNode PARENT_ABIERTO() { return getToken(MiParser.PARENT_ABIERTO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENT_CERRADO() { return getToken(MiParser.PARENT_CERRADO, 0); }
		public TerminalNode PUNTO() { return getToken(MiParser.PUNTO, 0); }
		public ParentFactorASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitParentFactorAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharconsFactorASTContext extends FactorContext {
		public TerminalNode CHARCONST() { return getToken(MiParser.CHARCONST, 0); }
		public CharconsFactorASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitCharconsFactorAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new DesignatorFactorASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				designator();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENT_ABIERTO) {
					{
					setState(251);
					match(PARENT_ABIERTO);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NUMBER) | (1L << IDENT) | (1L << CHARCONST) | (1L << BOOL) | (1L << RESTA) | (1L << PARENT_ABIERTO))) != 0)) {
						{
						setState(252);
						actPars();
						}
					}

					setState(255);
					match(PARENT_CERRADO);
					}
				}

				}
				break;
			case NUMBER:
				_localctx = new NumberFactorASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(NUMBER);
				}
				break;
			case CHARCONST:
				_localctx = new CharconsFactorASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(CHARCONST);
				}
				break;
			case BOOL:
				_localctx = new BoolFactorASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(BOOL);
				}
				break;
			case NEW:
				_localctx = new NewFactorASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				match(NEW);
				setState(262);
				match(IDENT);
				}
				break;
			case PARENT_ABIERTO:
				_localctx = new ParentFactorASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(263);
				match(PARENT_ABIERTO);
				setState(264);
				expr();
				setState(265);
				match(PARENT_CERRADO);
				setState(266);
				match(PUNTO);
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

	public static class DesignatorContext extends ParserRuleContext {
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	 
		public DesignatorContext() { }
		public void copyFrom(DesignatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DesignatorASTContext extends DesignatorContext {
		public List<TerminalNode> IDENT() { return getTokens(MiParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiParser.IDENT, i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(MiParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(MiParser.PUNTO, i);
		}
		public List<TerminalNode> LLAVE_ABIERTA() { return getTokens(MiParser.LLAVE_ABIERTA); }
		public TerminalNode LLAVE_ABIERTA(int i) {
			return getToken(MiParser.LLAVE_ABIERTA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LLAVE_CERRADA() { return getTokens(MiParser.LLAVE_CERRADA); }
		public TerminalNode LLAVE_CERRADA(int i) {
			return getToken(MiParser.LLAVE_CERRADA, i);
		}
		public DesignatorASTContext(DesignatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitDesignatorAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_designator);
		int _la;
		try {
			_localctx = new DesignatorASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(IDENT);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO || _la==LLAVE_ABIERTA) {
				{
				setState(277);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUNTO:
					{
					setState(271);
					match(PUNTO);
					setState(272);
					match(IDENT);
					}
					break;
				case LLAVE_ABIERTA:
					{
					setState(273);
					match(LLAVE_ABIERTA);
					setState(274);
					expr();
					setState(275);
					match(LLAVE_CERRADA);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(281);
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

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	 
		public RelopContext() { }
		public void copyFrom(RelopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MayorRelopASTContext extends RelopContext {
		public TerminalNode MAYOR() { return getToken(MiParser.MAYOR, 0); }
		public MayorRelopASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMayorRelopAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayigualRelopASTContext extends RelopContext {
		public TerminalNode MAY_IGUAL() { return getToken(MiParser.MAY_IGUAL, 0); }
		public MayigualRelopASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMayigualRelopAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorRelopASTContext extends RelopContext {
		public TerminalNode MENOR() { return getToken(MiParser.MENOR, 0); }
		public MenorRelopASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMenorRelopAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiferenteRelopASTContext extends RelopContext {
		public TerminalNode DIFERENTE() { return getToken(MiParser.DIFERENTE, 0); }
		public DiferenteRelopASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitDiferenteRelopAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualesRelopASTContext extends RelopContext {
		public TerminalNode IGUALES() { return getToken(MiParser.IGUALES, 0); }
		public IgualesRelopASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitIgualesRelopAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenigualRelopASTContext extends RelopContext {
		public TerminalNode MEN_IGUAL() { return getToken(MiParser.MEN_IGUAL, 0); }
		public MenigualRelopASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMenigualRelopAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relop);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUALES:
				_localctx = new IgualesRelopASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(IGUALES);
				}
				break;
			case DIFERENTE:
				_localctx = new DiferenteRelopASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(DIFERENTE);
				}
				break;
			case MAYOR:
				_localctx = new MayorRelopASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(MAYOR);
				}
				break;
			case MAY_IGUAL:
				_localctx = new MayigualRelopASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(MAY_IGUAL);
				}
				break;
			case MENOR:
				_localctx = new MenorRelopASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(MENOR);
				}
				break;
			case MEN_IGUAL:
				_localctx = new MenigualRelopASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(MEN_IGUAL);
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
	 
		public AddopContext() { }
		public void copyFrom(AddopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumaAddopASTContext extends AddopContext {
		public TerminalNode SUMA() { return getToken(MiParser.SUMA, 0); }
		public SumaAddopASTContext(AddopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitSumaAddopAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RestaAddopASTContext extends AddopContext {
		public TerminalNode RESTA() { return getToken(MiParser.RESTA, 0); }
		public RestaAddopASTContext(AddopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitRestaAddopAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addop);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				_localctx = new SumaAddopASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(SUMA);
				}
				break;
			case RESTA:
				_localctx = new RestaAddopASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(RESTA);
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	 
		public MulopContext() { }
		public void copyFrom(MulopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PorcMulopASTContext extends MulopContext {
		public TerminalNode PORC() { return getToken(MiParser.PORC, 0); }
		public PorcMulopASTContext(MulopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitPorcMulopAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SlashMulopASTContext extends MulopContext {
		public TerminalNode SLASH() { return getToken(MiParser.SLASH, 0); }
		public SlashMulopASTContext(MulopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitSlashMulopAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultMulopASTContext extends MulopContext {
		public TerminalNode MULT() { return getToken(MiParser.MULT, 0); }
		public MultMulopASTContext(MulopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserVisitor ) return ((MiParserVisitor<? extends T>)visitor).visitMultMulopAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mulop);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MultMulopASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(MULT);
				}
				break;
			case SLASH:
				_localctx = new SlashMulopASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(SLASH);
				}
				break;
			case PORC:
				_localctx = new PorcMulopASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(PORC);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u012e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\5"+
		"\6c\n\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7t\n\7\f\7\16\7w\13\7\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0083\n\t\3\t\3\t\3\t\5\t\u0088\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0093\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\5\t\u009e"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00c1\n\t\3\n\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\7\13\u00cf\n\13\f\13\16\13\u00d2\13\13\3\f\3\f\3\f\7"+
		"\f\u00d7\n\f\f\f\16\f\u00da\13\f\3\r\3\r\3\r\7\r\u00df\n\r\f\r\16\r\u00e2"+
		"\13\r\3\16\3\16\3\16\3\16\3\17\5\17\u00e9\n\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00ef\n\17\f\17\16\17\u00f2\13\17\3\20\3\20\3\20\3\20\7\20\u00f8\n\20"+
		"\f\20\16\20\u00fb\13\20\3\21\3\21\3\21\5\21\u0100\n\21\3\21\5\21\u0103"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010f\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0118\n\22\f\22\16\22\u011b\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0123\n\23\3\24\3\24\5\24\u0127"+
		"\n\24\3\25\3\25\3\25\5\25\u012c\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\3\4\2\23\23\30\30\2\u014e\2*\3\2\2\2\4>\3\2"+
		"\2\2\6E\3\2\2\2\bP\3\2\2\2\n]\3\2\2\2\fm\3\2\2\2\16x\3\2\2\2\20\u00c0"+
		"\3\2\2\2\22\u00c2\3\2\2\2\24\u00cb\3\2\2\2\26\u00d3\3\2\2\2\30\u00db\3"+
		"\2\2\2\32\u00e3\3\2\2\2\34\u00e8\3\2\2\2\36\u00f3\3\2\2\2 \u010e\3\2\2"+
		"\2\"\u0110\3\2\2\2$\u0122\3\2\2\2&\u0126\3\2\2\2(\u012b\3\2\2\2*+\7\n"+
		"\2\2+\61\7\24\2\2,\60\5\4\3\2-\60\5\6\4\2.\60\5\b\5\2/,\3\2\2\2/-\3\2"+
		"\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\648\7\62\2\2\65\67\5\n\6\2\66\65\3\2\2\2\67:\3\2\2\28\66\3"+
		"\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\63\2\2<=\7\2\2\3=\3\3\2\2\2>"+
		"?\7\13\2\2?@\5\16\b\2@A\7\24\2\2AB\7\"\2\2BC\t\2\2\2CD\7+\2\2D\5\3\2\2"+
		"\2EF\5\16\b\2FK\7\24\2\2GH\7,\2\2HJ\7\24\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2"+
		"\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7+\2\2O\7\3\2\2\2PQ\7\n\2\2QR\7\24"+
		"\2\2RV\7\62\2\2SU\5\6\4\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3"+
		"\2\2\2XV\3\2\2\2YZ\7\63\2\2Z\t\3\2\2\2[^\5\16\b\2\\^\7\17\2\2][\3\2\2"+
		"\2]\\\3\2\2\2^_\3\2\2\2_`\7\24\2\2`b\7.\2\2ac\5\f\7\2ba\3\2\2\2bc\3\2"+
		"\2\2cd\3\2\2\2dh\7/\2\2eg\5\6\4\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2ik\3\2\2\2jh\3\2\2\2kl\5\22\n\2l\13\3\2\2\2mn\5\16\b\2nu\7\24\2\2"+
		"op\7,\2\2pq\5\16\b\2qr\7\24\2\2rt\3\2\2\2so\3\2\2\2tw\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2v\r\3\2\2\2wu\3\2\2\2x{\7\24\2\2yz\7\60\2\2z|\7\61\2\2{y\3"+
		"\2\2\2{|\3\2\2\2|\17\3\2\2\2}\u0087\5\"\22\2~\177\7\"\2\2\177\u0088\5"+
		"\34\17\2\u0080\u0082\7.\2\2\u0081\u0083\5\24\13\2\u0082\u0081\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0088\7/\2\2\u0085\u0088"+
		"\7\34\2\2\u0086\u0088\7\36\2\2\u0087~\3\2\2\2\u0087\u0080\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7+"+
		"\2\2\u008a\u00c1\3\2\2\2\u008b\u008c\7\7\2\2\u008c\u008d\7.\2\2\u008d"+
		"\u008e\5\26\f\2\u008e\u008f\7/\2\2\u008f\u0092\5\20\t\2\u0090\u0091\7"+
		"\b\2\2\u0091\u0093\5\20\t\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u00c1\3\2\2\2\u0094\u0095\7\22\2\2\u0095\u0096\7.\2\2\u0096\u0097\5\34"+
		"\17\2\u0097\u0099\7+\2\2\u0098\u009a\5\26\f\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7+\2\2\u009c\u009e\5\20"+
		"\t\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\5\20\t\2\u00a0\u00c1\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3\7"+
		".\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\5\20\t\2\u00a6"+
		"\u00c1\3\2\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00c1\7+\2\2\u00a9\u00ab\7\16"+
		"\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00c1\7+\2\2\u00ae\u00af\7\r\2\2\u00af\u00b0\7.\2"+
		"\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7+\2\2\u00b3\u00c1"+
		"\3\2\2\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6\7.\2\2\u00b6\u00b9\5\34\17\2"+
		"\u00b7\u00b8\7,\2\2\u00b8\u00ba\7\23\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc\u00bd\7+\2\2\u00bd"+
		"\u00c1\3\2\2\2\u00be\u00c1\5\22\n\2\u00bf\u00c1\7+\2\2\u00c0}\3\2\2\2"+
		"\u00c0\u008b\3\2\2\2\u00c0\u0094\3\2\2\2\u00c0\u00a1\3\2\2\2\u00c0\u00a7"+
		"\3\2\2\2\u00c0\u00a9\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c6\7\62\2"+
		"\2\u00c3\u00c5\5\20\t\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00ca\7\63\2\2\u00ca\23\3\2\2\2\u00cb\u00d0\5\34\17\2\u00cc"+
		"\u00cd\7,\2\2\u00cd\u00cf\5\34\17\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3"+
		"\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\25\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d8\5\30\r\2\u00d4\u00d5\7*\2\2\u00d5\u00d7\5\30"+
		"\r\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\27\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00e0\5\32\16"+
		"\2\u00dc\u00dd\7)\2\2\u00dd\u00df\5\32\16\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\31\3\2\2"+
		"\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\5\34\17\2\u00e4\u00e5\5$\23\2\u00e5"+
		"\u00e6\5\34\17\2\u00e6\33\3\2\2\2\u00e7\u00e9\7\35\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f0\5\36\20\2\u00eb"+
		"\u00ec\5&\24\2\u00ec\u00ed\5\36\20\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\35\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f9\5 \21\2\u00f4\u00f5\5(\25"+
		"\2\u00f5\u00f6\5 \21\2\u00f6\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\37\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u0102\5\"\22\2\u00fd\u00ff\7.\2\2\u00fe\u0100\5\24"+
		"\13\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\7/\2\2\u0102\u00fd\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u010f\3\2"+
		"\2\2\u0104\u010f\7\23\2\2\u0105\u010f\7\30\2\2\u0106\u010f\7\32\2\2\u0107"+
		"\u0108\7\f\2\2\u0108\u010f\7\24\2\2\u0109\u010a\7.\2\2\u010a\u010b\5\34"+
		"\17\2\u010b\u010c\7/\2\2\u010c\u010d\7-\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u00fc\3\2\2\2\u010e\u0104\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u0106\3\2"+
		"\2\2\u010e\u0107\3\2\2\2\u010e\u0109\3\2\2\2\u010f!\3\2\2\2\u0110\u0119"+
		"\7\24\2\2\u0111\u0112\7-\2\2\u0112\u0118\7\24\2\2\u0113\u0114\7\60\2\2"+
		"\u0114\u0115\5\34\17\2\u0115\u0116\7\61\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0111\3\2\2\2\u0117\u0113\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a#\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0123"+
		"\7#\2\2\u011d\u0123\7$\2\2\u011e\u0123\7%\2\2\u011f\u0123\7&\2\2\u0120"+
		"\u0123\7\'\2\2\u0121\u0123\7(\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2"+
		"\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123%\3\2\2\2\u0124\u0127\7\33\2\2\u0125\u0127\7\35\2"+
		"\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\'\3\2\2\2\u0128\u012c"+
		"\7\37\2\2\u0129\u012c\7 \2\2\u012a\u012c\7!\2\2\u012b\u0128\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c)\3\2\2\2#/\618KV]bhu{\u0082\u0087"+
		"\u0092\u0099\u009d\u00ab\u00b9\u00c0\u00c6\u00d0\u00d8\u00e0\u00e8\u00f0"+
		"\u00f9\u00ff\u0102\u010e\u0117\u0119\u0122\u0126\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}