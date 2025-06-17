package Array;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a positive integer for FizzBuzz: ");
		int number;

		try {
			number = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.err.println("Invalid input. Please enter an integer.");
			scanner.close();
			return;
		}

		if (number < 0) {
			System.err.println("Error: Please enter a positive integer.");
			scanner.close();
			return;
		}

		String[] fizzBuzzResults = new String[number + 1];

		for (int i = 0; i <= number; i++) {
			if (i == 0) { // Handle 0 explicitly as it's not typically part of FizzBuzz rules for multiples
				fizzBuzzResults[i] = String.valueOf(i);
			} else if (i % 3 == 0 && i % 5 == 0) {
				fizzBuzzResults[i] = "FizzBuzz";
			} else if (i % 3 == 0) {
				fizzBuzzResults[i] = "Fizz";
			} else if (i % 5 == 0) {
				fizzBuzzResults[i] = "Buzz";
			} else {
				fizzBuzzResults[i] = String.valueOf(i);
			}
		}

		System.out.println("\n--- FizzBuzz Results ---");
		for (int i = 0; i < fizzBuzzResults.length; i++) {
			System.out.println("Position " + i + " = " + fizzBuzzResults[i]);
		}

		scanner.close();
	}
}
