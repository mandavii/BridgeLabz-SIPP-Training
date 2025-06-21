package CoreJavaStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitText2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence or phrase: ");
        String userInput = scanner.nextLine();

        String[] words = splitTextIntoWordsCustom(userInput);

        String[][] wordsAndLengths = getWordsAndLengths2DArray(words);

        displayWordsAndLengths(wordsAndLengths);

        scanner.close();
    }

    public static int getStringLengthWithoutLengthMethod(String text) {
        if (text == null) {
            return 0;
        }

        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static String[] splitTextIntoWordsCustom(String text) {
        if (text == null || text.trim().isEmpty()) {
            return new String[0];
        }

        String trimmedText = text.trim();
        ArrayList<String> wordsList = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < getStringLengthWithoutLengthMethod(trimmedText); i++) {
            char ch = trimmedText.charAt(i);

            if (Character.isWhitespace(ch)) {
                if (getStringLengthWithoutLengthMethod(currentWord.toString()) > 0) {
                    wordsList.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            } else {
                currentWord.append(ch);
            }
        }

        if (getStringLengthWithoutLengthMethod(currentWord.toString()) > 0) {
            wordsList.add(currentWord.toString());
        }

        return wordsList.toArray(new String[0]);
    }

    public static String[][] getWordsAndLengths2DArray(String[] words) {
        if (words == null) {
            return new String[0][0];
        }

        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLengthWithoutLengthMethod(words[i]));
        }
        return result;
    }

    public static void displayWordsAndLengths(String[][] data) {
        if (data == null || data.length == 0) {
            System.out.println("No words to display.");
            return;
        }

        System.out.println("\n--- Words and Their Lengths ---");
        System.out.println("------------------------------");
        System.out.printf("%-15s | %-8s%n", "Word", "Length");
        System.out.println("------------------------------");

        for (String[] row : data) {
            String word = row[0];
            String lengthStr = row[1];
            int length = Integer.parseInt(lengthStr); // Convert back to int for display as per hint
            System.out.printf("%-15s | %-8d%n", word, length);
        }
        System.out.println("------------------------------");
    }
}
