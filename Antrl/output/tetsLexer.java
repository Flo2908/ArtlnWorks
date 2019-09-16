// $ANTLR null C:\\Users\\fschaffer\\Antrl\\tets.g 2019-09-16 14:22:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tetsLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int Lit=4;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tetsLexer() {} 
	public tetsLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tetsLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\fschaffer\\Antrl\\tets.g"; }

	// $ANTLR start "T__5"
	public final void mT__5() throws RecognitionException {
		try {
			int _type = T__5;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fschaffer\\Antrl\\tets.g:2:6: ( '(' )
			// C:\\Users\\fschaffer\\Antrl\\tets.g:2:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__5"

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fschaffer\\Antrl\\tets.g:3:6: ( ')' )
			// C:\\Users\\fschaffer\\Antrl\\tets.g:3:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fschaffer\\Antrl\\tets.g:4:6: ( '+' )
			// C:\\Users\\fschaffer\\Antrl\\tets.g:4:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fschaffer\\Antrl\\tets.g:5:6: ( '-' )
			// C:\\Users\\fschaffer\\Antrl\\tets.g:5:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fschaffer\\Antrl\\tets.g:6:6: ( '/' )
			// C:\\Users\\fschaffer\\Antrl\\tets.g:6:8: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "Lit"
	public final void mLit() throws RecognitionException {
		try {
			int _type = Lit;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\fschaffer\\Antrl\\tets.g:18:14: ( ( 'A' .. 'Z' | 'a' .. 'z' )+ )
			// C:\\Users\\fschaffer\\Antrl\\tets.g:18:26: ( 'A' .. 'Z' | 'a' .. 'z' )+
			{
			// C:\\Users\\fschaffer\\Antrl\\tets.g:18:26: ( 'A' .. 'Z' | 'a' .. 'z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\fschaffer\\Antrl\\tets.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Lit"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\fschaffer\\Antrl\\tets.g:1:8: ( T__5 | T__6 | T__7 | T__8 | T__9 | Lit )
		int alt2=6;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt2=1;
			}
			break;
		case ')':
			{
			alt2=2;
			}
			break;
		case '+':
			{
			alt2=3;
			}
			break;
		case '-':
			{
			alt2=4;
			}
			break;
		case '/':
			{
			alt2=5;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt2=6;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 2, 0, input);
			throw nvae;
		}
		switch (alt2) {
			case 1 :
				// C:\\Users\\fschaffer\\Antrl\\tets.g:1:10: T__5
				{
				mT__5(); 

				}
				break;
			case 2 :
				// C:\\Users\\fschaffer\\Antrl\\tets.g:1:15: T__6
				{
				mT__6(); 

				}
				break;
			case 3 :
				// C:\\Users\\fschaffer\\Antrl\\tets.g:1:20: T__7
				{
				mT__7(); 

				}
				break;
			case 4 :
				// C:\\Users\\fschaffer\\Antrl\\tets.g:1:25: T__8
				{
				mT__8(); 

				}
				break;
			case 5 :
				// C:\\Users\\fschaffer\\Antrl\\tets.g:1:30: T__9
				{
				mT__9(); 

				}
				break;
			case 6 :
				// C:\\Users\\fschaffer\\Antrl\\tets.g:1:35: Lit
				{
				mLit(); 

				}
				break;

		}
	}



}
