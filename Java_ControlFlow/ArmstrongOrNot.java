package ControlFlow;

import java.util.Scanner;

public class ArmstrongOrNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        int originalNumber;
        int remainder;

        System.out.print("Enter an integer to check if it's an Armstrong number: ");
        number = input.nextInt();

        originalNumber = number; // Assign the input number to originalNumber

        while (originalNumber != 0) {
            remainder = originalNumber % 10; // Get the last digit
            sum = sum + (remainder * remainder * remainder); // Add the cube of the digit to sum
            originalNumber = originalNumber / 10; // Remove the last digit
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        input.close();
    }
}
