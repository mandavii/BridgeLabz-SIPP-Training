package CoreJavaStrings;

import java.util.Scanner;

public class UpperCaseConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to convert to uppercase: ");
        String userInput = scanner.nextLine();

        System.out.println("\nOriginal String: \"" + userInput + "\"");

        String customUpperCase = convertToUpperCaseCustom(userInput);
        System.out.println("Uppercase (Custom Method): \"" + customUpperCase + "\"");

        String builtInUpperCase = userInput.toUpperCase();
        System.out.println("Uppercase (Built-in toUpperCase()): \"" + builtInUpperCase + "\"");

        boolean areEqual = compareStringsUsingCharAt(customUpperCase, builtInUpperCase);

        System.out.println("\nComparison Result:");
        if (areEqual) {
            System.out.println("The custom uppercase conversion and the built-in toUpperCase() result are IDENTICAL.");
        } else {
            System.out.println("The custom uppercase conversion and the built-in toUpperCase() result are DIFFERENT.");
        }

        scanner.close();
    }

    public static String convertToUpperCaseCustom(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32)); // Convert lowercase to uppercase using ASCII difference
            } else {
                sb.append(ch); // Keep other characters as they are
            }
        }
        return sb.toString();
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        }
        if (str1 == null || str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
