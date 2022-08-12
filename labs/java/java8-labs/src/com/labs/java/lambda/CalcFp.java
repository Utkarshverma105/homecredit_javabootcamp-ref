package com.labs.java.lambda;

/**
 * Calculator with Functional Programming
 */
public class CalcFp {

    public int add(int operand1, int operand2) {
        int result = operand1 + operand2;
        return result;
    }

    public int substract(int operand1, int operand2) {
        return operand1 - operand2;
    }

    public int multiply(int operand1, int operand2) {
        return operand1 * operand2;
    }

    public int divide(int operand1, int operand2) {
        return operand1 / operand2;
    }
}
