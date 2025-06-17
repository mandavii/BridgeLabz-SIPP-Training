package CoreJavaStrings;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        int startIndex = 5; // Example invalid start index
        int endIndex = 2;   // Example invalid end index (start > end)

        System.out.print("Enter a string: ");
        userInput = scanner.nextLine();

        System.out.println("\n--- Attempting to generate IllegalArgumentException (without handling in method) ---");
        System.out.println("Calling generateIllegalArgumentException with: \"" + userInput + "\", start=" + startIndex + ", end=" + endIndex);
        try {
            // This call is placed in a try-catch in main, because otherwise it would stop the program.
            // The method itself does not handle it.
            generateIllegalArgumentException(userInput, startIndex, endIndex);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException in main after calling generateIllegalArgumentException: " + e.getMessage());
            System.out.println("This shows that even if the method doesn't handle it, main can catch it.");
        } catch (Exception e) { // Catch any other unexpected exceptions
            System.out.println("Caught an unexpected Exception in main: " + e.getMessage());
        }

        System.out.println("\n--- Demonstrating IllegalArgumentException handling with try-catch ---");
        System.out.println("Calling demonstrateIllegalArgumentExceptionHandling with: \"" + userInput + "\", start=" + startIndex + ", end=" + endIndex);
        demonstrateIllegalArgumentExceptionHandling(userInput, startIndex, endIndex);

        // Example of a valid call to show successful substring creation
        System.out.println("\n--- Demonstrating valid substring call ---");
        System.out.println("Calling demonstrateIllegalArgumentExceptionHandling with: \"" + userInput + "\", start=0, end=" + Math.min(2, userInput.length()));
        demonstrateIllegalArgumentExceptionHandling(userInput, 0, Math.min(2, userInput.length()));


        scanner.close();
    }

    public static void generateIllegalArgumentException(String text, int startIndex, int endIndex) {
        System.out.println("Inside generateIllegalArgumentException method.");
        // This line will throw IllegalArgumentException because startIndex > endIndex
        String sub = text.substring(startIndex, endIndex);
        System.out.println("Substring created: " + sub); // This line won't be reached
    }

    public static void demonstrateIllegalArgumentExceptionHandling(String text, int startIndex, int endIndex) {
        System.out.println("Inside demonstrateIllegalArgumentExceptionHandling method.");
        try {
            String sub = text.substring(startIndex, endIndex);
            System.out.println("Successfully created substring: \"" + sub + "\"");
        } catch (IllegalArgumentException e) {
            System.err.println("Caught IllegalArgumentException: Invalid arguments for substring method.");
            System.err.println("Error message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Caught a generic RuntimeException: An unexpected error occurred.");
            System.err.println("Error message: " + e.getMessage());
        } finally {
            System.out.println("Finished attempt to create substring.");
        }
    }
}
