// $ANTLR null C:\\Users\\fschaffer\\Antrl\\tets.g 2019-09-16 14:22:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class tetsParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Lit", "'('", "')'", "'+'", "'-'", 
		"'/'"
	};
	public static final int EOF=-1;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int Lit=4;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "or", "not", "term", "rule", "and"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public tetsParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public tetsParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public tetsParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return tetsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\fschaffer\\Antrl\\tets.g"; }



	// $ANTLR start "rule"
	// C:\\Users\\fschaffer\\Antrl\\tets.g:2:1: rule : or EOF ;
	public final void rule() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(2, 0);

		try {
			// C:\\Users\\fschaffer\\Antrl\\tets.g:2:7: ( or EOF )
			dbg.enterAlt(1);

			// C:\\Users\\fschaffer\\Antrl\\tets.g:2:9: or EOF
			{
			dbg.location(2,9);
			pushFollow(FOLLOW_or_in_rule10);
			or();
			state._fsp--;
			dbg.location(2,12);
			match(input,EOF,FOLLOW_EOF_in_rule12); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(2, 14);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule"



	// $ANTLR start "or"
	// C:\\Users\\fschaffer\\Antrl\\tets.g:4:1: or : and ( '/' and )* ;
	public final void or() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "or");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(4, 0);

		try {
			// C:\\Users\\fschaffer\\Antrl\\tets.g:4:11: ( and ( '/' and )* )
			dbg.enterAlt(1);

			// C:\\Users\\fschaffer\\Antrl\\tets.g:4:21: and ( '/' and )*
			{
			dbg.location(4,21);
			pushFollow(FOLLOW_and_in_or36);
			and();
			state._fsp--;
			dbg.location(4,26);
			// C:\\Users\\fschaffer\\Antrl\\tets.g:4:26: ( '/' and )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==9) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\fschaffer\\Antrl\\tets.g:4:27: '/' and
					{
					dbg.location(4,27);
					match(input,9,FOLLOW_9_in_or40); dbg.location(4,32);
					pushFollow(FOLLOW_and_in_or43);
					and();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(5, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "or");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "or"



	// $ANTLR start "and"
	// C:\\Users\\fschaffer\\Antrl\\tets.g:7:1: and : not ( '+' not )* ;
	public final void and() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "and");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// C:\\Users\\fschaffer\\Antrl\\tets.g:7:10: ( not ( '+' not )* )
			dbg.enterAlt(1);

			// C:\\Users\\fschaffer\\Antrl\\tets.g:7:22: not ( '+' not )*
			{
			dbg.location(7,22);
			pushFollow(FOLLOW_not_in_and93);
			not();
			state._fsp--;
			dbg.location(7,26);
			// C:\\Users\\fschaffer\\Antrl\\tets.g:7:26: ( '+' not )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==7) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\fschaffer\\Antrl\\tets.g:7:27: '+' not
					{
					dbg.location(7,27);
					match(input,7,FOLLOW_7_in_and96); dbg.location(7,31);
					pushFollow(FOLLOW_not_in_and98);
					not();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(9, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "and");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "and"



	// $ANTLR start "not"
	// C:\\Users\\fschaffer\\Antrl\\tets.g:11:1: not : ( '-' )* term ;
	public final void not() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "not");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(11, 0);

		try {
			// C:\\Users\\fschaffer\\Antrl\\tets.g:11:10: ( ( '-' )* term )
			dbg.enterAlt(1);

			// C:\\Users\\fschaffer\\Antrl\\tets.g:11:22: ( '-' )* term
			{
			dbg.location(11,22);
			// C:\\Users\\fschaffer\\Antrl\\tets.g:11:22: ( '-' )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==8) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\fschaffer\\Antrl\\tets.g:11:22: '-'
					{
					dbg.location(11,22);
					match(input,8,FOLLOW_8_in_not172); 
					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(11,27);
			pushFollow(FOLLOW_term_in_not175);
			term();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(12, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "not");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "not"



	// $ANTLR start "term"
	// C:\\Users\\fschaffer\\Antrl\\tets.g:14:1: term : ( '(' or ')' | Lit );
	public final void term() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// C:\\Users\\fschaffer\\Antrl\\tets.g:14:9: ( '(' or ')' | Lit )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==5) ) {
				alt4=1;
			}
			else if ( (LA4_0==Lit) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\fschaffer\\Antrl\\tets.g:14:21: '(' or ')'
					{
					dbg.location(14,21);
					match(input,5,FOLLOW_5_in_term210); dbg.location(14,25);
					pushFollow(FOLLOW_or_in_term212);
					or();
					state._fsp--;
					dbg.location(14,28);
					match(input,6,FOLLOW_6_in_term214); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\fschaffer\\Antrl\\tets.g:15:25: Lit
					{
					dbg.location(15,25);
					match(input,Lit,FOLLOW_Lit_in_term240); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(16, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "term"

	// Delegated rules



	public static final BitSet FOLLOW_or_in_rule10 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_rule12 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_in_or36 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_or40 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_and_in_or43 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_not_in_and93 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_7_in_and96 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_not_in_and98 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_8_in_not172 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_term_in_not175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_5_in_term210 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_or_in_term212 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_term214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Lit_in_term240 = new BitSet(new long[]{0x0000000000000002L});
}
