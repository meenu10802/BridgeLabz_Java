package collectionsandstreams.ioStreams;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Counts words in a text file using FileReader and BufferedReader,
 * uses HashMap for frequency, and displays the top 5 most frequent words.
 */
public class WordCountTopFive {
    public static void main(String[] args) {
        String filePath = "src/collecctionsandstreams/ioStreams/sample_words.txt";

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line and split into words; count occurrences
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");
                for (String word : words) {
                    String cleaned = word.replaceAll("[^a-zA-Z0-9]", "");
                    if (!cleaned.isEmpty()) {
                        wordCount.merge(cleaned, 1, Integer::sum);
                    }
                }
            }
        }
        // Handle I/O errors
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }

        // Sort by frequency descending and take top 5
        List<Map.Entry<String, Integer>> top5 = wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < top5.size(); i++) {
            Map.Entry<String, Integer> e = top5.get(i);
            System.out.println((i + 1) + ". " + e.getKey() + " - " + e.getValue());
        }
    }
}
