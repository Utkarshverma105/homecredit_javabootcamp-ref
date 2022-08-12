package com.labs.java.lambda;

/**
 * Calculator with Object Oriented Programming
 */
public class CalcOop {

    private int operand1;
    private int operand2;

    private int result;

    public CalcOop(int a, int b) {
        this.operand1 = a;
        this.operand2 = b;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int add() {
        return this.operand1 + this.operand2;
    }

    public int substract() {
        return this.operand1 - this.operand2;
    }

    public int multiply() {
        return this.operand1 * this.operand2;
    }

    public int divide() {
        return this.operand1 / this.operand2;
    }

}
