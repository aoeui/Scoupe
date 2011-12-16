// $ANTLR 3.4 C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g 2011-12-15 22:33:24

package dsl;

// import java.util.ArrayList;  // already included by antlr
import scoupe.SequenceDiagram;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SequenceParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "DIGIT", "STRING", "WHITESPACE", "'--'", "'->'", "';'", "'['", "']'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int ALPHA=4;
    public static final int DIGIT=5;
    public static final int STRING=6;
    public static final int WHITESPACE=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SequenceParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SequenceParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SequenceParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g"; }

     


    // $ANTLR start "sequenceDiagram"
    // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:20:1: sequenceDiagram : STRING sequence ;
    public final void sequenceDiagram() throws RecognitionException {
        try {
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:21:3: ( STRING sequence )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:21:5: STRING sequence
            {
            match(input,STRING,FOLLOW_STRING_in_sequenceDiagram47); 

            pushFollow(FOLLOW_sequence_in_sequenceDiagram49);
            sequence();

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
        return ;
    }
    // $ANTLR end "sequenceDiagram"



    // $ANTLR start "sequence"
    // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:24:1: sequence : message ( ';' message )* ;
    public final void sequence() throws RecognitionException {
        try {
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:25:3: ( message ( ';' message )* )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:25:5: message ( ';' message )*
            {
            pushFollow(FOLLOW_message_in_sequence62);
            message();

            state._fsp--;


            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:25:13: ( ';' message )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:25:14: ';' message
            	    {
            	    match(input,10,FOLLOW_10_in_sequence65); 

            	    pushFollow(FOLLOW_message_in_sequence67);
            	    message();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sequence"



    // $ANTLR start "message"
    // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:35:1: message : '[' STRING '--' STRING '->' STRING ']' ;
    public final void message() throws RecognitionException {
        try {
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:36:3: ( '[' STRING '--' STRING '->' STRING ']' )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:36:5: '[' STRING '--' STRING '->' STRING ']'
            {
            match(input,11,FOLLOW_11_in_message89); 

            match(input,STRING,FOLLOW_STRING_in_message91); 

            match(input,8,FOLLOW_8_in_message93); 

            match(input,STRING,FOLLOW_STRING_in_message95); 

            match(input,9,FOLLOW_9_in_message97); 

            match(input,STRING,FOLLOW_STRING_in_message99); 

            match(input,12,FOLLOW_12_in_message101); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "message"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_sequenceDiagram47 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_sequence_in_sequenceDiagram49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_sequence62 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_sequence65 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_message_in_sequence67 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_11_in_message89 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_message91 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_message93 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_message95 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_message97 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_STRING_in_message99 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_message101 = new BitSet(new long[]{0x0000000000000002L});

}