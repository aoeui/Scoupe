package test;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import dsl.SequenceLexer;
import dsl.SequenceParser;

public class ScoupeParser {
  public static void parse(String filename) throws IOException, RecognitionException {
    SequenceLexer lex = new SequenceLexer(new ANTLRFileStream(filename));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    SequenceParser parser = new SequenceParser(tokens);
	  
	parser.sequenceDiagram();
  }
  
  public static void main(String[] args) throws IOException, RecognitionException {
	parse("TestFiles/Test1.txt");
  }
}
