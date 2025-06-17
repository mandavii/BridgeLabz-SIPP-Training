package ControlFlow;

import java.util.Scanner;

public class YoungestOf3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables for ages and heights
        int amarAge, akbarAge, anthonyAge;
        double amarHeight, akbarHeight, anthonyHeight;

        // Get input for Amar
        System.out.print("Enter Amar's age: ");
        amarAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        amarHeight = input.nextDouble();

        // Get input for Akbar
        System.out.print("Enter Akbar's age: ");
        akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        akbarHeight = input.nextDouble();

        // Get input for Anthony
        System.out.print("Enter Anthony's age: ");
        anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        anthonyHeight = input.nextDouble();

        // Find the youngest friend
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Find the tallest friend
        double tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + youngestFriend + " (Age: " + youngestAge + ").");
        System.out.println("The tallest friend is " + tallestFriend + " (Height: " + tallestHeight + " cm).");

        input.close();
    }
}
