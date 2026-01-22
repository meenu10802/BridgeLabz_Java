package datastructure.linearandbinarysearch;

import java.util.Scanner;

public class SearchWordInSentencesLinearSearch {

    /*
     Linear Search Problem 2: Search for a Specific Word in a List of Sentences
     Problem:
     You are given an array of sentences (strings). Write a program that performs Linear Search
     to find the first sentence containing a specific word.
     If the word is found, return the sentence.
     If no sentence contains the word, return "Not Found".
     Approach:
     Iterate through the list of sentences.
     For each sentence, check if it contains the specific word.
     If the word is found, return the current sentence.
     If no sentence contains the word, return "Not Found".
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of sentences
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] sentences = new String[n];

        // Loop to read sentences
        for (int i = 0; i < n; i++) { // for-loop reads each sentence
            System.out.print("Enter sentence " + (i + 1) + ": ");
            sentences[i] = sc.nextLine();
        }

        // Ask user for search word
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        String result = "Not Found";

        // Loop to search word in sentences
        for (int i = 0; i < n; i++) { // for-loop checks each sentence
            if (sentences[i].contains(word)) {
                result = sentences[i];
                break;
            }
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
