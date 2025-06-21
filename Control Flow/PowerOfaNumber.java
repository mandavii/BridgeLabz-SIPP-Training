package ControlFlow;

import java.util.Scanner;

public class PowerOfaNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int power;
        int result = 1;
        int counter = 0;

        System.out.print("Enter the base number: ");
        number = input.nextInt();

        System.out.print("Enter the exponent (power): ");
        power = input.nextInt();

        
        if (power < 0) {
            System.out.println("Power cannot be negative for this calculation.");
        } else if (power == 0) {
        
            System.out.println(number + " to the power of " + power + " is: 1");
        } else {
            while (counter < power) {
                result = result * number;
                counter++;
            }
            System.out.println(number + " to the power of " + power + " is: " + result);
        }

        input.close();
    }
}
