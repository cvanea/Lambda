package com.lambda;

public abstract class Operation<T> {

    public abstract T evaluate(Variable x, Variable y);

    public static Operation getInstance(String name) throws InvalidOperationException {
        switch (name) {
            case "+":
                return new Addition();
            case "*": case "x":
                return new Multiplication();
            case "-":
                return new Subtraction();
            case "/":
                return new Division();
            default:
                throw new InvalidOperationException();
        }
    }
}
