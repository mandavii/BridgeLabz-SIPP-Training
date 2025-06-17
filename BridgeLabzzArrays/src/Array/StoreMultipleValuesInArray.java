package Array;

import java.util.Scanner;
import java.util.Arrays;

public class StoreMultipleValuesInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] numbers = new double[10];
		double total = 0.0;
		int index = 0;

		System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop.");

		while (true) {
			System.out.print("Enter a number: ");
			double inputNumber;

			try {
				inputNumber = scanner.nextDouble();
			} catch (java.util.InputMismatchException e) {
				System.err.println("Invalid input. Please enter a valid number.");
				scanner.next();
				continue;
			}

			if (inputNumber <= 0) {
				System.out.println("Stopping input as 0 or a negative number was entered.");
				break;
			}

			if (index >= numbers.length) {
				System.out.println("Array is full (maximum 10 numbers reached). Stopping input.");
				break;
			}

			numbers[index] = inputNumber;
			index++;
		}

		double[] enteredNumbers = Arrays.copyOf(numbers, index);

		for (double num : enteredNumbers) {
			total += num;
		}

		System.out.println("\nNumbers entered: " + Arrays.toString(enteredNumbers));
		System.out.println("Sum of all numbers: " + total);

		scanner.close();
	}
}
