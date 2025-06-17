package Array;

import java.util.Scanner;

public class MultiplicationTable6to9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer to generate its multiplication table (factors 6-9): ");
		int number;

		try {
			number = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.err.println("Invalid input. Please enter an integer.");
			scanner.close();
			return;
		}

		int[] multiplicationResult = new int[4]; // Array to store results for factors 6, 7, 8, 9

		int arrayIndex = 0;
		for (int i = 6; i <= 9; i++) {
			multiplicationResult[arrayIndex] = number * i;
			arrayIndex++;
		}

		System.out.println("\nMultiplication Table for " + number + " (factors 6 to 9):");
		for (int i = 0; i < multiplicationResult.length; i++) {
			System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
		}

		scanner.close();
	}
}
