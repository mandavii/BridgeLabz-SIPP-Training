package CoreJavaStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SplitTheTextIntoWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence or phrase: ");
        String userInput = scanner.nextLine();

        System.out.println("\nOriginal Text: \"" + userInput + "\"");

        String[] customSplitWords = splitTextIntoWordsCustom(userInput);
        System.out.println("Words (Custom Split): " + Arrays.toString(customSplitWords));

        String[] builtInSplitWords = userInput.trim().split("\\s+");
        System.out.println("Words (Built-in split()): " + Arrays.toString(builtInSplitWords));

        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        System.out.println("\nComparison Result:");
        if (areEqual) {
            System.out.println("The custom split method and the built-in split() method produced IDENTICAL word arrays.");
        } else {
            System.out.println("The custom split method and the built-in split() method produced DIFFERENT word arrays.");
        }

        scanner.close();
    }

    public static int getStringLengthCustom(String text) {
        if (text == null) {
            return 0;
        }
        int length = 0;
        try {
            // Iterate until charAt throws an exception for out of bounds
            // This is a creative (but generally inefficient and not recommended)
            // way to find length without .length()
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When charAt goes out of bounds, we've found the length
        }
        return length;
    }


    public static String[] splitTextIntoWordsCustom(String text) {
        if (text == null || text.trim().isEmpty()) {
            return new String[0];
        }

        String trimmedText = text.trim();
        List<String> wordsList = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < getStringLengthCustom(trimmedText); i++) {
            char ch = trimmedText.charAt(i);

            if (Character.isWhitespace(ch)) {
                if (getStringLengthCustom(currentWord.toString()) > 0) {
                    wordsList.add(currentWord.toString());
                    currentWord.setLength(0); // Clear the StringBuilder
                }
            } else {
                currentWord.append(ch);
            }
        }

        // Add the last word if exists
        if (getStringLengthCustom(currentWord.toString()) > 0) {
            wordsList.add(currentWord.toString());
        }

        return wordsList.toArray(new String[0]);
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (getStringLengthCustom(Arrays.toString(arr1)) != getStringLengthCustom(Arrays.toString(arr2))) { // Using custom length
             // A more direct comparison for arrays, comparing elements one by one.
             // Converting to string using Arrays.toString() and then finding length
             // is not the correct way to compare array length.
             // Correct length comparison:
             if (arr1.length != arr2.length) {
                 return false;
             }
        }


        // Compare elements using charAt for string comparison
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!compareStringsUsingCharAt(arr1[i], arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Helper method to compare individual strings using charAt (reused from previous question concept)
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        }
        if (str1 == null || str2 == null) {
            return false;
        }
        if (getStringLengthCustom(str1) != getStringLengthCustom(str2)) { // Using custom length
            return false;
        }
        for (int i = 0; i < getStringLengthCustom(str1); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
