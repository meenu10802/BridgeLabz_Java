package CoreProgramming.Strings.Level2;

import java.util.Random;
import java.util.Scanner;

/*
 * This program simulates Rock-Paper-Scissors game between user and computer
 * across multiple rounds, tracks wins, and displays statistics with percentages.
 * Demonstrates random choice generation, win logic, and result formatting.
 */
public class RockPaperScissorsStatistics {

    // Method generates computer's random choice: 0=Rock, 1=Paper, 2=Scissors
    public static int getComputerChoice() {
        return new Random().nextInt(3);
    }

    // Method determines winner: 1=Player wins, -1=Computer wins, 0=Tie
    public static int determineWinner(int player, int computer) {
        if (player == computer) return 0;
        if ((player == 0 && computer == 2) ||
                (player == 1 && computer == 0) ||
                (player == 2 && computer == 1)) {
            return 1; // Player wins
        }
        return -1; // Computer wins
    }

    // Method calculates win statistics and returns 2D array
    public static String[][] calculateGameStatistics(int[] results) {
        int playerWins = 0, computerWins = 0, ties = 0;
        for (int r : results) {
            if (r == 1) playerWins++;
            else if (r == -1) computerWins++;
            else ties++;
        }

        int total = results.length;
        double playerPercent = (double) playerWins / total * 100;
        double computerPercent = (double) computerWins / total * 100;

        return new String[][] {
                {"Player Wins", String.valueOf(playerWins), String.format("%.2f%%", playerPercent)},
                {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerPercent)},
                {"Ties", String.valueOf(ties), String.format("%.2f%%", (double) ties / total * 100)}
        };
    }

    // Method displays detailed game results and statistics
    public static void displayGameResults(int[] results, String[][] stats) {
        System.out.println("\nGame Results:");
        for (int i = 0; i < results.length; i++) {
            String outcome = results[i] == 1 ? "Player Wins" :
                    results[i] == -1 ? "Computer Wins" : "Tie";
            System.out.println("Game " + (i+1) + ": " + outcome);
        }

        System.out.println("\nFinal Statistics:");
        System.out.println("-----------------");
        System.out.println("Category\tWins\tPercentage");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        // Scanner is used to read number of games from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of games to play:");
        int games = sc.nextInt();

        int[] results = new int[games];
        String[] choices = {"Rock", "Paper", "Scissors"};

        for (int i = 0; i < games; i++) {
            System.out.println("\nGame " + (i+1) + " - Choose (0=Rock, 1=Paper, 2=Scissors):");
            int playerChoice = sc.nextInt();

            int computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + choices[computerChoice]);

            results[i] = determineWinner(playerChoice, computerChoice);
        }

        // Calculating statistics
        String[][] stats = calculateGameStatistics(results);

        // Displaying final results
        displayGameResults(results, stats);

        sc.close();
    }
}