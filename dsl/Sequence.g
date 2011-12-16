grammar Sequence;

options {
  language = Java;
}

@header {
package dsl;

// import java.util.ArrayList;  // already included by antlr
import scoupe.SequenceDiagram;
}

@lexer::header {
package dsl;
}

@members { }

sequenceDiagram returns [SequenceDiagram.Ref diagram]
  : name=STRING seq=sequence { diagram = new SequenceDiagram.Ref($name.text, seq); }
  ;

sequence returns [SequenceDiagram.Sequence seq]
  : { util.Stack<SequenceDiagram.Block> blocks = util.Stack.<SequenceDiagram.Block>emptyInstance(); }
  (b0=block { blocks = blocks.push(b0); }) (';' bNext=block { blocks=blocks.push(bNext); } )*
  { seq=new SequenceDiagram.Sequence(blocks.reverse()); }
  ;

block returns [SequenceDiagram.Block block]
  :( retMsg=message {block = retMsg;})
  |( retAlt=alt {block = retAlt;})
  |( retLoop=loop {block = retLoop;})
  |( retRef=ref {block=retRef;})
  ;

message returns [SequenceDiagram.Message msg]
  : '[' src=STRING '--' msgName=STRING '->' dest=STRING ']' { msg = new SequenceDiagram.Message($src.text, $msgName.text, $dest.text); }
  ;

alt returns [SequenceDiagram.Alt alt]
  : { util.Stack<String> guards = util.Stack.<String>emptyInstance();
      util.Stack<SequenceDiagram.Sequence> sequences = util.Stack.<SequenceDiagram.Sequence>emptyInstance();
      SequenceDiagram.Sequence defaultBranch = null;
      }
  ( '(' guard=STRING ')' '{' seq1=sequence '}' { guards = guards.push($guard.text); sequences = sequences.push(seq1); })+ ('{' def=sequence '}' { defaultBranch=def; })?
    { alt = new SequenceDiagram.Alt(guards.reverse(), sequences.reverse(), defaultBranch); }
  ;

loop returns [SequenceDiagram.Loop loop]
  : '[' pred=STRING ']' '{' seq=sequence '}' { loop = new SequenceDiagram.Loop($pred.text, seq); }
  ;

ref returns [SequenceDiagram.Ref ref]
  : '<' name=STRING '>' '{' seq=sequence '}' { ref = new SequenceDiagram.Ref($name.text, seq); }
  ;

COMMENT
  : '//' (~('\n'|'\r'))*
    { $channel = HIDDEN; }
  ;

STRING : '"' (~'"')+ '"';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\f' )+ { $channel = HIDDEN; };
fragment ALPHA : ('a'..'z'|'A'..'Z');
fragment DIGIT : '0'..'9';