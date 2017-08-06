package com.lambda;

public class Subtraction extends Operation<Integer> {

    public Integer evaluate(Variable x, Variable y) {
        return x.getValue() - y.getValue();
    }
}
