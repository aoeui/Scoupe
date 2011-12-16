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

sequenceDiagram
  : STRING sequence
  ;

sequence
  : message (';' message)*
  ;

// block
//   : message
//   | alt
//   | loop
//   | ref
//   ;

message
  : '[' STRING '--' STRING '->' STRING ']'
  ;

// alt
//   : ( '(' string ')' '{' sequence '}')+ ('{' sequence '}')?
//   ;

// loop
//   : '[' string ']' '{' sequence '}'
//    ;

// ref
//   : '<' string '>' '{' sequence '}'
//   ;

// COMMENT
//   : '//' (~('\n'|'\r'))*
//     { $channel = HIDDEN; }
//   ;

STRING : '"' (ALPHA|DIGIT|WHITESPACE|'.')+ '"';

fragment WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\f' )+;
fragment ALPHA : ('a'..'z'|'A'..'Z');
fragment DIGIT : '0'..'9';