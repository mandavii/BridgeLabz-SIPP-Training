package Array;

import java.util.Scanner;
import java.util.Arrays;

public class EvenOddArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a natural number: ");
		int number;

		try {
			number = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.err.println("Invalid input");
			scanner.close();
			return;
		}

		if (number <= 0) {
			System.err.println("Please enter a natural number.");
			scanner.close();
			return;
		}

		int[] oddNumbers = new int[number / 2 + 1];
		int[] evenNumbers = new int[number / 2 + 1];

		int oddIndex = 0;
		int evenIndex = 0;

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				if (evenIndex < evenNumbers.length) {
					evenNumbers[evenIndex] = i;
					evenIndex++;
				}
			} else {
				if (oddIndex < oddNumbers.length) {
					oddNumbers[oddIndex] = i;
					oddIndex++;
				}
			}
		}

		int[] finalOddNumbers = Arrays.copyOf(oddNumbers, oddIndex);
		int[] finalEvenNumbers = Arrays.copyOf(evenNumbers, evenIndex);

		System.out.println("Odd Numbers: " + Arrays.toString(finalOddNumbers));
		System.out.println("Even Numbers: " + Arrays.toString(finalEvenNumbers));

		scanner.close();
	}
}
