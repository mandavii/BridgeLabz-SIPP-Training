package ControlFlow;

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        int tempNumber; 

        System.out.print("Enter an integer to check if it's a Harshad number: ");
        number = input.nextInt();

       
        tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sum += digit; 
            tempNumber /= 10; 
        }

       
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        input.close();
    }
}
