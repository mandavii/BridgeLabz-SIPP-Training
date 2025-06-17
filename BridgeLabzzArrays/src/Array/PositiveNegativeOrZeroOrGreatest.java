package Array;

import java.util.Scanner;

public class PositiveNegativeOrZeroOrGreatest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[5];

		System.out.println("Enter 5 numbers:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			try {
				numbers[i] = scanner.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.err.println("Invalid input. Please enter an integer.");
				scanner.next();
				i--;
			}
		}

		System.out.println("\n--- Number Analysis ---");
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			if (num < 0) {
				System.out.println("The number " + num + " is negative.");
			} else if (num == 0) {
				System.out.println("The number " + num + " is zero.");
			} else {
				if (num % 2 == 0) {
					System.out.println("The number " + num + " is positive and even.");
				} else {
					System.out.println("The number " + num + " is positive and odd.");
				}
			}
		}

		System.out.println("\n--- First vs. Last Number Comparison ---");
		if (numbers[0] == numbers[4]) {
			System.out.println("The first number (" + numbers[0] + ") and the last number (" + numbers[4] + ") are equal.");
		} else if (numbers[0] > numbers[4]) {
			System.out.println("The first number (" + numbers[0] + ") is greater than the last number (" + numbers[4] + ").");
		} else {
			System.out.println("The first number (" + numbers[0] + ") is less than the last number (" + numbers[4] + ").");
		}

		scanner.close();
	}
}
