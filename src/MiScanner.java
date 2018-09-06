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
		PYC=1, PLUS=2, MINUS=3, MULT=4, DIV=5, COLON=6, IF=7, THEN=8, ELSE=9, 
		WHILE=10, LET=11, BEGIN=12, END=13, IN=14, DO=15, CONST=16, VAR=17, SYMBOL1=18, 
		PARENTHESIS_OPEN=19, PARENTHESIS_CLOSED=20, ASSIGN=21, ID=22, NUMBER=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PYC", "PLUS", "MINUS", "MULT", "DIV", "COLON", "IF", "THEN", "ELSE", 
		"WHILE", "LET", "BEGIN", "END", "IN", "DO", "CONST", "VAR", "SYMBOL1", 
		"PARENTHESIS_OPEN", "PARENTHESIS_CLOSED", "ASSIGN", "ID", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\7\27|\n\27\f\27\16"+
		"\27\177\13\27\3\30\6\30\u0082\n\30\r\30\16\30\u0083\3\31\6\31\u0087\n"+
		"\31\r\31\16\31\u0088\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\""+
		"\2\u008e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2"+
		"\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21B\3\2\2\2\23G\3\2\2\2\25L\3"+
		"\2\2\2\27R\3\2\2\2\31V\3\2\2\2\33\\\3\2\2\2\35`\3\2\2\2\37c\3\2\2\2!f"+
		"\3\2\2\2#l\3\2\2\2%p\3\2\2\2\'r\3\2\2\2)t\3\2\2\2+v\3\2\2\2-y\3\2\2\2"+
		"/\u0081\3\2\2\2\61\u0086\3\2\2\2\63\64\7=\2\2\64\4\3\2\2\2\65\66\7-\2"+
		"\2\66\6\3\2\2\2\678\7/\2\28\b\3\2\2\29:\7,\2\2:\n\3\2\2\2;<\7\61\2\2<"+
		"\f\3\2\2\2=>\7<\2\2>\16\3\2\2\2?@\7k\2\2@A\7h\2\2A\20\3\2\2\2BC\7v\2\2"+
		"CD\7j\2\2DE\7g\2\2EF\7p\2\2F\22\3\2\2\2GH\7g\2\2HI\7n\2\2IJ\7u\2\2JK\7"+
		"g\2\2K\24\3\2\2\2LM\7y\2\2MN\7j\2\2NO\7k\2\2OP\7n\2\2PQ\7g\2\2Q\26\3\2"+
		"\2\2RS\7n\2\2ST\7g\2\2TU\7v\2\2U\30\3\2\2\2VW\7d\2\2WX\7g\2\2XY\7i\2\2"+
		"YZ\7k\2\2Z[\7p\2\2[\32\3\2\2\2\\]\7g\2\2]^\7p\2\2^_\7f\2\2_\34\3\2\2\2"+
		"`a\7k\2\2ab\7p\2\2b\36\3\2\2\2cd\7f\2\2de\7q\2\2e \3\2\2\2fg\7e\2\2gh"+
		"\7q\2\2hi\7p\2\2ij\7u\2\2jk\7v\2\2k\"\3\2\2\2lm\7x\2\2mn\7c\2\2no\7t\2"+
		"\2o$\3\2\2\2pq\7\u0080\2\2q&\3\2\2\2rs\7*\2\2s(\3\2\2\2tu\7+\2\2u*\3\2"+
		"\2\2vw\7<\2\2wx\7?\2\2x,\3\2\2\2y}\t\2\2\2z|\t\3\2\2{z\3\2\2\2|\177\3"+
		"\2\2\2}{\3\2\2\2}~\3\2\2\2~.\3\2\2\2\177}\3\2\2\2\u0080\u0082\t\4\2\2"+
		"\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\60\3\2\2\2\u0085\u0087\t\5\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\b\31\2\2\u008b\62\3\2\2\2\6\2}\u0083\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}