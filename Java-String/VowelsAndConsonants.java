package CoreJavaStrings;

import java.util.Scanner;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(userInput);

        System.out.println("\nOriginal String: \"" + userInput + "\"");
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
        System.out.println("Number of Non-letters: " + counts[2]);

        scanner.close();
    }

    public static String checkCharType(char ch) {
        if (!Character.isLetter(ch)) {
            return "Not a Letter";
        }

        char lowerCh = Character.toLowerCase(ch);

        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        int nonLetterCount = 0;

        if (text == null || text.isEmpty()) {
            return new int[]{0, 0, 0};
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharType(ch);

            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            } else {
                nonLetterCount++;
            }
        }
        return new int[]{vowelCount, consonantCount, nonLetterCount};
    }
}
