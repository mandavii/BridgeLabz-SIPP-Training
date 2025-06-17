package CoreJavaStrings;

import java.util.Scanner;

public class ReturnLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\nOriginal String: \"" + userInput + "\"");

        int customLength = getStringLengthWithoutLengthMethod(userInput);
        System.out.println("Length using custom method: " + customLength);

        int builtInLength = userInput.length();
        System.out.println("Length using built-in length() method: " + builtInLength);

        System.out.println("\nComparison Result:");
        if (customLength == builtInLength) {
            System.out.println("The custom length calculation and the built-in length() method produced IDENTICAL results.");
        } else {
            System.out.println("The custom length calculation and the built-in length() method produced DIFFERENT results.");
        }

        scanner.close();
    }

    public static int getStringLengthWithoutLengthMethod(String text) {
        if (text == null) {
            return 0;
        }

        int count = 0;
        try {
            // Loop indefinitely, incrementing count, until charAt() throws an exception
            // when the index goes out of bounds.
            while (true) {
                text.charAt(count); // Access character at current count
                count++;            // Increment count if character exists
            }
        } catch (StringIndexOutOfBoundsException e) {
            // This exception is caught when charAt(count) tries to access
            // an index beyond the string's length, meaning 'count' now holds
            // the actual length of the string.
        }
        return count;
    }
}
