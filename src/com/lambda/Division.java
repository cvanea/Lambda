package com.lambda;

public class Division extends Operation<Double> {

    public Double evaluate(Variable x, Variable y) {
        return (double) x.getValue() / (double) y.getValue();
    }
}
