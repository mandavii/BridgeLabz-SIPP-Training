package ControlFlow;

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Enter a year to check if it's a leap year: ");
        year = input.nextInt();

        if (year < 1582) {
            System.out.println("The Leap Year program only works for years >= 1582 (Gregorian calendar).");
        } else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        input.close();
    }
}
