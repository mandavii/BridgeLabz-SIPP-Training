package CoreJavaStrings;

import java.util.Scanner;

public class SubStringFromString { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainString = "";
        int startIndex = -1;
        int endIndex = -1;

        System.out.print("Enter the main string: ");
        mainString = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Enter the start index (inclusive): ");
                startIndex = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the end index (exclusive): ");
                endIndex = Integer.parseInt(scanner.nextLine());

                if (startIndex < 0 || endIndex > mainString.length() || startIndex > endIndex) {
                    System.out.println("Invalid indices. Please ensure 0 <= start <= end <= length of string.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer for the index.");
            }
        }

        System.out.println("\nOriginal String: \"" + mainString + "\"");
        System.out.println("Requested Substring from index " + startIndex + " to " + endIndex + ".");

        String customSubstring = createSubstringUsingCharAt(mainString, startIndex, endIndex);
        System.out.println("Substring using charAt(): \"" + customSubstring + "\"");

        String builtInSubstring = mainString.substring(startIndex, endIndex);
        System.out.println("Substring using built-in substring(): \"" + builtInSubstring + "\"");

        boolean areEqualUsingCharAtComparison = compareStringsUsingCharAt(customSubstring, builtInSubstring);
        System.out.println("\nComparison using custom charAt() comparison method:");
        if (areEqualUsingCharAtComparison) {
            System.out.println("The two substrings are IDENTICAL.");
        } else {
            System.out.println("The two substrings are DIFFERENT.");
        }

        scanner.close();
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
