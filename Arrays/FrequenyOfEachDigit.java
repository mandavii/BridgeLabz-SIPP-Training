package Array;

import java.util.Scanner;
import java.util.Arrays;

public class FrequenyOfEachDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer to find the frequency of its digits: ");
		int numberInput;

		try {
			numberInput = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.err.println("Invalid input. Please enter an integer.");
			scanner.close();
			return;
		}

		int tempNumber = Math.abs(numberInput);

		if (tempNumber == 0) {
			System.out.println("Frequency of digit 0: 1");
			scanner.close();
			return;
		}

		int[] frequency = new int[10];

		while (tempNumber > 0) {
			int digit = tempNumber % 10;
			frequency[digit]++;
			tempNumber /= 10;
		}
		
		System.out.println("\n--- Digit Frequencies ---");
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println("Frequency of digit " + i + ": " + frequency[i]);
			}
		}

		scanner.close();
	}
}
