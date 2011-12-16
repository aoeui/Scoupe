// $ANTLR 3.4 /home/shahan/git/Scoupe/dsl/Sequence.g 2011-12-16 16:06:44

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "COMMENT", "DIGIT", "STRING", "WHITESPACE", "'('", "')'", "'--'", "'->'", "';'", "'<'", "'>'", "'['", "']'", "'{'", "'}'"
    };

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
    public String getGrammarFileName() { return "/home/shahan/git/Scoupe/dsl/Sequence.g"; }

     


    // $ANTLR start "sequenceDiagram"
    // /home/shahan/git/Scoupe/dsl/Sequence.g:20:1: sequenceDiagram returns [SequenceDiagram.Ref diagram] : name= STRING seq= sequence ;
    public final SequenceDiagram.Ref sequenceDiagram() throws RecognitionException {
        SequenceDiagram.Ref diagram = null;


        Token name=null;
        SequenceDiagram.Sequence seq =null;


        try {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:21:3: (name= STRING seq= sequence )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:21:5: name= STRING seq= sequence
            {
            name=(Token)match(input,STRING,FOLLOW_STRING_in_sequenceDiagram53); 

            pushFollow(FOLLOW_sequence_in_sequenceDiagram57);
            seq=sequence();

            state._fsp--;


             diagram = new SequenceDiagram.Ref((name!=null?name.getText():null), seq); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return diagram;
    }
    // $ANTLR end "sequenceDiagram"



    // $ANTLR start "sequence"
    // /home/shahan/git/Scoupe/dsl/Sequence.g:24:1: sequence returns [SequenceDiagram.Sequence seq] : (b0= block ) ( ';' bNext= block )* ;
    public final SequenceDiagram.Sequence sequence() throws RecognitionException {
        SequenceDiagram.Sequence seq = null;


        SequenceDiagram.Block b0 =null;

        SequenceDiagram.Block bNext =null;


        try {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:25:3: ( (b0= block ) ( ';' bNext= block )* )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:25:5: (b0= block ) ( ';' bNext= block )*
            {
             util.Stack<SequenceDiagram.Block> blocks = util.Stack.<SequenceDiagram.Block>emptyInstance(); 

            // /home/shahan/git/Scoupe/dsl/Sequence.g:26:3: (b0= block )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:26:4: b0= block
            {
            pushFollow(FOLLOW_block_in_sequence83);
            b0=block();

            state._fsp--;


             blocks = blocks.push(b0); 

            }


            // /home/shahan/git/Scoupe/dsl/Sequence.g:26:44: ( ';' bNext= block )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/shahan/git/Scoupe/dsl/Sequence.g:26:45: ';' bNext= block
            	    {
            	    match(input,13,FOLLOW_13_in_sequence89); 

            	    pushFollow(FOLLOW_block_in_sequence93);
            	    bNext=block();

            	    state._fsp--;


            	     blocks=blocks.push(bNext); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


             seq=new SequenceDiagram.Sequence(blocks.reverse()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return seq;
    }
    // $ANTLR end "sequence"



    // $ANTLR start "block"
    // /home/shahan/git/Scoupe/dsl/Sequence.g:30:1: block returns [SequenceDiagram.Block block] : ( (retMsg= message ) | (retAlt= alt ) | (retLoop= loop ) | (retRef= ref ) );
    public final SequenceDiagram.Block block() throws RecognitionException {
        SequenceDiagram.Block block = null;


        SequenceDiagram.Message retMsg =null;

        SequenceDiagram.Alt retAlt =null;

        SequenceDiagram.Loop retLoop =null;

        SequenceDiagram.Ref retRef =null;


        try {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:31:3: ( (retMsg= message ) | (retAlt= alt ) | (retLoop= loop ) | (retRef= ref ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==STRING) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==11) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==17) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case 9:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:31:4: (retMsg= message )
                    {
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:31:4: (retMsg= message )
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:31:6: retMsg= message
                    {
                    pushFollow(FOLLOW_message_in_block122);
                    retMsg=message();

                    state._fsp--;


                    block = retMsg;

                    }


                    }
                    break;
                case 2 :
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:32:4: (retAlt= alt )
                    {
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:32:4: (retAlt= alt )
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:32:6: retAlt= alt
                    {
                    pushFollow(FOLLOW_alt_in_block134);
                    retAlt=alt();

                    state._fsp--;


                    block = retAlt;

                    }


                    }
                    break;
                case 3 :
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:33:4: (retLoop= loop )
                    {
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:33:4: (retLoop= loop )
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:33:6: retLoop= loop
                    {
                    pushFollow(FOLLOW_loop_in_block146);
                    retLoop=loop();

                    state._fsp--;


                    block = retLoop;

                    }


                    }
                    break;
                case 4 :
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:34:4: (retRef= ref )
                    {
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:34:4: (retRef= ref )
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:34:6: retRef= ref
                    {
                    pushFollow(FOLLOW_ref_in_block158);
                    retRef=ref();

                    state._fsp--;


                    block=retRef;

                    }


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
        return block;
    }
    // $ANTLR end "block"



    // $ANTLR start "message"
    // /home/shahan/git/Scoupe/dsl/Sequence.g:37:1: message returns [SequenceDiagram.Message msg] : '[' src= STRING '--' msgName= STRING '->' dest= STRING ']' ;
    public final SequenceDiagram.Message message() throws RecognitionException {
        SequenceDiagram.Message msg = null;


        Token src=null;
        Token msgName=null;
        Token dest=null;

        try {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:38:3: ( '[' src= STRING '--' msgName= STRING '->' dest= STRING ']' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:38:5: '[' src= STRING '--' msgName= STRING '->' dest= STRING ']'
            {
            match(input,16,FOLLOW_16_in_message178); 

            src=(Token)match(input,STRING,FOLLOW_STRING_in_message182); 

            match(input,11,FOLLOW_11_in_message184); 

            msgName=(Token)match(input,STRING,FOLLOW_STRING_in_message188); 

            match(input,12,FOLLOW_12_in_message190); 

            dest=(Token)match(input,STRING,FOLLOW_STRING_in_message194); 

            match(input,17,FOLLOW_17_in_message196); 

             msg = new SequenceDiagram.Message((src!=null?src.getText():null), (msgName!=null?msgName.getText():null), (dest!=null?dest.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return msg;
    }
    // $ANTLR end "message"



    // $ANTLR start "alt"
    // /home/shahan/git/Scoupe/dsl/Sequence.g:41:1: alt returns [SequenceDiagram.Alt alt] : ( '(' guard= STRING ')' '{' seq1= sequence '}' )+ ( '{' def= sequence '}' )? ;
    public final SequenceDiagram.Alt alt() throws RecognitionException {
        SequenceDiagram.Alt alt = null;


        Token guard=null;
        SequenceDiagram.Sequence seq1 =null;

        SequenceDiagram.Sequence def =null;


        try {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:42:3: ( ( '(' guard= STRING ')' '{' seq1= sequence '}' )+ ( '{' def= sequence '}' )? )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:42:5: ( '(' guard= STRING ')' '{' seq1= sequence '}' )+ ( '{' def= sequence '}' )?
            {
             util.Stack<String> guards = util.Stack.<String>emptyInstance();
                  util.Stack<SequenceDiagram.Sequence> sequences = util.Stack.<SequenceDiagram.Sequence>emptyInstance();
                  SequenceDiagram.Sequence defaultBranch = null;
                  

            // /home/shahan/git/Scoupe/dsl/Sequence.g:46:3: ( '(' guard= STRING ')' '{' seq1= sequence '}' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==9) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/shahan/git/Scoupe/dsl/Sequence.g:46:5: '(' guard= STRING ')' '{' seq1= sequence '}'
            	    {
            	    match(input,9,FOLLOW_9_in_alt221); 

            	    guard=(Token)match(input,STRING,FOLLOW_STRING_in_alt225); 

            	    match(input,10,FOLLOW_10_in_alt227); 

            	    match(input,18,FOLLOW_18_in_alt229); 

            	    pushFollow(FOLLOW_sequence_in_alt233);
            	    seq1=sequence();

            	    state._fsp--;


            	    match(input,19,FOLLOW_19_in_alt235); 

            	     guards = guards.push((guard!=null?guard.getText():null)); sequences = sequences.push(seq1); 

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


            // /home/shahan/git/Scoupe/dsl/Sequence.g:46:123: ( '{' def= sequence '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/shahan/git/Scoupe/dsl/Sequence.g:46:124: '{' def= sequence '}'
                    {
                    match(input,18,FOLLOW_18_in_alt242); 

                    pushFollow(FOLLOW_sequence_in_alt246);
                    def=sequence();

                    state._fsp--;


                    match(input,19,FOLLOW_19_in_alt248); 

                     defaultBranch=def; 

                    }
                    break;

            }


             alt = new SequenceDiagram.Alt(guards.reverse(), sequences.reverse(), defaultBranch); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return alt;
    }
    // $ANTLR end "alt"



    // $ANTLR start "loop"
    // /home/shahan/git/Scoupe/dsl/Sequence.g:50:1: loop returns [SequenceDiagram.Loop loop] : '[' pred= STRING ']' '{' seq= sequence '}' ;
    public final SequenceDiagram.Loop loop() throws RecognitionException {
        SequenceDiagram.Loop loop = null;


        Token pred=null;
        SequenceDiagram.Sequence seq =null;


        try {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:51:3: ( '[' pred= STRING ']' '{' seq= sequence '}' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:51:5: '[' pred= STRING ']' '{' seq= sequence '}'
            {
            match(input,16,FOLLOW_16_in_loop275); 

            pred=(Token)match(input,STRING,FOLLOW_STRING_in_loop279); 

            match(input,17,FOLLOW_17_in_loop281); 

            match(input,18,FOLLOW_18_in_loop283); 

            pushFollow(FOLLOW_sequence_in_loop287);
            seq=sequence();

            state._fsp--;


            match(input,19,FOLLOW_19_in_loop289); 

             loop = new SequenceDiagram.Loop((pred!=null?pred.getText():null), seq); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return loop;
    }
    // $ANTLR end "loop"



    // $ANTLR start "ref"
    // /home/shahan/git/Scoupe/dsl/Sequence.g:54:1: ref returns [SequenceDiagram.Ref ref] : '<' name= STRING '>' '{' seq= sequence '}' ;
    public final SequenceDiagram.Ref ref() throws RecognitionException {
        SequenceDiagram.Ref ref = null;


        Token name=null;
        SequenceDiagram.Sequence seq =null;


        try {
            // /home/shahan/git/Scoupe/dsl/Sequence.g:55:3: ( '<' name= STRING '>' '{' seq= sequence '}' )
            // /home/shahan/git/Scoupe/dsl/Sequence.g:55:5: '<' name= STRING '>' '{' seq= sequence '}'
            {
            match(input,14,FOLLOW_14_in_ref308); 

            name=(Token)match(input,STRING,FOLLOW_STRING_in_ref312); 

            match(input,15,FOLLOW_15_in_ref314); 

            match(input,18,FOLLOW_18_in_ref316); 

            pushFollow(FOLLOW_sequence_in_ref320);
            seq=sequence();

            state._fsp--;


            match(input,19,FOLLOW_19_in_ref322); 

             ref = new SequenceDiagram.Ref((name!=null?name.getText():null), seq); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ref;
    }
    // $ANTLR end "ref"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_sequenceDiagram53 = new BitSet(new long[]{0x0000000000014200L});
    public static final BitSet FOLLOW_sequence_in_sequenceDiagram57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_sequence83 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_sequence89 = new BitSet(new long[]{0x0000000000014200L});
    public static final BitSet FOLLOW_block_in_sequence93 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_message_in_block122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alt_in_block134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_block146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ref_in_block158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_message178 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_in_message182 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_message184 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_in_message188 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_message190 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_in_message194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_message196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_alt221 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_in_alt225 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_alt227 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_alt229 = new BitSet(new long[]{0x0000000000014200L});
    public static final BitSet FOLLOW_sequence_in_alt233 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_alt235 = new BitSet(new long[]{0x0000000000040202L});
    public static final BitSet FOLLOW_18_in_alt242 = new BitSet(new long[]{0x0000000000014200L});
    public static final BitSet FOLLOW_sequence_in_alt246 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_alt248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_loop275 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_in_loop279 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_loop281 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_loop283 = new BitSet(new long[]{0x0000000000014200L});
    public static final BitSet FOLLOW_sequence_in_loop287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_loop289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ref308 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_in_ref312 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ref314 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ref316 = new BitSet(new long[]{0x0000000000014200L});
    public static final BitSet FOLLOW_sequence_in_ref320 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ref322 = new BitSet(new long[]{0x0000000000000002L});

}