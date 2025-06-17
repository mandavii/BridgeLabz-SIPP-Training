package ControlFlow;

import java.util.Scanner;

public class UserInputNumberFactor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a positive integer to find its factors: ");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i--) { // The hint says i < number, but for factors, it should go up to and include the number itself
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}
