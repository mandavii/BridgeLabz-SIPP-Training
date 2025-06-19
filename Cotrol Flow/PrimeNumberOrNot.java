package ControlFlow;

import java.util.Scanner;

public class PrimeNumberOrNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        boolean isPrime = true;

        System.out.print("Enter an integer to check if it's a prime number: ");
        number = input.nextInt();

        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
           
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false; 
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
