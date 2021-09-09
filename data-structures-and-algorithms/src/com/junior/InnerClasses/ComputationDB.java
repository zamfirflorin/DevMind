package com.junior.InnerClasses;

import java.util.ArrayDeque;
import java.util.Queue;

public class ComputationDB {
 
  private Queue<IBinaryOperation> operations = new ArrayDeque<IBinaryOperation>();
 
  public boolean addOperation(IBinaryOperation op) {
    return operations.offer(op);
  }
 
  public IBinaryOperation generateOperation(char op, int op1, int op2) {
    switch (op) {
      case '+':
        return generateSum(op1, op2);
      case '-':
        return generateDif(op1, op2);        
      default:
        System.out.println("Operation type not defined");
        return null;
    }
  }
 
  public void executeAll() {
    while(!operations.isEmpty()) {
      operations.poll().execute();
    }
  }
 
  private IBinaryOperation generateSum(int op1, int op2) {
    class SumOp extends BinaryOperation {
      public SumOp(int op1, int op2) {
        super(op1, op2);
      }
 
      @Override
      public void execute() {
        System.out.println("SUM(" + super.op1 + ", " + super.op2 + ") = "
                           + (super.op1 + super.op2));
      }
    }
    return new SumOp(op1, op2);
  }
 
  private IBinaryOperation generateDif(int op1, int op2) {
    class DifOp extends BinaryOperation {
      public DifOp(int op1, int op2) {
        super(op1, op2);
      }
 
      @Override
      public void execute() {
        System.out.println("DIF(" + super.op1 + ", " + super.op2 + ") = "
                           + (super.op1 - super.op2));
      }
    }
    return new DifOp(op1, op2);
  }
 
  public interface IBinaryOperation {
    public void execute();
  }
 
  private abstract class BinaryOperation implements IBinaryOperation {
    protected int op1;
    protected int op2;
 
    public BinaryOperation(int op1, int op2) {
      this.op1 = op1;
      this.op2 = op2;
    }
  }
}