package ControlFlow;

import java.util.Scanner;

public class CountTheNumberOfDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count = 0;

        System.out.print("Enter an integer to count its digits: ");
        number = input.nextInt();

        
        if (number == 0) {
            count = 1; // 0 has one digit
        } else {
            
            int tempNumber = Math.abs(number);
            while (tempNumber != 0) {
                tempNumber = tempNumber / 10; 
                count++; 
            }
        }

        System.out.println("The number of digits in " + number + " is: " + count);

        input.close();
    }
}
