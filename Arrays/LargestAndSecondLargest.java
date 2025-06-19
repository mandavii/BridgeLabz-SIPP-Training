package Array;

import java.util.Scanner;
import java.util.Arrays;

public class LargestAndSecondLargest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer to find its largest and second largest digit: ");
		int numberInput;

		try {
			numberInput = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.err.println("Invalid input. Please enter an integer.");
			scanner.close();
			return;
		}

		if (numberInput == 0) {
			System.out.println("The number is 0. Largest digit: 0, Second largest digit: 0");
			scanner.close();
			return;
		}

		int tempNumber = Math.abs(numberInput); // Work with absolute value to extract digits
		
		int maxDigitArraySize = 10;
		int[] digits = new int[maxDigitArraySize];
		int index = 0;

		if (tempNumber == 0) { // Handle the case for numberInput = 0, which was handled above.
		                       // This is for if it becomes 0 in the loop but was positive originally.
		    digits[index] = 0;
		    index++;
		} else {
			while (tempNumber > 0) {
				if (index == maxDigitArraySize) {
					maxDigitArraySize *= 2;
					int[] tempDigits = new int[maxDigitArraySize];
					for (int j = 0; j < digits.length; j++) {
						tempDigits[j] = digits[j];
					}
					digits = tempDigits;
				}
				digits[index] = tempNumber % 10;
				tempNumber /= 10;
				index++;
			}
		}

		int[] finalDigits = Arrays.copyOf(digits, index);

		if (finalDigits.length == 0) {
		    System.out.println("No digits found for the given input.");
		    scanner.close();
		    return;
		}

		int largest = -1; // Initialize with a value smaller than any digit (0-9)
		int secondLargest = -1;

		if (finalDigits.length == 1) {
		    largest = finalDigits[0];
		    secondLargest = finalDigits[0]; // Or handle as "no second largest"
		} else {
		    // Initialize largest and secondLargest with the first two distinct digits if possible
            // Sort to make initialization robust for distinct values
            Arrays.sort(finalDigits);

            largest = finalDigits[finalDigits.length - 1];

            // Find the second largest distinct digit
            for (int i = finalDigits.length - 2; i >= 0; i--) {
                if (finalDigits[i] < largest) { // Ensure it's smaller than largest
                    secondLargest = finalDigits[i];
                    break;
                }
            }

            if (secondLargest == -1) { // This means all digits were the same or only one distinct digit
                secondLargest = largest; // If all digits are same, second largest is the same as largest
            }
		}
		
		System.out.println("\nDigits in the number: " + Arrays.toString(finalDigits));
		System.out.println("Largest digit: " + largest);
		System.out.println("Second largest digit: " + secondLargest);

		scanner.close();
	}
}
