package ControlFlow;

import java.util.Scanner;

public class MultipleOfNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive integer less than 100: ");
        number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Wrong entry: Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 (in descending order):");

            for (int i = 99; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}
