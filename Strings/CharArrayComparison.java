import java.util.Scanner;


public class CharArrayComparison {

    public static char[] getCharsUsingCharAt(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] customArray = getCharsUsingCharAt(input);

        char[] builtInArray = input.toCharArray();

        boolean isEqual = compareCharArrays(customArray, builtInArray);

        System.out.print("\nUser-defined character array: ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in toCharArray() array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + isEqual);

        scanner.close();
    }
}
