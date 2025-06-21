package CoreJavaStrings;

import java.util.Random;
import java.util.Scanner;

public class VoteOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 0;

        System.out.print("Enter the number of students: ");
        try {
            numberOfStudents = Integer.parseInt(scanner.nextLine());
            if (numberOfStudents <= 0) {
                System.out.println("Number of students must be positive. Exiting.");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number for students. Exiting.");
            scanner.close();
            return;
        }

        int[] ages = generateRandomAges(numberOfStudents);

        String[][] votingStatus = checkVotingEligibility(ages);

        displayVotingStatus(votingStatus);

        scanner.close();
    }

    public static int[] generateRandomAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        Random random = new Random();
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate a random 2-digit age (between 10 and 99 inclusive)
            ages[i] = random.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] votingStatus = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            votingStatus[i][0] = String.valueOf(age); // Store age as string
            if (age < 0) {
                votingStatus[i][1] = "false (Invalid Age)";
            } else if (age >= 18) {
                votingStatus[i][1] = "true";
            } else {
                votingStatus[i][1] = "false";
            }
        }
        return votingStatus;
    }

    public static void displayVotingStatus(String[][] votingStatus) {
        System.out.println("\n--- Student Voting Eligibility ---");
        System.out.println("----------------------------------");
        System.out.printf("%-10s | %-15s%n", "Age", "Can Vote?");
        System.out.println("----------------------------------");
        for (String[] status : votingStatus) {
            System.out.printf("%-10s | %-15s%n", status[0], status[1]);
        }
        System.out.println("----------------------------------");
    }
}
