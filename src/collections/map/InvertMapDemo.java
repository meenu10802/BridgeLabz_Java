package collectionsandstreams.collections.map;

import java.util.*;

/*
 * Invert Map<K, V> to Map<V, List<K>>
 */
public class InvertMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> input = Map.of(
                "A", 1,
                "B", 2,
                "C", 1
        );

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            inverted
                    .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }

        System.out.println(inverted);
    }
}
