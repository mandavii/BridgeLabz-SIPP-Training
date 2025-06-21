package CoreJavaStrings;

import java.util.Scanner;

public class TrimAndTrailing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading and/or trailing spaces: ");
        String userInput = scanner.nextLine();

        System.out.println("\nOriginal String: \"" + userInput + "\"");

        // Custom trim logic
        int[] trimIndices = getTrimmedIndices(userInput);
        String customTrimmedString = createSubstringUsingCharAt(userInput, trimIndices[0], trimIndices[1]);
        System.out.println("Custom Trimmed String: \"" + customTrimmedString + "\"");

        // Built-in trim logic
        String builtInTrimmedString = userInput.trim();
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmedString + "\"");

        // Compare results
        boolean areEqual = compareStringsUsingCharAt(customTrimmedString, builtInTrimmedString);

        System.out.println("\nComparison Result:");
        if (areEqual) {
            System.out.println("The custom trimming method and the built-in trim() method produced IDENTICAL results.");
        } else {
            System.out.println("The custom trimming method and the built-in trim() method produced DIFFERENT results.");
        }

        scanner.close();
    }

    public static int[] getTrimmedIndices(String text) {
        if (text == null || text.isEmpty()) {
            return new int[]{0, 0};
        }

        int start = 0;
        // Find the first non-whitespace character
        while (start < text.length() && Character.isWhitespace(text.charAt(start))) {
            start++;
        }

        int end = text.length();
        // Find the last non-whitespace character
        while (end > start && Character.isWhitespace(text.charAt(end - 1))) {
            end--;
        }
        return new int[]{start, end};
    }

    public static String createSubstringUsingCharAt(String text, int startIndex, int endIndex) {
        if (text == null || startIndex < 0 || endIndex > text.length() || startIndex > endIndex) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            sb.append(text.charAt(i));
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
