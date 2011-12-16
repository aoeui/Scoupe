// $ANTLR 3.4 /home/shahan/git/Scoupe/dsl/Sequence.g 2011-12-16 16:54:58

package dsl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SequenceLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int ALPHA=4;
    public static final int COMMENT=5;
    public static final int DIGIT=6;
    public static final int STRING=7;
    public static final int WHITESPACE=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SequenceLexer() {} 
    public SequenceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SequenceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/shahan/git/Scoupe/dsl/Sequence.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:11:6: ( '(' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:11:8: '('
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:12:7: ( ')' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:12:9: ')'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:13:7: ( '--' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:13:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:14:7: ( '->' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:14:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:15:7: ( ';' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:16:7: ( '<' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:17:7: ( '>' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:18:7: ( '[' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:19:7: ( ']' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:20:7: ( '{' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:21:7: ( '}' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:59:3: ( '//' (~ ( '\\n' | '\\r' ) )* )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:59:5: '//' (~ ( '\\n' | '\\r' ) )*
            {
            match("//"); 



            // /home/shahan/git/Scoupe/dsl/Sequence.g:59:10: (~ ( '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/shahan/git/Scoupe/dsl/Sequence.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop1;
                }
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:63:7: ( '\"' (~ '\"' )+ '\"' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:63:9: '\"' (~ '\"' )+ '\"'
            {
            match('\"'); 

            // /home/shahan/git/Scoupe/dsl/Sequence.g:63:13: (~ '\"' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/shahan/git/Scoupe/dsl/Sequence.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shahan/git/Scoupe/dsl/Sequence.g:65:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+ )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:65:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
            {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:65:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/shahan/git/Scoupe/dsl/Sequence.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:66:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:
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


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALPHA"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:67:16: ( '0' .. '9' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // /home/shahan/git/Scoupe/dsl/Sequence.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | COMMENT | STRING | WHITESPACE )
        int alt4=14;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt4=1;
            }
            break;
        case ')':
            {
            alt4=2;
            }
            break;
        case '-':
            {
            int LA4_3 = input.LA(2);

            if ( (LA4_3=='-') ) {
                alt4=3;
            }
            else if ( (LA4_3=='>') ) {
                alt4=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 3, input);

                throw nvae;

            }
            }
            break;
        case ';':
            {
            alt4=5;
            }
            break;
        case '<':
            {
            alt4=6;
            }
            break;
        case '>':
            {
            alt4=7;
            }
            break;
        case '[':
            {
            alt4=8;
            }
            break;
        case ']':
            {
            alt4=9;
            }
            break;
        case '{':
            {
            alt4=10;
            }
            break;
        case '}':
            {
            alt4=11;
            }
            break;
        case '/':
            {
            alt4=12;
            }
            break;
        case '\"':
            {
            alt4=13;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt4=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:75: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 13 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:83: STRING
                {
                mSTRING(); 


                }
                break;
            case 14 :
                // /home/shahan/git/Scoupe/dsl/Sequence.g:1:90: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}