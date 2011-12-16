package scoupe;

import util.Stack;

public abstract class SequenceDiagram {
  public abstract void accept(Visitor visitor);

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
      this.src = src;
      this.dest = dest;
      this.name = name;
    }
    
    public void accept(Visitor visitor) { visitor.visitMessage(this); }
  }

  public static class Alt extends Block {
    public final Stack<String> guards;
    public final Stack<Sequence> sequences;
    public final Sequence defaultBranch;  // can be null
    
    public Alt(Stack<String> guards, Stack<Sequence> sequences, Sequence defaultBranch) {
      if (guards.isEmpty() || guards.size() != sequences.size()) throw new RuntimeException();
      this.guards = guards;
      this.sequences = sequences;
      this.defaultBranch = defaultBranch;
    }
    
    public void accept(Visitor visitor) { visitor.visitAlt(this); }
  }

  public static class Loop extends Block {
    public final String condition;
    public final Sequence sequence;
    
    public Loop(String condition, Sequence sequence) {
      this.condition = condition;
      this.sequence = sequence;
    }
    public void accept(Visitor visitor) { visitor.visitLoop(this); }
  }

  public static class Ref extends Block {
    public final String name;
    public final Sequence sequence;
    
    public Ref(String name, Sequence sequence) {
      this.name = name;
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
