package collectionsandstreams.collections.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Count frequency of elements in a list
 */
public class FrequencyCounter {

    public static void main(String[] args) {

        List<String> fruits =
                List.of("apple", "banana", "apple", "orange");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String fruit : fruits) {
            frequencyMap.put(fruit,
                    frequencyMap.getOrDefault(fruit, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}
