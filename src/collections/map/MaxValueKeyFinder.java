package collectionsandstreams.collections.map;

import java.util.Map;

/*
 * Find key with maximum value
 */
public class MaxValueKeyFinder {

    public static void main(String[] args) {

        Map<String, Integer> map =
                Map.of("A", 10, "B", 20, "C", 15);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println(maxKey);
    }
}
