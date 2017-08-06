package com.lambda;

public class Addition extends Operation<Integer> {

    public Integer evaluate(Variable x, Variable y) {
        return x.getValue() + y.getValue();
    }
}
