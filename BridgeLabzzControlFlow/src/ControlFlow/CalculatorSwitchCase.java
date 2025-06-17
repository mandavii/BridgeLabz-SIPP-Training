package ControlFlow;

import java.util.Scanner;

public class CalculatorSwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first;
        double second;
        String op; // Operator

        System.out.print("Enter first number: ");
        first = input.nextDouble();

        System.out.print("Enter second number: ");
        second = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        op = input.next();

        double result;

        switch (op) {
            case "+":
                result = first + second;
                System.out.println(first + " " + op + " " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println(first + " " + op + " " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println(first + " " + op + " " + second + " = " + result);
                break;
            case "/":
                if (second != 0) { // Check for division by zero
                    result = first / second;
                    System.out.println(first + " " + op + " " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }

        input.close();
    }
}
