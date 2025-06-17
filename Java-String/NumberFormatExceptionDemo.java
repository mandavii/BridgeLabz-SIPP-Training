package CoreJavaStrings;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-numeric string to generate the exception: ");
        String badInputForGeneration = scanner.nextLine();
        try {
            generateNumberFormatException(badInputForGeneration);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException in main after calling generateNumberFormatException: " + e.getMessage());
            System.out.println("This shows that even if the method doesn't handle it, main can.");
        }


        System.out.println("\n--- Demonstrating NumberFormatException with try-catch ---");
        System.out.print("Enter a non-numeric string to demonstrate handling: ");
        String badInputForHandling = scanner.nextLine();
        demonstrateNumberFormatExceptionHandling(badInputForHandling);

        System.out.print("\nEnter a numeric string (e.g., \"123\") to see successful parsing: ");
        String goodInput = scanner.nextLine();
        demonstrateNumberFormatExceptionHandling(goodInput);


        scanner.close();
    }

    public static void generateNumberFormatException(String text) {
        System.out.println("Attempting to parse \"" + text + "\" using Integer.parseInt()");
        int number = Integer.parseInt(text);
        System.out.println("Successfully parsed: " + number);
    }

    public static void demonstrateNumberFormatExceptionHandling(String text) {
        System.out.println("Attempting to parse \"" + text + "\" with try-catch.");
        try {
            int number = Integer.parseInt(text);
            System.out.println("Successfully parsed: " + number);
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: The input string \"" + text + "\" is not a valid number format.");
            System.err.println("Error message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Caught a generic RuntimeException: An unexpected error occurred.");
            System.err.println("Error message: " + e.getMessage());
        } finally {
            System.out.println("Finished attempt to parse \"" + text + "\".");
        }
    }
}