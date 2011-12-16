// $ANTLR 3.4 C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g 2011-12-15 22:33:24

package dsl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SequenceLexer extends Lexer {
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
    public String getGrammarFileName() { return "C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:11:6: ( '--' )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:11:8: '--'
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:12:6: ( '->' )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:12:8: '->'
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
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:13:7: ( ';' )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:13:9: ';'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:14:7: ( '[' )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:14:9: '['
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
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:15:7: ( ']' )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:15:9: ']'
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
    // $ANTLR end "T__12"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:56:8: ( '\"' ( ALPHA | DIGIT | WHITESPACE | '.' )+ '\"' )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:56:10: '\"' ( ALPHA | DIGIT | WHITESPACE | '.' )+ '\"'
            {
            match('\"'); 

            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:56:14: ( ALPHA | DIGIT | WHITESPACE | '.' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
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
                    alt1=1;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt1=2;
                    }
                    break;
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    {
                    alt1=3;
                    }
                    break;
                case '.':
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:56:15: ALPHA
            	    {
            	    mALPHA(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:56:21: DIGIT
            	    {
            	    mDIGIT(); 


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:56:27: WHITESPACE
            	    {
            	    mWHITESPACE(); 


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:56:38: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:58:21: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+ )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:58:23: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
            {
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:58:23: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:59:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:
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
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:60:16: ( '0' .. '9' )
            // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:
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
        // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | STRING )
        int alt3=6;
        switch ( input.LA(1) ) {
        case '-':
            {
            int LA3_1 = input.LA(2);

            if ( (LA3_1=='-') ) {
                alt3=1;
            }
            else if ( (LA3_1=='>') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 1, input);

                throw nvae;

            }
            }
            break;
        case ';':
            {
            alt3=3;
            }
            break;
        case '[':
            {
            alt3=4;
            }
            break;
        case ']':
            {
            alt3=5;
            }
            break;
        case '\"':
            {
            alt3=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // C:\\Users\\Shahan\\workspace\\Scoupe2\\dsl\\Sequence.g:1:38: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


 

}