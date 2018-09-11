// Generated from C:/Users/CHRISTIAN/IdeaProjects/Scanner1\MiScanner.g4 by ANTLR 4.7
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
		IDENT=17, LETTER=18, FLOAT=19, PRINTABLECHAR=20, CHARCONST=21, STRING=22, 
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
		"NEW", "READ", "RETURN", "VOID", "WHILE", "WRITE", "FOR", "NUMBER", "IDENT", 
		"LETTER", "FLOAT", "PRINTABLECHAR", "CHARCONST", "STRING", "TRUE", "FALSE", 
		"BOOL", "COMSIMPLE", "COMILLA", "EXCLAMA", "GATO", "DOLAR", "ANDUNO", 
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
		"IDENT", "LETTER", "FLOAT", "PRINTABLECHAR", "CHARCONST", "STRING", "BOOL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u016e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2"+
		"\6\2{\n\2\r\2\16\2|\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0085\n\3\f\3\16\3\u0088"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0093\n\4\f\4\16\4\u0096"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\6\21\u00da\n\21\r\21\16\21\u00db\3\22\3\22\3\22\7\22\u00e1"+
		"\n\22\f\22\16\22\u00e4\13\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5"+
		"\26\u010a\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u011f\n\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3"+
		"-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;"+
		"\3;\3<\3<\3\u0086\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\31"+
		"\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\32I\33K\34M\35O\36Q\37S U!W\"Y#[$]%_"+
		"&a\'c(e)g*i+k,m-o.q/s\60u\61w\62\3\2\6\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\3\2\62;\5\2C\\aac|\2\u016a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2\63\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2"+
		"\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2"+
		"\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g"+
		"\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2"+
		"\2\2\2u\3\2\2\2\2w\3\2\2\2\3z\3\2\2\2\5\u0080\3\2\2\2\7\u008e\3\2\2\2"+
		"\t\u0099\3\2\2\2\13\u009c\3\2\2\2\r\u00a1\3\2\2\2\17\u00a7\3\2\2\2\21"+
		"\u00ad\3\2\2\2\23\u00b3\3\2\2\2\25\u00b7\3\2\2\2\27\u00bc\3\2\2\2\31\u00c3"+
		"\3\2\2\2\33\u00c8\3\2\2\2\35\u00ce\3\2\2\2\37\u00d4\3\2\2\2!\u00d9\3\2"+
		"\2\2#\u00dd\3\2\2\2%\u00e5\3\2\2\2\'\u00e7\3\2\2\2)\u00eb\3\2\2\2+\u0106"+
		"\3\2\2\2-\u010d\3\2\2\2/\u0111\3\2\2\2\61\u0116\3\2\2\2\63\u011e\3\2\2"+
		"\2\65\u0120\3\2\2\2\67\u0122\3\2\2\29\u0126\3\2\2\2;\u0128\3\2\2\2=\u012a"+
		"\3\2\2\2?\u012c\3\2\2\2A\u012e\3\2\2\2C\u0130\3\2\2\2E\u0132\3\2\2\2G"+
		"\u0134\3\2\2\2I\u0136\3\2\2\2K\u0139\3\2\2\2M\u013b\3\2\2\2O\u013e\3\2"+
		"\2\2Q\u0140\3\2\2\2S\u0142\3\2\2\2U\u0144\3\2\2\2W\u0146\3\2\2\2Y\u0149"+
		"\3\2\2\2[\u014c\3\2\2\2]\u014e\3\2\2\2_\u0151\3\2\2\2a\u0153\3\2\2\2c"+
		"\u0156\3\2\2\2e\u0159\3\2\2\2g\u015c\3\2\2\2i\u015e\3\2\2\2k\u0160\3\2"+
		"\2\2m\u0162\3\2\2\2o\u0164\3\2\2\2q\u0166\3\2\2\2s\u0168\3\2\2\2u\u016a"+
		"\3\2\2\2w\u016c\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}~\3\2\2\2~\177\b\2\2\2\177\4\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082"+
		"\7,\2\2\u0082\u0086\3\2\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b\7\61\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\3\2\2\u008d\6\3\2\2\2\u008e\u008f\7\61\2"+
		"\2\u008f\u0090\7\61\2\2\u0090\u0094\3\2\2\2\u0091\u0093\n\3\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\b\4\2\2\u0098"+
		"\b\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7h\2\2\u009b\n\3\2\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\f\3\2\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g"+
		"\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7m\2\2\u00a6\16\3\2\2\2\u00a7\u00a8"+
		"\7e\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\22\3\2\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7y\2\2\u00b6\24\3\2\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7f\2\2"+
		"\u00bb\26\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7"+
		"v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7p\2\2\u00c2\30"+
		"\3\2\2\2\u00c3\u00c4\7x\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7f\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7j\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd\34\3\2\2\2\u00ce"+
		"\u00cf\7y\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2\u00d3\7g\2\2\u00d3\36\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7"+
		"q\2\2\u00d6\u00d7\7t\2\2\u00d7 \3\2\2\2\u00d8\u00da\t\4\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\"\3\2\2\2\u00dd\u00e2\5%\23\2\u00de\u00e1\5%\23\2\u00df\u00e1\5!\21\2"+
		"\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3$\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\t\5\2\2\u00e6&\3\2\2\2\u00e7\u00e8\5!\21\2\u00e8\u00e9\5k\66\2"+
		"\u00e9\u00ea\5!\21\2\u00ea(\3\2\2\2\u00eb\u00ec\5%\23\2\u00ec\u00ed\7"+
		"-\2\2\u00ed\u00ee\5!\21\2\u00ee\u00ef\7-\2\2\u00ef\u00f0\59\35\2\u00f0"+
		"\u00f1\5\67\34\2\u00f1\u00f2\5;\36\2\u00f2\u00f3\5=\37\2\u00f3\u00f4\5"+
		"S*\2\u00f4\u00f5\5? \2\u00f5\u00f6\5\65\33\2\u00f6\u00f7\5m\67\2\u00f7"+
		"\u00f8\5o8\2\u00f8\u00f9\5O(\2\u00f9\u00fa\5G$\2\u00fa\u00fb\5i\65\2\u00fb"+
		"\u00fc\5K&\2\u00fc\u00fd\5k\66\2\u00fd\u00fe\5Q)\2\u00fe\u00ff\5A!\2\u00ff"+
		"\u0100\5g\64\2\u0100\u0101\5_\60\2\u0101\u0102\5U+\2\u0102\u0103\5[.\2"+
		"\u0103\u0104\5C\"\2\u0104\u0105\5E#\2\u0105*\3\2\2\2\u0106\u0109\5\65"+
		"\33\2\u0107\u010a\5)\25\2\u0108\u010a\t\3\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\5\65\33\2\u010c,\3\2\2"+
		"\2\u010d\u010e\5\67\34\2\u010e\u010f\13\2\2\2\u010f\u0110\5\67\34\2\u0110"+
		".\3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\7t\2\2\u0113\u0114\7w\2\2\u0114"+
		"\u0115\7g\2\2\u0115\60\3\2\2\2\u0116\u0117\7h\2\2\u0117\u0118\7c\2\2\u0118"+
		"\u0119\7n\2\2\u0119\u011a\7u\2\2\u011a\u011b\7g\2\2\u011b\62\3\2\2\2\u011c"+
		"\u011f\5/\30\2\u011d\u011f\5\61\31\2\u011e\u011c\3\2\2\2\u011e\u011d\3"+
		"\2\2\2\u011f\64\3\2\2\2\u0120\u0121\7)\2\2\u0121\66\3\2\2\2\u0122\u0123"+
		"\7\"\2\2\u0123\u0124\7$\2\2\u0124\u0125\7\"\2\2\u01258\3\2\2\2\u0126\u0127"+
		"\7#\2\2\u0127:\3\2\2\2\u0128\u0129\7%\2\2\u0129<\3\2\2\2\u012a\u012b\7"+
		"&\2\2\u012b>\3\2\2\2\u012c\u012d\7(\2\2\u012d@\3\2\2\2\u012e\u012f\7<"+
		"\2\2\u012fB\3\2\2\2\u0130\u0131\7A\2\2\u0131D\3\2\2\2\u0132\u0133\7B\2"+
		"\2\u0133F\3\2\2\2\u0134\u0135\7-\2\2\u0135H\3\2\2\2\u0136\u0137\7-\2\2"+
		"\u0137\u0138\7-\2\2\u0138J\3\2\2\2\u0139\u013a\7/\2\2\u013aL\3\2\2\2\u013b"+
		"\u013c\7/\2\2\u013c\u013d\7/\2\2\u013dN\3\2\2\2\u013e\u013f\7,\2\2\u013f"+
		"P\3\2\2\2\u0140\u0141\7\61\2\2\u0141R\3\2\2\2\u0142\u0143\7\'\2\2\u0143"+
		"T\3\2\2\2\u0144\u0145\7?\2\2\u0145V\3\2\2\2\u0146\u0147\7?\2\2\u0147\u0148"+
		"\7?\2\2\u0148X\3\2\2\2\u0149\u014a\7#\2\2\u014a\u014b\7?\2\2\u014bZ\3"+
		"\2\2\2\u014c\u014d\7@\2\2\u014d\\\3\2\2\2\u014e\u014f\7@\2\2\u014f\u0150"+
		"\7?\2\2\u0150^\3\2\2\2\u0151\u0152\7>\2\2\u0152`\3\2\2\2\u0153\u0154\7"+
		">\2\2\u0154\u0155\7?\2\2\u0155b\3\2\2\2\u0156\u0157\7(\2\2\u0157\u0158"+
		"\7(\2\2\u0158d\3\2\2\2\u0159\u015a\7~\2\2\u015a\u015b\7~\2\2\u015bf\3"+
		"\2\2\2\u015c\u015d\7=\2\2\u015dh\3\2\2\2\u015e\u015f\7.\2\2\u015fj\3\2"+
		"\2\2\u0160\u0161\7\60\2\2\u0161l\3\2\2\2\u0162\u0163\7*\2\2\u0163n\3\2"+
		"\2\2\u0164\u0165\7+\2\2\u0165p\3\2\2\2\u0166\u0167\7]\2\2\u0167r\3\2\2"+
		"\2\u0168\u0169\7_\2\2\u0169t\3\2\2\2\u016a\u016b\7}\2\2\u016bv\3\2\2\2"+
		"\u016c\u016d\7\177\2\2\u016dx\3\2\2\2\13\2|\u0086\u0094\u00db\u00e0\u00e2"+
		"\u0109\u011e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}