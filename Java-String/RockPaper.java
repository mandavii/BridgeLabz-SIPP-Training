package CoreJavaStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;
        int totalGames = 0;

        List<String[]> gameHistory = new ArrayList<>(); // To store results of each game

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.print("Enter the number of games you want to play: ");
        try {
            totalGames = Integer.parseInt(scanner.nextLine());
            if (totalGames <= 0) {
                System.out.println("Number of games must be positive. Exiting.");
                scanner.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number of games. Exiting.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= totalGames; i++) {
            System.out.println("\n--- Game " + i + " ---");
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase().trim();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please choose rock, paper, or scissors. Skipping this round.");
                gameHistory.add(new String[]{"Invalid", "Invalid", "Skipped"});
                continue;
            }

            String computerChoice = getComputerChoice(random);
            System.out.println("Computer chose: " + computerChoice);

            String winner = getWinner(playerChoice, computerChoice);
            System.out.println("Result: " + winner);

            gameHistory.add(new String[]{playerChoice, computerChoice, winner});

            if (winner.equals("Player wins!")) {
                playerWins++;
            } else if (winner.equals("Computer wins!")) {
                computerWins++;
            } else if (winner.equals("It's a tie!")) {
                ties++;
            }
        }

        String[][] stats = calculateStats(playerWins, computerWins, ties, totalGames);
        displayResults(gameHistory, stats, totalGames);

        scanner.close();
    }

    public static String getComputerChoice(Random random) {
        int choice = random.nextInt(3); // 0, 1, or 2
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "error"; // Should not happen
        }
    }

    public static String getWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (
            (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
            (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int ties, int totalGames) {
        String[][] stats = new String[2][4]; // Row 0 for Wins, Row 1 for Percentage

        double playerWinPercentage = 0.0;
        double computerWinPercentage = 0.0;

        if (totalGames > 0) {
            playerWinPercentage = (double) playerWins / totalGames * 100;
            computerWinPercentage = (double) computerWins / totalGames * 100;
        }

        stats[0][0] = String.valueOf(playerWins);
        stats[0][1] = String.valueOf(computerWins);
        stats[0][2] = String.valueOf(ties);
        stats[0][3] = String.valueOf(totalGames);

        stats[1][0] = String.format("%.2f%%", playerWinPercentage);
        stats[1][1] = String.format("%.2f%%", computerWinPercentage);
        stats[1][2] = ""; // No percentage for ties in this context
        stats[1][3] = ""; // No percentage for total games in this context

        return stats;
    }

    public static void displayResults(List<String[]> gameHistory, String[][] stats, int totalGamesPlayed) {
        System.out.println("\n--- Game History ---");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-7s | %-10s | %-10s | %-15s%n", "Game", "Player", "Computer", "Outcome");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < gameHistory.size(); i++) {
            String[] game = gameHistory.get(i);
            System.out.printf("%-7d | %-10s | %-10s | %-15s%n", (i + 1), game[0], game[1], game[2]);
        }
        System.out.println("--------------------------------------------------");


        System.out.println("\n--- Game Statistics ---");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s | %-10s%n", "Category", "Player", "Computer", "Ties");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s | %-10s%n", "Wins", stats[0][0], stats[0][1], stats[0][2]);
        System.out.printf("%-10s | %-10s | %-10s | %-10s%n", "Win %", stats[1][0], stats[1][1], "");
        System.out.println("--------------------------------------------------");
        System.out.println("Total Games Played: " + totalGamesPlayed);
        System.out.println("--------------------------------------------------");
    }
}
