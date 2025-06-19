package CoreJavaStrings;

import java.util.Arrays;
import java.util.Scanner;

public class LowerCaseConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        if (userInput == null || userInput.isEmpty()) {
            System.out.println("No input provided. Exiting.");
            scanner.close();
            return;
        }

        System.out.println("\nOriginal String: \"" + userInput + "\"");

        char[] userDefinedChars = getUserDefinedCharArray(userInput);
        System.out.println("User-defined char array: " + Arrays.toString(userDefinedChars));

        char[] builtInChars = userInput.toCharArray();
        System.out.println("Built-in toCharArray() result: " + Arrays.toString(builtInChars));

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);
        System.out.println("\nComparison Result:");
        if (areEqual) {
            System.out.println("The user-defined character array and the built-in toCharArray() result are IDENTICAL.");
        } else {
            System.out.println("The user-defined character array and the built-in toCharArray() result are DIFFERENT.");
        }

        scanner.close();
    } // This brace closes the main method

    public static char[] getUserDefinedCharArray(String text) {
        if (text == null) {
            return new char[0];
        }

        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}