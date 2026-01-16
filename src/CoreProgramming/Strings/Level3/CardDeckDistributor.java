package CoreProgramming.Strings.Level3;

import java.util.Random;
import java.util.Scanner;

/*
 * This program creates a standard deck of 52 cards,
 * shuffles them, and distributes to given number of players.
 * Demonstrates array manipulation, shuffling algorithm, and 2D distribution.
 */
public class CardDeckDistributor {

    // Method initializes full deck of 52 cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method shuffles the deck using Fisher-Yates algorithm
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            // Swap cards
            String temp = deck[randomIndex];
            deck[randomIndex] = deck[i];
            deck[i] = temp;
        }
    }

    // Method distributes cards to players (returns 2D array)
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards!");
            return new String[0][0];
        }

        String[][] distribution = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int p = 0; p < players; p++) {
            for (int c = 0; c < cardsPerPlayer; c++) {
                distribution[p][c] = deck[cardIndex++];
            }
        }
        return distribution;
    }

    // Method prints cards each player received
    public static void printDistribution(String[][] distribution) {
        for (int i = 0; i < distribution.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : distribution[i]) {
                System.out.print(card + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Scanner is used to read number of players and cards per player
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Initializing deck
        String[] deck = initializeDeck();

        // Shuffling deck
        shuffleDeck(deck);

        // Distributing cards
        String[][] distribution = distributeCards(deck, players, cardsPerPlayer);

        // Displaying distributed cards
        printDistribution(distribution);

        sc.close();
    }
}