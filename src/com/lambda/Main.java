package com.lambda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to input individually or as a block? Answer 'indi' or 'block'");

        String userinput = scanner.next();

        switch (userinput) {
            case "indi":

                Variable x = new Variable("x");
                Variable y = new Variable("y");

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
                break;
            case "block":
                scanner.useDelimiter("");

                System.out.print("What is your calculation?");
                
                while (scanner.hasNext()) {
                    System.out.print(scanner.next());
                }

                break;
            default:
                System.out.println("Not a valid input.");
                break;
        }
    }
}
