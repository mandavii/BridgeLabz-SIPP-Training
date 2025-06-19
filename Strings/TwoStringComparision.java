package CoreJavaStrings;

import java.util.Scanner;

public class TwoStringComparision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        System.out.println("\nComparing: \"" + string1 + "\" and \"" + string2 + "\"");

        boolean customCompareResult = compareStringsUsingCharAt(string1, string2);
        System.out.println("Result using custom charAt() comparison: " + customCompareResult);

        boolean builtInEqualsResult = string1.equals(string2);
        System.out.println("Result using built-in equals() method: " + builtInEqualsResult);

        System.out.println("\nVerifying if the results are the same:");
        if (customCompareResult == builtInEqualsResult) {
            System.out.println("Both comparison methods yielded the SAME result.");
        } else {
            System.out.println("The comparison methods yielded DIFFERENT results.");
        }

        scanner.close();
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
