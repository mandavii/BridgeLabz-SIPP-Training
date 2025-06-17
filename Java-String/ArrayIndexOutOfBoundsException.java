package CoreJavaStrings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names;
        int size = 0;
        int invalidIndex = -1;

        // Get array size from user
        while (true) {
            try {
                System.out.print("Enter the number of names for the array: ");
                size = Integer.parseInt(scanner.nextLine());
                if (size <= 0) {
                    System.out.println("Array size must be positive. Please try again.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for the size.");
            }
        }

        names = new String[size];
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\n--- Attempting to generate ArrayIndexOutOfBoundsException (without handling in method) ---");
        System.out.print("Enter an index larger than the array size (" + (size - 1) + ") to generate the exception: ");
        try {
            invalidIndex = Integer.parseInt(scanner.nextLine());
            System.out.println("Calling generateArrayIndexOutOfBoundsException with index: " + invalidIndex);
            // This call is placed in a try-catch in main, because otherwise it would stop the program.
            // The method itself does not handle it.
            generateArrayIndexOutOfBoundsException(names, invalidIndex);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for index. Please enter an integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in main after calling generateArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("This shows that even if the method doesn't handle it, main can catch it.");
        } catch (Exception e) { // Catch any other unexpected exceptions
            System.out.println("Caught an unexpected Exception in main: " + e.getMessage());
        }


        System.out.println("\n--- Demonstrating ArrayIndexOutOfBoundsException handling with try-catch ---");
        System.out.print("Enter an index (e.g., " + size + ") to demonstrate handling (will be out of bounds): ");
        try {
            invalidIndex = Integer.parseInt(scanner.nextLine());
            System.out.println("Calling demonstrateArrayIndexOutOfBoundsExceptionHandling with index: " + invalidIndex);
            demonstrateArrayIndexOutOfBoundsExceptionHandling(names, invalidIndex);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for index. Please enter an integer.");
        }


        // Example of a valid call to show successful access
        System.out.println("\n--- Demonstrating valid array access ---");
        if (size > 0) {
            System.out.println("Calling demonstrateArrayIndexOutOfBoundsExceptionHandling with a valid index (0):");
            demonstrateArrayIndexOutOfBoundsExceptionHandling(names, 0);
        }


        scanner.close();
    }

    public static void generateArrayIndexOutOfBoundsException(String[] array, int index) {
        System.out.println("Inside generateArrayIndexOutOfBoundsException method.");
        // This line will throw ArrayIndexOutOfBoundsException if index is out of bounds
        System.out.println("Accessing element at index " + index + ": " + array[index]);
        System.out.println("Successfully accessed element."); // This line won't be reached if exception occurs
    }

    public static void demonstrateArrayIndexOutOfBoundsExceptionHandling(String[] array, int index) {
        System.out.println("Inside demonstrateArrayIndexOutOfBoundsExceptionHandling method.");
        try {
            System.out.println("Attempting to access element at index " + index + ".");
            String element = array[index];
            System.out.println("Successfully accessed element: \"" + element + "\"");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: The index " + index + " is out of bounds for array of length " + array.length + ".");
            System.err.println("Error message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Caught a generic RuntimeException: An unexpected error occurred.");
            System.err.println("Error message: " + e.getMessage());
        } finally {
            System.out.println("Finished attempt to access array element.");
        }
    }
}
