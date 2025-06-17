package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FactorInArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to find its factors: ");
		int number;

		try {
			number = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.err.println("Invalid input. Please enter an integer.");
			scanner.close();
			return;
		}

		if (number <= 0) {
			System.err.println("Error: Please enter a positive integer.");
			scanner.close();
			return;
		}

		int maxFactor = 10;
		int[] factors = new int[maxFactor];
		int index = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				if (index == maxFactor) {
					maxFactor *= 2;
					int[] tempFactors = new int[maxFactor];
					for (int j = 0; j < factors.length; j++) {
						tempFactors[j] = factors[j];
					}
					factors = tempFactors;
				}
				factors[index] = i;
				index++;
			}
		}

		int[] finalFactors = Arrays.copyOf(factors, index);

		System.out.println("Factors of " + number + ": " + Arrays.toString(finalFactors));

		scanner.close();
	}
}
