package com.lambda;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to input individually or as a block? Answer 'indi' or 'block'");

        String userInput = scanner.next();

        switch (userInput) {
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

                System.out.println("What is your calculation?");

                ArrayList<String> calcList = new ArrayList<>();

                while (scanner.hasNext()) {
                    String s1 = scanner.next();
                    if ("|".equals(s1)) {
                        break;
                    } else calcList.add(s1);
                }

                System.out.println(calcList);

                break;
            default:
                System.out.println("Not a valid input.");
                break;
        }
    }
}
