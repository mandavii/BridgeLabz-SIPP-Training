package Array;

import java.util.Scanner;

public class YoungestFriendbetween3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] names = {"Amar", "Akbar", "Anthony"};
		int[] ages = new int[3];
		double[] heights = new double[3];

		System.out.println("Enter details for Amar, Akbar, and Anthony:");

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter age for " + names[i] + ": ");
			try {
				ages[i] = scanner.nextInt();
				if (ages[i] <= 0) {
					System.err.println("Age must be a positive number. Please re-enter.");
					i--;
					continue;
				}
			} catch (java.util.InputMismatchException e) {
				System.err.println("Invalid input. Please enter an integer for age.");
				scanner.next();
				i--;
				continue;
			}

			System.out.print("Enter height (in meters/feet) for " + names[i] + ": ");
			try {
				heights[i] = scanner.nextDouble();
				if (heights[i] <= 0) {
					System.err.println("Height must be a positive number. Please re-enter.");
					i--; // To re-enter both age and height for this person
					continue;
				}
			} catch (java.util.InputMismatchException e) {
				System.err.println("Invalid input. Please enter a number for height.");
				scanner.next();
				i--; // To re-enter both age and height for this person
				continue;
			}
		}

		// Find the youngest friend
		int youngestAge = ages[0];
		String youngestFriend = names[0];
		for (int i = 1; i < 3; i++) {
			if (ages[i] < youngestAge) {
				youngestAge = ages[i];
				youngestFriend = names[i];
			}
		}

		// Find the tallest friend
		double tallestHeight = heights[0];
		String tallestFriend = names[0];
		for (int i = 1; i < 3; i++) {
			if (heights[i] > tallestHeight) {
				tallestHeight = heights[i];
				tallestFriend = names[i];
			}
		}

		System.out.println("\n--- Results ---");
		System.out.println("The youngest friend is: " + youngestFriend + " (Age: " + youngestAge + ")");
		System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + tallestHeight + ")");

		scanner.close();
	}
}
