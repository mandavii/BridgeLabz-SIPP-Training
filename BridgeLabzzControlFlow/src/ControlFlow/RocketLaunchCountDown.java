package ControlFlow;

import java.util.Scanner;

public class RocketLaunchCountDown {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter;

        System.out.print("Enter the starting number for the countdown: ");
        counter = input.nextInt();

        if (counter <= 0) {
            System.out.println("Countdown value must be a positive integer.");
        } else {
            for (int i = counter; i >= 1; i--) {
                System.out.println(i + "...");
            }
            System.out.println("Lift off!");
        }

        input.close();
    }
}
