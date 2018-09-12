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
		WS=1, COMMENT=2, LINE_COMMENT=3, COMMENT2=4, IF=5, ELSE=6, BREAK=7, CLASS=8, 
		CONST=9, NEW=10, READ=11, RETURN=12, VOID=13, WHILE=14, WRITE=15, FOR=16, 
		NUMBER=17, IDENT=18, LETTER=19, FLOAT=20, PRINTABLECHAR=21, CHARCONST=22, 
		STRING=23, BOOL=24, SUMA=25, SUMAS=26, RESTA=27, RESTAS=28, MULT=29, SLASH=30, 
		PORC=31, IGUAL=32, IGUALES=33, DIFERENTE=34, MAYOR=35, MAY_IGUAL=36, MENOR=37, 
		MEN_IGUAL=38, AND=39, OR=40, PYC=41, COMA=42, PUNTO=43, PARENT_ABIERTO=44, 
		PARENT_CERRADO=45, LLAVE_ABIERTA=46, LLAVE_CERRADA=47, CURLY_ABIERTO=48, 
		CURLY_CERRADO=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "LINE_COMMENT", "COMMENT2", "IF", "ELSE", "BREAK", "CLASS", 
		"CONST", "NEW", "READ", "RETURN", "VOID", "WHILE", "WRITE", "FOR", "NUMBER", 
		"IDENT", "LETTER", "FLOAT", "PRINTABLECHAR", "CHARCONST", "STRING", "TRUE", 
		"FALSE", "BOOL", "COMSIMPLE", "COMILLA", "EXCLAMA", "GATO", "DOLAR", "ANDUNO", 
		"DOSPTO", "PREGUNTA", "ARROBA", "SUMA", "SUMAS", "RESTA", "RESTAS", "MULT", 
		"SLASH", "PORC", "IGUAL", "IGUALES", "DIFERENTE", "MAYOR", "MAY_IGUAL", 
		"MENOR", "MEN_IGUAL", "AND", "OR", "PYC", "COMA", "PUNTO", "PARENT_ABIERTO", 
		"PARENT_CERRADO", "LLAVE_ABIERTA", "LLAVE_CERRADA", "CURLY_ABIERTO", "CURLY_CERRADO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u017f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\3\2\6\2}\n\2\r\2\16\2~\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0087\n\3\f\3\16"+
		"\3\u008a\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0095\n\4\f\4\16"+
		"\4\u0098\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\u00a1\n\5\f\5\16\5\u00a4"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\6\22\u00eb\n\22\r\22\16\22\u00ec\3\23\3\23"+
		"\3\23\7\23\u00f2\n\23\f\23\16\23\u00f5\13\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\5\27\u011b\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u0130\n\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\4\u0088\u00a2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\2\63\2\65\32\67\29\2;\2=\2?\2A\2C\2E\2G\2I\33K\34M\35O\36Q\37"+
		"S U!W\"Y#[$]%_&a\'c(e)g*i+k,m-o.q/s\60u\61w\62y\63\3\2\6\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\3\2\62;\5\2C\\aac|\2\u017d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3|\3\2\2\2\5"+
		"\u0082\3\2\2\2\7\u0090\3\2\2\2\t\u009b\3\2\2\2\13\u00aa\3\2\2\2\r\u00ad"+
		"\3\2\2\2\17\u00b2\3\2\2\2\21\u00b8\3\2\2\2\23\u00be\3\2\2\2\25\u00c4\3"+
		"\2\2\2\27\u00c8\3\2\2\2\31\u00cd\3\2\2\2\33\u00d4\3\2\2\2\35\u00d9\3\2"+
		"\2\2\37\u00df\3\2\2\2!\u00e5\3\2\2\2#\u00ea\3\2\2\2%\u00ee\3\2\2\2\'\u00f6"+
		"\3\2\2\2)\u00f8\3\2\2\2+\u00fc\3\2\2\2-\u0117\3\2\2\2/\u011e\3\2\2\2\61"+
		"\u0122\3\2\2\2\63\u0127\3\2\2\2\65\u012f\3\2\2\2\67\u0131\3\2\2\29\u0133"+
		"\3\2\2\2;\u0137\3\2\2\2=\u0139\3\2\2\2?\u013b\3\2\2\2A\u013d\3\2\2\2C"+
		"\u013f\3\2\2\2E\u0141\3\2\2\2G\u0143\3\2\2\2I\u0145\3\2\2\2K\u0147\3\2"+
		"\2\2M\u014a\3\2\2\2O\u014c\3\2\2\2Q\u014f\3\2\2\2S\u0151\3\2\2\2U\u0153"+
		"\3\2\2\2W\u0155\3\2\2\2Y\u0157\3\2\2\2[\u015a\3\2\2\2]\u015d\3\2\2\2_"+
		"\u015f\3\2\2\2a\u0162\3\2\2\2c\u0164\3\2\2\2e\u0167\3\2\2\2g\u016a\3\2"+
		"\2\2i\u016d\3\2\2\2k\u016f\3\2\2\2m\u0171\3\2\2\2o\u0173\3\2\2\2q\u0175"+
		"\3\2\2\2s\u0177\3\2\2\2u\u0179\3\2\2\2w\u017b\3\2\2\2y\u017d\3\2\2\2{"+
		"}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\b\2\2\2\u0081\4\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084"+
		"\7,\2\2\u0084\u0088\3\2\2\2\u0085\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7,\2\2\u008c\u008d\7\61\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\b\3\2\2\u008f\6\3\2\2\2\u0090\u0091\7\61\2"+
		"\2\u0091\u0092\7\61\2\2\u0092\u0096\3\2\2\2\u0093\u0095\n\3\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\b\4\2\2\u009a"+
		"\b\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7,\2\2\u009d\u00a2\3\2\2\2"+
		"\u009e\u00a1\5\t\5\2\u009f\u00a1\13\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7\61"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\5\2\2\u00a9\n\3\2\2\2\u00aa\u00ab"+
		"\7k\2\2\u00ab\u00ac\7h\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1\16\3\2\2\2\u00b2\u00b3"+
		"\7d\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7m\2\2\u00b7\20\3\2\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7n\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7u\2\2\u00bd\22\3\2\2\2\u00be"+
		"\u00bf\7e\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7u\2\2"+
		"\u00c2\u00c3\7v\2\2\u00c3\24\3\2\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7"+
		"g\2\2\u00c6\u00c7\7y\2\2\u00c7\26\3\2\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7f\2\2\u00cc\30\3\2\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7w\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2\u00d3\7p\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7x\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7f\2\2\u00d8\34\3\2\2\2\u00d9"+
		"\u00da\7y\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7n\2\2"+
		"\u00dd\u00de\7g\2\2\u00de\36\3\2\2\2\u00df\u00e0\7y\2\2\u00e0\u00e1\7"+
		"t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7g\2\2\u00e4 "+
		"\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8"+
		"\"\3\2\2\2\u00e9\u00eb\t\4\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed$\3\2\2\2\u00ee\u00f3\5"+
		"\'\24\2\u00ef\u00f2\5\'\24\2\u00f0\u00f2\5#\22\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4&\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\t\5\2\2\u00f7(\3\2"+
		"\2\2\u00f8\u00f9\5#\22\2\u00f9\u00fa\5m\67\2\u00fa\u00fb\5#\22\2\u00fb"+
		"*\3\2\2\2\u00fc\u00fd\5\'\24\2\u00fd\u00fe\7-\2\2\u00fe\u00ff\5#\22\2"+
		"\u00ff\u0100\7-\2\2\u0100\u0101\5;\36\2\u0101\u0102\59\35\2\u0102\u0103"+
		"\5=\37\2\u0103\u0104\5? \2\u0104\u0105\5U+\2\u0105\u0106\5A!\2\u0106\u0107"+
		"\5\67\34\2\u0107\u0108\5o8\2\u0108\u0109\5q9\2\u0109\u010a\5Q)\2\u010a"+
		"\u010b\5I%\2\u010b\u010c\5k\66\2\u010c\u010d\5M\'\2\u010d\u010e\5m\67"+
		"\2\u010e\u010f\5S*\2\u010f\u0110\5C\"\2\u0110\u0111\5i\65\2\u0111\u0112"+
		"\5a\61\2\u0112\u0113\5W,\2\u0113\u0114\5]/\2\u0114\u0115\5E#\2\u0115\u0116"+
		"\5G$\2\u0116,\3\2\2\2\u0117\u011a\5\67\34\2\u0118\u011b\5+\26\2\u0119"+
		"\u011b\t\3\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\5\67\34\2\u011d.\3\2\2\2\u011e\u011f\59\35\2\u011f\u0120"+
		"\13\2\2\2\u0120\u0121\59\35\2\u0121\60\3\2\2\2\u0122\u0123\7v\2\2\u0123"+
		"\u0124\7t\2\2\u0124\u0125\7w\2\2\u0125\u0126\7g\2\2\u0126\62\3\2\2\2\u0127"+
		"\u0128\7h\2\2\u0128\u0129\7c\2\2\u0129\u012a\7n\2\2\u012a\u012b\7u\2\2"+
		"\u012b\u012c\7g\2\2\u012c\64\3\2\2\2\u012d\u0130\5\61\31\2\u012e\u0130"+
		"\5\63\32\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\66\3\2\2\2\u0131"+
		"\u0132\7)\2\2\u01328\3\2\2\2\u0133\u0134\7\"\2\2\u0134\u0135\7$\2\2\u0135"+
		"\u0136\7\"\2\2\u0136:\3\2\2\2\u0137\u0138\7#\2\2\u0138<\3\2\2\2\u0139"+
		"\u013a\7%\2\2\u013a>\3\2\2\2\u013b\u013c\7&\2\2\u013c@\3\2\2\2\u013d\u013e"+
		"\7(\2\2\u013eB\3\2\2\2\u013f\u0140\7<\2\2\u0140D\3\2\2\2\u0141\u0142\7"+
		"A\2\2\u0142F\3\2\2\2\u0143\u0144\7B\2\2\u0144H\3\2\2\2\u0145\u0146\7-"+
		"\2\2\u0146J\3\2\2\2\u0147\u0148\7-\2\2\u0148\u0149\7-\2\2\u0149L\3\2\2"+
		"\2\u014a\u014b\7/\2\2\u014bN\3\2\2\2\u014c\u014d\7/\2\2\u014d\u014e\7"+
		"/\2\2\u014eP\3\2\2\2\u014f\u0150\7,\2\2\u0150R\3\2\2\2\u0151\u0152\7\61"+
		"\2\2\u0152T\3\2\2\2\u0153\u0154\7\'\2\2\u0154V\3\2\2\2\u0155\u0156\7?"+
		"\2\2\u0156X\3\2\2\2\u0157\u0158\7?\2\2\u0158\u0159\7?\2\2\u0159Z\3\2\2"+
		"\2\u015a\u015b\7#\2\2\u015b\u015c\7?\2\2\u015c\\\3\2\2\2\u015d\u015e\7"+
		"@\2\2\u015e^\3\2\2\2\u015f\u0160\7@\2\2\u0160\u0161\7?\2\2\u0161`\3\2"+
		"\2\2\u0162\u0163\7>\2\2\u0163b\3\2\2\2\u0164\u0165\7>\2\2\u0165\u0166"+
		"\7?\2\2\u0166d\3\2\2\2\u0167\u0168\7(\2\2\u0168\u0169\7(\2\2\u0169f\3"+
		"\2\2\2\u016a\u016b\7~\2\2\u016b\u016c\7~\2\2\u016ch\3\2\2\2\u016d\u016e"+
		"\7=\2\2\u016ej\3\2\2\2\u016f\u0170\7.\2\2\u0170l\3\2\2\2\u0171\u0172\7"+
		"\60\2\2\u0172n\3\2\2\2\u0173\u0174\7*\2\2\u0174p\3\2\2\2\u0175\u0176\7"+
		"+\2\2\u0176r\3\2\2\2\u0177\u0178\7]\2\2\u0178t\3\2\2\2\u0179\u017a\7_"+
		"\2\2\u017av\3\2\2\2\u017b\u017c\7}\2\2\u017cx\3\2\2\2\u017d\u017e\7\177"+
		"\2\2\u017ez\3\2\2\2\r\2~\u0088\u0096\u00a0\u00a2\u00ec\u00f1\u00f3\u011a"+
		"\u012f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}