package Array;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] studentAges = new int[10];

		System.out.println("Enter the age for 10 students:");

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter age for student " + (i + 1) + ": ");
			try {
				studentAges[i] = scanner.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.err.println("Invalid input. Please enter an integer for age.");
				scanner.next();
				i--;
			}
		}

		System.out.println("\n--- Voting Eligibility Results ---");
		for (int i = 0; i < studentAges.length; i++) {
			int age = studentAges[i];
			if (age < 0) {
				System.out.println("Invalid age: " + age + ". Age cannot be negative.");
			} else if (age >= 18) {
				System.out.println("The student with the age " + age + " can vote.");
			} else {
				System.out.println("The student with the age " + age + " cannot vote.");
			}
		}

		scanner.close();
	}
}
