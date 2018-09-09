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
		WS=1, SUMA=2, SUMAS=3, RESTA=4, RESTAS=5, MULT=6, SLASH=7, PORC=8, IGUAL=9, 
		IGUALES=10, DIFERENTE=11, MAYOR=12, MAY_IGUAL=13, MENOR=14, MEN_IGUAL=15, 
		AND=16, OR=17, PYC=18, COMA=19, PUNTO=20, PARENT_ABIERTO=21, PARENT_CERRADO=22, 
		LLAVE_ABIERTA=23, LLAVE_CERRADA=24, CURLY_ABIERTO=25, CURLY_CERRADO=26, 
		LETTER=27, DIGIT=28, NUM=29, PRINTABLECHAR=30, IDENT=31, NUMBER=32, CHARCONST=33, 
		CHAR=34, INT=35, FLOAT=36, BOOL=37, STRING=38, IF=39, ELSE=40, BREAK=41, 
		CLASS=42, CONST=43, NEW=44, READ=45, RETURN=46, VOID=47, WHILE=48, WRITE=49, 
		FOR=50, COMENTARIO=51, COMENTARIO2=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "SUMA", "SUMAS", "RESTA", "RESTAS", "MULT", "SLASH", "PORC", "IGUAL", 
		"IGUALES", "DIFERENTE", "MAYOR", "MAY_IGUAL", "MENOR", "MEN_IGUAL", "AND", 
		"OR", "PYC", "COMA", "PUNTO", "PARENT_ABIERTO", "PARENT_CERRADO", "LLAVE_ABIERTA", 
		"LLAVE_CERRADA", "CURLY_ABIERTO", "CURLY_CERRADO", "CERO", "NUMVALIDO", 
		"EXCLAMA", "GATO", "DOLAR", "ANDUNO", "DOSPTO", "PREGUNTA", "ARROBA", 
		"LETTER", "DIGIT", "NUM", "PRINTABLECHAR", "IDENT", "NUMBER", "CHARCONST", 
		"COMSIMPLE", "TRUE", "FALSE", "COMILLA", "CHAR", "INT", "FLOAT", "BOOL", 
		"STRING", "IF", "ELSE", "BREAK", "CLASS", "CONST", "NEW", "READ", "RETURN", 
		"VOID", "WHILE", "WRITE", "FOR", "COMENTARIO", "COMENTARIO2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'='", 
		"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "';'", "','", 
		"'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, null, null, 
		null, null, null, null, null, null, null, null, "'if'", "'else'", "'break'", 
		"'class'", "'const'", "'new'", "'read'", "'return'", "'void'", "'while'", 
		"'write'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "SUMA", "SUMAS", "RESTA", "RESTAS", "MULT", "SLASH", "PORC", 
		"IGUAL", "IGUALES", "DIFERENTE", "MAYOR", "MAY_IGUAL", "MENOR", "MEN_IGUAL", 
		"AND", "OR", "PYC", "COMA", "PUNTO", "PARENT_ABIERTO", "PARENT_CERRADO", 
		"LLAVE_ABIERTA", "LLAVE_CERRADA", "CURLY_ABIERTO", "CURLY_CERRADO", "LETTER", 
		"DIGIT", "NUM", "PRINTABLECHAR", "IDENT", "NUMBER", "CHARCONST", "CHAR", 
		"INT", "FLOAT", "BOOL", "STRING", "IF", "ELSE", "BREAK", "CLASS", "CONST", 
		"NEW", "READ", "RETURN", "VOID", "WHILE", "WRITE", "FOR", "COMENTARIO", 
		"COMENTARIO2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u01a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\6\2\u0087\n\2\r\2\16\2\u0088\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\6\35\u00ca\n\35\r\35\16\35\u00cb\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\6&\u00df\n&\r&\16&\u00e0\3\'\3\'\3\'\7"+
		"\'\u00e6\n\'\f\'\16\'\u00e9\13\'\5\'\u00eb\n\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\7"+
		")\u010b\n)\f)\16)\u010e\13)\3*\3*\7*\u0112\n*\f*\16*\u0115\13*\3+\3+\3"+
		"+\5+\u011a\n+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\5\60\u0132\n\60\3\60\3\60\3\61\3\61\7\61\u0138\n\61\f"+
		"\61\16\61\u013b\13\61\3\62\3\62\3\62\3\62\3\63\3\63\5\63\u0143\n\63\3"+
		"\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?"+
		"\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\7A\u018e\nA\fA\16A\u0191"+
		"\13A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\5B\u019d\nB\3B\3B\2\2C\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\29\2;\2=\2?\2A\2C\2E\2"+
		"G\2I\35K\36M\37O Q!S\"U#W\2Y\2[\2]\2_$a%c&e\'g(i)k*m+o,q-s.u/w\60y\61"+
		"{\62}\63\177\64\u0081\65\u0083\66\3\2\b\5\2\13\f\17\17\"\"\3\2\62\62\3"+
		"\2\63;\5\2C\\aac|\3\2\62;\4\2\f\f\17\17\2\u01a2\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0086\3\2\2\2\5\u008c\3\2\2"+
		"\2\7\u008e\3\2\2\2\t\u0091\3\2\2\2\13\u0093\3\2\2\2\r\u0096\3\2\2\2\17"+
		"\u0098\3\2\2\2\21\u009a\3\2\2\2\23\u009c\3\2\2\2\25\u009e\3\2\2\2\27\u00a1"+
		"\3\2\2\2\31\u00a4\3\2\2\2\33\u00a6\3\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3"+
		"\2\2\2!\u00ae\3\2\2\2#\u00b1\3\2\2\2%\u00b4\3\2\2\2\'\u00b6\3\2\2\2)\u00b8"+
		"\3\2\2\2+\u00ba\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2"+
		"\63\u00c2\3\2\2\2\65\u00c4\3\2\2\2\67\u00c6\3\2\2\29\u00c9\3\2\2\2;\u00cd"+
		"\3\2\2\2=\u00cf\3\2\2\2?\u00d1\3\2\2\2A\u00d3\3\2\2\2C\u00d5\3\2\2\2E"+
		"\u00d7\3\2\2\2G\u00d9\3\2\2\2I\u00db\3\2\2\2K\u00de\3\2\2\2M\u00ea\3\2"+
		"\2\2O\u00ec\3\2\2\2Q\u0107\3\2\2\2S\u010f\3\2\2\2U\u0116\3\2\2\2W\u011d"+
		"\3\2\2\2Y\u011f\3\2\2\2[\u0124\3\2\2\2]\u012a\3\2\2\2_\u012e\3\2\2\2a"+
		"\u0135\3\2\2\2c\u013c\3\2\2\2e\u0142\3\2\2\2g\u0144\3\2\2\2i\u0148\3\2"+
		"\2\2k\u014b\3\2\2\2m\u0150\3\2\2\2o\u0156\3\2\2\2q\u015c\3\2\2\2s\u0162"+
		"\3\2\2\2u\u0166\3\2\2\2w\u016b\3\2\2\2y\u0172\3\2\2\2{\u0177\3\2\2\2}"+
		"\u017d\3\2\2\2\177\u0183\3\2\2\2\u0081\u0187\3\2\2\2\u0083\u0197\3\2\2"+
		"\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\2\2\2\u008b"+
		"\4\3\2\2\2\u008c\u008d\7-\2\2\u008d\6\3\2\2\2\u008e\u008f\7-\2\2\u008f"+
		"\u0090\7-\2\2\u0090\b\3\2\2\2\u0091\u0092\7/\2\2\u0092\n\3\2\2\2\u0093"+
		"\u0094\7/\2\2\u0094\u0095\7/\2\2\u0095\f\3\2\2\2\u0096\u0097\7,\2\2\u0097"+
		"\16\3\2\2\2\u0098\u0099\7\61\2\2\u0099\20\3\2\2\2\u009a\u009b\7\'\2\2"+
		"\u009b\22\3\2\2\2\u009c\u009d\7?\2\2\u009d\24\3\2\2\2\u009e\u009f\7?\2"+
		"\2\u009f\u00a0\7?\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a3"+
		"\7?\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\32\3\2\2\2\u00a6\u00a7"+
		"\7@\2\2\u00a7\u00a8\7?\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\36"+
		"\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7?\2\2\u00ad \3\2\2\2\u00ae\u00af"+
		"\7(\2\2\u00af\u00b0\7(\2\2\u00b0\"\3\2\2\2\u00b1\u00b2\7~\2\2\u00b2\u00b3"+
		"\7~\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7=\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7"+
		".\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7\60\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7"+
		"*\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd.\3\2\2\2\u00be\u00bf\7]"+
		"\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7_\2\2\u00c1\62\3\2\2\2\u00c2\u00c3"+
		"\7}\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7\177\2\2\u00c5\66\3\2\2\2\u00c6"+
		"\u00c7\t\3\2\2\u00c78\3\2\2\2\u00c8\u00ca\t\4\2\2\u00c9\u00c8\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc:\3"+
		"\2\2\2\u00cd\u00ce\7#\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7%\2\2\u00d0>\3\2"+
		"\2\2\u00d1\u00d2\7&\2\2\u00d2@\3\2\2\2\u00d3\u00d4\7(\2\2\u00d4B\3\2\2"+
		"\2\u00d5\u00d6\7<\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7A\2\2\u00d8F\3\2\2\2"+
		"\u00d9\u00da\7B\2\2\u00daH\3\2\2\2\u00db\u00dc\t\5\2\2\u00dcJ\3\2\2\2"+
		"\u00dd\u00df\t\6\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1L\3\2\2\2\u00e2\u00eb\5\67\34\2\u00e3"+
		"\u00e7\59\35\2\u00e4\u00e6\5K&\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2"+
		"\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ebN\3\2\2\2\u00ec"+
		"\u00ed\5I%\2\u00ed\u00ee\7-\2\2\u00ee\u00ef\5K&\2\u00ef\u00f0\7-\2\2\u00f0"+
		"\u00f1\5;\36\2\u00f1\u00f2\5]/\2\u00f2\u00f3\5=\37\2\u00f3\u00f4\5? \2"+
		"\u00f4\u00f5\5\21\t\2\u00f5\u00f6\5A!\2\u00f6\u00f7\5W,\2\u00f7\u00f8"+
		"\5+\26\2\u00f8\u00f9\5-\27\2\u00f9\u00fa\5\r\7\2\u00fa\u00fb\5\5\3\2\u00fb"+
		"\u00fc\5\'\24\2\u00fc\u00fd\5\t\5\2\u00fd\u00fe\5)\25\2\u00fe\u00ff\5"+
		"\17\b\2\u00ff\u0100\5C\"\2\u0100\u0101\5%\23\2\u0101\u0102\5\35\17\2\u0102"+
		"\u0103\5\23\n\2\u0103\u0104\5\31\r\2\u0104\u0105\5E#\2\u0105\u0106\5G"+
		"$\2\u0106P\3\2\2\2\u0107\u010c\5I%\2\u0108\u010b\5I%\2\u0109\u010b\5K"+
		"&\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dR\3\2\2\2\u010e\u010c\3\2\2\2"+
		"\u010f\u0113\5K&\2\u0110\u0112\5K&\2\u0111\u0110\3\2\2\2\u0112\u0115\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114T\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0116\u0119\5W,\2\u0117\u011a\5O(\2\u0118\u011a\t\7\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\5W"+
		",\2\u011cV\3\2\2\2\u011d\u011e\7)\2\2\u011eX\3\2\2\2\u011f\u0120\7v\2"+
		"\2\u0120\u0121\7t\2\2\u0121\u0122\7w\2\2\u0122\u0123\7g\2\2\u0123Z\3\2"+
		"\2\2\u0124\u0125\7h\2\2\u0125\u0126\7c\2\2\u0126\u0127\7n\2\2\u0127\u0128"+
		"\7u\2\2\u0128\u0129\7g\2\2\u0129\\\3\2\2\2\u012a\u012b\7\"\2\2\u012b\u012c"+
		"\7$\2\2\u012c\u012d\7\"\2\2\u012d^\3\2\2\2\u012e\u0131\5W,\2\u012f\u0132"+
		"\5I%\2\u0130\u0132\5\3\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\5W,\2\u0134`\3\2\2\2\u0135\u0139\5K&\2\u0136"+
		"\u0138\5K&\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2"+
		"\2\u0139\u013a\3\2\2\2\u013ab\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d"+
		"\5K&\2\u013d\u013e\5)\25\2\u013e\u013f\5K&\2\u013fd\3\2\2\2\u0140\u0143"+
		"\5Y-\2\u0141\u0143\5[.\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143"+
		"f\3\2\2\2\u0144\u0145\5]/\2\u0145\u0146\13\2\2\2\u0146\u0147\5]/\2\u0147"+
		"h\3\2\2\2\u0148\u0149\7k\2\2\u0149\u014a\7h\2\2\u014aj\3\2\2\2\u014b\u014c"+
		"\7g\2\2\u014c\u014d\7n\2\2\u014d\u014e\7u\2\2\u014e\u014f\7g\2\2\u014f"+
		"l\3\2\2\2\u0150\u0151\7d\2\2\u0151\u0152\7t\2\2\u0152\u0153\7g\2\2\u0153"+
		"\u0154\7c\2\2\u0154\u0155\7m\2\2\u0155n\3\2\2\2\u0156\u0157\7e\2\2\u0157"+
		"\u0158\7n\2\2\u0158\u0159\7c\2\2\u0159\u015a\7u\2\2\u015a\u015b\7u\2\2"+
		"\u015bp\3\2\2\2\u015c\u015d\7e\2\2\u015d\u015e\7q\2\2\u015e\u015f\7p\2"+
		"\2\u015f\u0160\7u\2\2\u0160\u0161\7v\2\2\u0161r\3\2\2\2\u0162\u0163\7"+
		"p\2\2\u0163\u0164\7g\2\2\u0164\u0165\7y\2\2\u0165t\3\2\2\2\u0166\u0167"+
		"\7t\2\2\u0167\u0168\7g\2\2\u0168\u0169\7c\2\2\u0169\u016a\7f\2\2\u016a"+
		"v\3\2\2\2\u016b\u016c\7t\2\2\u016c\u016d\7g\2\2\u016d\u016e\7v\2\2\u016e"+
		"\u016f\7w\2\2\u016f\u0170\7t\2\2\u0170\u0171\7p\2\2\u0171x\3\2\2\2\u0172"+
		"\u0173\7x\2\2\u0173\u0174\7q\2\2\u0174\u0175\7k\2\2\u0175\u0176\7f\2\2"+
		"\u0176z\3\2\2\2\u0177\u0178\7y\2\2\u0178\u0179\7j\2\2\u0179\u017a\7k\2"+
		"\2\u017a\u017b\7n\2\2\u017b\u017c\7g\2\2\u017c|\3\2\2\2\u017d\u017e\7"+
		"y\2\2\u017e\u017f\7t\2\2\u017f\u0180\7k\2\2\u0180\u0181\7v\2\2\u0181\u0182"+
		"\7g\2\2\u0182~\3\2\2\2\u0183\u0184\7h\2\2\u0184\u0185\7q\2\2\u0185\u0186"+
		"\7t\2\2\u0186\u0080\3\2\2\2\u0187\u0188\7\61\2\2\u0188\u0189\7,\2\2\u0189"+
		"\u018f\3\2\2\2\u018a\u018e\5I%\2\u018b\u018e\5K&\2\u018c\u018e\5\u0081"+
		"A\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7,\2\2\u0193\u0194\7\61\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0196\bA\2\2\u0196\u0082\3\2\2\2\u0197\u0198\7\61"+
		"\2\2\u0198\u0199\7\61\2\2\u0199\u019c\3\2\2\2\u019a\u019d\5I%\2\u019b"+
		"\u019d\5K&\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2"+
		"\2\u019e\u019f\bB\2\2\u019f\u0084\3\2\2\2\22\2\u0088\u00cb\u00e0\u00e7"+
		"\u00ea\u010a\u010c\u0113\u0119\u0131\u0139\u0142\u018d\u018f\u019c\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}