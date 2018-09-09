// Generated from C:/Users/Kathe/IdeaProjects/ANTLR-Project\MiScanner.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINE_COMMENT=3, IF=4, ELSE=5, BREAK=6, CLASS=7, CONST=8, 
		NEW=9, READ=10, RETURN=11, VOID=12, WHILE=13, WRITE=14, FOR=15, NUMBER=16, 
		LETTER=17, IDENT=18, FLOAT=19, PRINTABLECHAR=20, CHARCONST=21, STRING=22, 
		BOOL=23, SUMA=24, SUMAS=25, RESTA=26, RESTAS=27, MULT=28, SLASH=29, PORC=30, 
		IGUAL=31, IGUALES=32, DIFERENTE=33, MAYOR=34, MAY_IGUAL=35, MENOR=36, 
		MEN_IGUAL=37, AND=38, OR=39, PYC=40, COMA=41, PUNTO=42, PARENT_ABIERTO=43, 
		PARENT_CERRADO=44, LLAVE_ABIERTA=45, LLAVE_CERRADA=46, CURLY_ABIERTO=47, 
		CURLY_CERRADO=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "LINE_COMMENT", "IF", "ELSE", "BREAK", "CLASS", "CONST", 
		"NEW", "READ", "RETURN", "VOID", "WHILE", "WRITE", "FOR", "NUMBER", "LETTER", 
		"IDENT", "FLOAT", "PRINTABLECHAR", "CHARCONST", "STRING", "BOOL", "COMSIMPLE", 
		"TRUE", "FALSE", "COMILLA", "NUMVALIDO", "EXCLAMA", "GATO", "DOLAR", "ANDUNO", 
		"DOSPTO", "PREGUNTA", "ARROBA", "SUMA", "SUMAS", "RESTA", "RESTAS", "MULT", 
		"SLASH", "PORC", "IGUAL", "IGUALES", "DIFERENTE", "MAYOR", "MAY_IGUAL", 
		"MENOR", "MEN_IGUAL", "AND", "OR", "PYC", "COMA", "PUNTO", "PARENT_ABIERTO", 
		"PARENT_CERRADO", "LLAVE_ABIERTA", "LLAVE_CERRADA", "CURLY_ABIERTO", "CURLY_CERRADO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'if'", "'else'", "'break'", "'class'", "'const'", 
		"'new'", "'read'", "'return'", "'void'", "'while'", "'write'", "'for'", 
		null, null, null, null, null, null, null, null, "'+'", "'++'", "'-'", 
		"'--'", "'*'", "'/'", "'%'", "'='", "'=='", "'!='", "'>'", "'>='", "'<'", 
		"'<='", "'&&'", "'||'", "';'", "','", "'.'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LINE_COMMENT", "IF", "ELSE", "BREAK", "CLASS", 
		"CONST", "NEW", "READ", "RETURN", "VOID", "WHILE", "WRITE", "FOR", "NUMBER", 
		"LETTER", "IDENT", "FLOAT", "PRINTABLECHAR", "CHARCONST", "STRING", "BOOL", 
		"SUMA", "SUMAS", "RESTA", "RESTAS", "MULT", "SLASH", "PORC", "IGUAL", 
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


	public MiScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiScanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0175\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\3\2\6\2}\n\2\r\2\16\2~\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0087\n\3\f\3\16"+
		"\3\u008a\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0095\n\4\f\4\16"+
		"\4\u0098\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\6\21\u00dc\n\21\r\21\16\21\u00dd\3\22\3\22\3\23\3"+
		"\23\3\23\7\23\u00e5\n\23\f\23\16\23\u00e8\13\23\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\5\26\u010c\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30"+
		"\u0116\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\6\35\u012a\n\35\r\35\16\35\u012b\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3\u0088\2>\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2"+
		"G\2I\32K\33M\34O\35Q\36S\37U W!Y\"[#]$_%a&c\'e(g)i*k+m,o-q.s/u\60w\61"+
		"y\62\3\2\7\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\62;\5\2C\\aac|\3\2\63"+
		";\2\u0171\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\3|\3\2\2\2\5\u0082\3\2\2\2\7\u0090\3\2\2\2\t\u009b\3\2\2\2\13"+
		"\u009e\3\2\2\2\r\u00a3\3\2\2\2\17\u00a9\3\2\2\2\21\u00af\3\2\2\2\23\u00b5"+
		"\3\2\2\2\25\u00b9\3\2\2\2\27\u00be\3\2\2\2\31\u00c5\3\2\2\2\33\u00ca\3"+
		"\2\2\2\35\u00d0\3\2\2\2\37\u00d6\3\2\2\2!\u00db\3\2\2\2#\u00df\3\2\2\2"+
		"%\u00e1\3\2\2\2\'\u00e9\3\2\2\2)\u00ed\3\2\2\2+\u0108\3\2\2\2-\u010f\3"+
		"\2\2\2/\u0115\3\2\2\2\61\u0117\3\2\2\2\63\u0119\3\2\2\2\65\u011e\3\2\2"+
		"\2\67\u0124\3\2\2\29\u0129\3\2\2\2;\u012d\3\2\2\2=\u012f\3\2\2\2?\u0131"+
		"\3\2\2\2A\u0133\3\2\2\2C\u0135\3\2\2\2E\u0137\3\2\2\2G\u0139\3\2\2\2I"+
		"\u013b\3\2\2\2K\u013d\3\2\2\2M\u0140\3\2\2\2O\u0142\3\2\2\2Q\u0145\3\2"+
		"\2\2S\u0147\3\2\2\2U\u0149\3\2\2\2W\u014b\3\2\2\2Y\u014d\3\2\2\2[\u0150"+
		"\3\2\2\2]\u0153\3\2\2\2_\u0155\3\2\2\2a\u0158\3\2\2\2c\u015a\3\2\2\2e"+
		"\u015d\3\2\2\2g\u0160\3\2\2\2i\u0163\3\2\2\2k\u0165\3\2\2\2m\u0167\3\2"+
		"\2\2o\u0169\3\2\2\2q\u016b\3\2\2\2s\u016d\3\2\2\2u\u016f\3\2\2\2w\u0171"+
		"\3\2\2\2y\u0173\3\2\2\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\2\2\2\u0081\4\3\2\2\2\u0082\u0083"+
		"\7\61\2\2\u0083\u0084\7,\2\2\u0084\u0088\3\2\2\2\u0085\u0087\13\2\2\2"+
		"\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7,\2\2\u008c"+
		"\u008d\7\61\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\3\2\2\u008f\6\3\2\2"+
		"\2\u0090\u0091\7\61\2\2\u0091\u0092\7\61\2\2\u0092\u0096\3\2\2\2\u0093"+
		"\u0095\n\3\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\b\4\2\2\u009a\b\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7h\2\2\u009d"+
		"\n\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\f\3\2\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7t\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7m\2\2\u00a8\16\3\2\2\2\u00a9"+
		"\u00aa\7e\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7u\2\2"+
		"\u00ad\u00ae\7u\2\2\u00ae\20\3\2\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7"+
		"q\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7v\2\2\u00b4\22"+
		"\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7y\2\2\u00b8"+
		"\24\3\2\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00bd\7f\2\2\u00bd\26\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7p\2\2"+
		"\u00c4\30\3\2\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7"+
		"k\2\2\u00c8\u00c9\7f\2\2\u00c9\32\3\2\2\2\u00ca\u00cb\7y\2\2\u00cb\u00cc"+
		"\7j\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2\u00cf"+
		"\34\3\2\2\2\u00d0\u00d1\7y\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\u00d5\7g\2\2\u00d5\36\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7"+
		"\u00d8\7q\2\2\u00d8\u00d9\7t\2\2\u00d9 \3\2\2\2\u00da\u00dc\t\4\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\"\3\2\2\2\u00df\u00e0\t\5\2\2\u00e0$\3\2\2\2\u00e1\u00e6\5"+
		"#\22\2\u00e2\u00e5\5#\22\2\u00e3\u00e5\5!\21\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7&\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\5!\21\2\u00ea\u00eb"+
		"\5m\67\2\u00eb\u00ec\5!\21\2\u00ec(\3\2\2\2\u00ed\u00ee\5#\22\2\u00ee"+
		"\u00ef\7-\2\2\u00ef\u00f0\5!\21\2\u00f0\u00f1\7-\2\2\u00f1\u00f2\5;\36"+
		"\2\u00f2\u00f3\5\67\34\2\u00f3\u00f4\5=\37\2\u00f4\u00f5\5? \2\u00f5\u00f6"+
		"\5U+\2\u00f6\u00f7\5A!\2\u00f7\u00f8\5\61\31\2\u00f8\u00f9\5o8\2\u00f9"+
		"\u00fa\5q9\2\u00fa\u00fb\5Q)\2\u00fb\u00fc\5I%\2\u00fc\u00fd\5k\66\2\u00fd"+
		"\u00fe\5M\'\2\u00fe\u00ff\5m\67\2\u00ff\u0100\5S*\2\u0100\u0101\5C\"\2"+
		"\u0101\u0102\5i\65\2\u0102\u0103\5a\61\2\u0103\u0104\5W,\2\u0104\u0105"+
		"\5]/\2\u0105\u0106\5E#\2\u0106\u0107\5G$\2\u0107*\3\2\2\2\u0108\u010b"+
		"\5\61\31\2\u0109\u010c\5)\25\2\u010a\u010c\t\3\2\2\u010b\u0109\3\2\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\5\61\31\2\u010e,"+
		"\3\2\2\2\u010f\u0110\5\67\34\2\u0110\u0111\13\2\2\2\u0111\u0112\5\67\34"+
		"\2\u0112.\3\2\2\2\u0113\u0116\5\63\32\2\u0114\u0116\5\65\33\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0114\3\2\2\2\u0116\60\3\2\2\2\u0117\u0118\7)\2\2\u0118"+
		"\62\3\2\2\2\u0119\u011a\7v\2\2\u011a\u011b\7t\2\2\u011b\u011c\7w\2\2\u011c"+
		"\u011d\7g\2\2\u011d\64\3\2\2\2\u011e\u011f\7h\2\2\u011f\u0120\7c\2\2\u0120"+
		"\u0121\7n\2\2\u0121\u0122\7u\2\2\u0122\u0123\7g\2\2\u0123\66\3\2\2\2\u0124"+
		"\u0125\7\"\2\2\u0125\u0126\7$\2\2\u0126\u0127\7\"\2\2\u01278\3\2\2\2\u0128"+
		"\u012a\t\6\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c:\3\2\2\2\u012d\u012e\7#\2\2\u012e<\3\2"+
		"\2\2\u012f\u0130\7%\2\2\u0130>\3\2\2\2\u0131\u0132\7&\2\2\u0132@\3\2\2"+
		"\2\u0133\u0134\7(\2\2\u0134B\3\2\2\2\u0135\u0136\7<\2\2\u0136D\3\2\2\2"+
		"\u0137\u0138\7A\2\2\u0138F\3\2\2\2\u0139\u013a\7B\2\2\u013aH\3\2\2\2\u013b"+
		"\u013c\7-\2\2\u013cJ\3\2\2\2\u013d\u013e\7-\2\2\u013e\u013f\7-\2\2\u013f"+
		"L\3\2\2\2\u0140\u0141\7/\2\2\u0141N\3\2\2\2\u0142\u0143\7/\2\2\u0143\u0144"+
		"\7/\2\2\u0144P\3\2\2\2\u0145\u0146\7,\2\2\u0146R\3\2\2\2\u0147\u0148\7"+
		"\61\2\2\u0148T\3\2\2\2\u0149\u014a\7\'\2\2\u014aV\3\2\2\2\u014b\u014c"+
		"\7?\2\2\u014cX\3\2\2\2\u014d\u014e\7?\2\2\u014e\u014f\7?\2\2\u014fZ\3"+
		"\2\2\2\u0150\u0151\7#\2\2\u0151\u0152\7?\2\2\u0152\\\3\2\2\2\u0153\u0154"+
		"\7@\2\2\u0154^\3\2\2\2\u0155\u0156\7@\2\2\u0156\u0157\7?\2\2\u0157`\3"+
		"\2\2\2\u0158\u0159\7>\2\2\u0159b\3\2\2\2\u015a\u015b\7>\2\2\u015b\u015c"+
		"\7?\2\2\u015cd\3\2\2\2\u015d\u015e\7(\2\2\u015e\u015f\7(\2\2\u015ff\3"+
		"\2\2\2\u0160\u0161\7~\2\2\u0161\u0162\7~\2\2\u0162h\3\2\2\2\u0163\u0164"+
		"\7=\2\2\u0164j\3\2\2\2\u0165\u0166\7.\2\2\u0166l\3\2\2\2\u0167\u0168\7"+
		"\60\2\2\u0168n\3\2\2\2\u0169\u016a\7*\2\2\u016ap\3\2\2\2\u016b\u016c\7"+
		"+\2\2\u016cr\3\2\2\2\u016d\u016e\7]\2\2\u016et\3\2\2\2\u016f\u0170\7_"+
		"\2\2\u0170v\3\2\2\2\u0171\u0172\7}\2\2\u0172x\3\2\2\2\u0173\u0174\7\177"+
		"\2\2\u0174z\3\2\2\2\f\2~\u0088\u0096\u00dd\u00e4\u00e6\u010b\u0115\u012b"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}