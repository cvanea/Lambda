package com.lambda;

public class InvalidOperationException extends Exception {
    public InvalidOperationException() {
        super("Not a valid operator");
    }
}
