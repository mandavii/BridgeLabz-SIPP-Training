package ControlFlow;

import java.util.Scanner;

public class PowerOfaNumberWhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a positive integer to find its factors: ");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " (excluding itself) are:");
            int counter = 1;
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
        input.close();
    }
}
