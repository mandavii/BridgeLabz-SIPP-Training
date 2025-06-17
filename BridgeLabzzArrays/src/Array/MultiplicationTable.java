package Array;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer to generate its multiplication table: ");
		int number;

		try {
			number = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.err.println("Invalid input. Please enter an integer.");
			scanner.close();
			return;
		}

		int[] multiplicationResults = new int[10];

		for (int i = 0; i < 10; i++) {
			multiplicationResults[i] = number * (i + 1);
		}

		System.out.println("\nMultiplication Table for " + number + ":");
		for (int i = 0; i < 10; i++) {
			System.out.println(number + " * " + (i + 1) + " = " + multiplicationResults[i]);
		}

		scanner.close();
	}
}
