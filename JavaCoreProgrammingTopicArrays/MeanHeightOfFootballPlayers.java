package Array;

import java.util.Scanner;

public class MeanHeightOfFootballPlayers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] heights = new double[11];
		double sum = 0.0;

		System.out.println("Enter the heights of 11 football players:");

		for (int i = 0; i < 11; i++) {
			System.out.print("Enter height for player " + (i + 1) + ": ");
			try {
				heights[i] = scanner.nextDouble();
			} catch (java.util.InputMismatchException e) {
				System.err.println("Invalid input. Please enter a valid number for height.");
				scanner.next();
				i--;
			}
		}

		for (double height : heights) {
			sum += height;
		}

		double meanHeight = sum / 11;

		System.out.println("\nTotal sum of heights: " + sum);
		System.out.println("Number of players: 11");
		System.out.println("Mean height of the football team: " + meanHeight);

		scanner.close();
	}
}
