package ControlFlow;

import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int greatestFactor = 1;

        System.out.print("Enter an integer to find its greatest factor (excluding itself): ");
        number = input.nextInt();

        if (number <= 1) {
            System.out.println("Cannot find a greatest factor (excluding itself) for numbers less than or equal to 1.");
        } else {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }

        input.close();
    }
}
