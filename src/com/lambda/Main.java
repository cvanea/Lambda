package com.lambda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Variable x = new Variable("x");
        Variable y = new Variable("y");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("What is your first number?");

            x.setValue(scanner.nextInt());

            System.out.println("What is your second number?");

            y.setValue(scanner.nextInt());

            System.out.println("What operation would you like?");

            Operation operation = Operation.getInstance(scanner.next());

            System.out.println(operation.evaluate(x, y));

        } catch (InvalidOperationException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Not a number!");
        }
    }
}
