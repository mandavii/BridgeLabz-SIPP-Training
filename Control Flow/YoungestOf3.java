package ControlFlow;

import java.util.Scanner;

public class YoungestOf3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int amarAge, akbarAge, anthonyAge;
        double amarHeight, akbarHeight, anthonyHeight;

    
        System.out.print("Enter Amar's age: ");
        amarAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        amarHeight = input.nextDouble();

    
        System.out.print("Enter Akbar's age: ");
        akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        akbarHeight = input.nextDouble();

        
        System.out.print("Enter Anthony's age: ");
        anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        anthonyHeight = input.nextDouble();

        
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

        
        System.out.println("The youngest friend is " + youngestFriend + " (Age: " + youngestAge + ").");
        System.out.println("The tallest friend is " + tallestFriend + " (Height: " + tallestHeight + " cm).");

        input.close();
    }
}
