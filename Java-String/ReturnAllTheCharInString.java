package CoreJavaStrings;

import java.util.Arrays; // Import Arrays for displaying array content
import java.util.Scanner; // Import Scanner for user input

public class ReturnAllTheCharInString {

    public static char[] convertStringToCharArrayCustom(String inputString) {
        // Handle null input string to avoid NullPointerException
        if (inputString == null) {
            System.out.println("Warning: Input string is null for custom conversion. Returning empty array.");
            return new char[0];
        }

        char[] charArray = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            charArray[i] = inputString.charAt(i);
        }
        return charArray;
    }

    
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        
        if (array1 == null && array2 == null) {
            return true;
        }
        
        if (array1 == null || array2 == null) {
            return false;
        }

        
        if (array1.length != array2.length) {
            return false;
        }

        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); 

        System.out.println("\n--- Processing the string ---");
        char[] customCharArray = convertStringToCharArrayCustom(userInput);
        System.out.println("User-defined method result: " + Arrays.toString(customCharArray));

        char[] builtInCharArray = userInput.toCharArray();
        System.out.println("Built-in toCharArray() result: " + Arrays.toString(builtInCharArray));

        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);

        System.out.println("\n--- Comparison Result ---");
        System.out.println("Are the two character arrays identical? " + areEqual);

        if (areEqual) {
            System.out.println("Both methods produced the same character array.");
        } else {
            System.out.println("There was a discrepancy between the two methods.");
        }

        scanner.close(); 
        System.out.println("\nProgram finished.");
    }
}
