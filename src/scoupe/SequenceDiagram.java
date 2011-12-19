package scoupe;

import util.Stack;
import util.Indenter;

public abstract class SequenceDiagram {
  public abstract void accept(Visitor visitor);
  
  public String toString() {
    PrintVisitor visitor = new PrintVisitor();
    accept(visitor);
    return visitor.toString();
  }
  
  public static String stripQuotes(String str) {
    if (str.charAt(0) == '"' && str.charAt(str.length()-1) == '"') {
      return str.substring(1,str.length()-1);
    } else return str;
  }
  
  public static Stack<String> stripQuotes(Stack<String> stack) {
    if (stack.isEmpty()) return stack;
    
    return stripQuotes(stack.tail()).push(stripQuotes(stack.head()));
  }
  
  public static class PrintVisitor implements Visitor {
    Indenter indenter;
    
    public PrintVisitor() {
      indenter = new Indenter(); 
    }
    
    public void visitSequence(Sequence seq) {
      for (Block b : seq.blocks) {
        b.accept(this);
        indenter.println();
      }
    }
    public void visitMessage(Message msg) {
      indenter.print(msg.src + " -- " + msg.name + " -> " + msg.dest);
    }
    public void visitAlt(Alt alt) {
      Stack<String> guardIt = alt.guards;
      Stack<Sequence> seqIt = alt.sequences;
      boolean isFirst = true;
      while (!guardIt.isEmpty()) {
        if (isFirst) { isFirst = false; }
        else { indenter.print("else"); }

        indenter.println("if " + guardIt.head() + " then").indent();
        seqIt.head().accept(this);
        indenter.deindent();
        guardIt = guardIt.tail();
        seqIt = seqIt.tail();
      }
      if (alt.defaultBranch != null) {
        indenter.println("else").indent();
        alt.defaultBranch.accept(this);
        indenter.deindent();
      }
    }
    public void visitLoop(Loop loop) {
      indenter.println("while " + loop.condition).indent();
      loop.sequence.accept(this);
      indenter.deindent();
    }
    public void visitRef(Ref ref) {
      indenter.println(ref.name + " = ").indent();
      ref.sequence.accept(this);
      indenter.deindent();
    }
    public String toString() { return indenter.toString(); }
  }

  public static class Sequence extends SequenceDiagram {
    public final Stack<Block> blocks;  // this stack must not be empty
    
    public Sequence(Stack<Block> blocks) {
      if (blocks.isEmpty()) throw new RuntimeException();
      this.blocks = blocks;
    }
    
    public void accept(Visitor visitor) { visitor.visitSequence(this); }
  }
  
  public static abstract class Block extends SequenceDiagram {}
  
  public static class Message extends Block {
    public final String src;
    public final String dest;
    public final String name;

    public Message(String src, String dest, String name) {
      this.src = stripQuotes(src);
      this.dest = stripQuotes(dest);
      this.name = stripQuotes(name);
    }
    
    public void accept(Visitor visitor) { visitor.visitMessage(this); }
  }

  public static class Alt extends Block {
    public final Stack<String> guards;
    public final Stack<Sequence> sequences;
    public final Sequence defaultBranch;  // can be null
    
    public Alt(Stack<String> guards, Stack<Sequence> sequences, Sequence defaultBranch) {
      if (guards.isEmpty() || guards.size() != sequences.size()) throw new RuntimeException();
      this.guards = stripQuotes(guards);
      this.sequences = sequences;
      this.defaultBranch = defaultBranch;
    }
    
    public void accept(Visitor visitor) { visitor.visitAlt(this); }
  }

  public static class Loop extends Block {
    public final String condition;
    public final Sequence sequence;
    
    public Loop(String condition, Sequence sequence) {
      this.condition = stripQuotes(condition);
      this.sequence = sequence;
    }
    public void accept(Visitor visitor) { visitor.visitLoop(this); }
  }

  public static class Ref extends Block {
    public final String name;
    public final Sequence sequence;
    
    public Ref(String name, Sequence sequence) {
      this.name = stripQuotes(name);
      this.sequence = sequence;
    }
    
    public void accept(Visitor visitor) { visitor.visitRef(this); }
  }
  
  public static interface Visitor {
    public abstract void visitSequence(Sequence seq);
    public abstract void visitMessage(Message msg);
    public abstract void visitAlt(Alt alt);
    public abstract void visitLoop(Loop loop);
    public abstract void visitRef(Ref ref);
  }
}
