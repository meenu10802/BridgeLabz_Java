package collectionsandstreams.collections.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Count word frequency ignoring case and punctuation
 */
public class WordFrequencyCounter {

    public static void main(String[] args) {

        String text = "Hello world, hello Java!";

        String cleaned = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = cleaned.split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word,
                    frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}
