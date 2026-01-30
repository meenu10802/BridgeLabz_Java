package collectionsandstreams.collections.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Merge two maps and sum values of common keys
 */
public class MergeMapsDemo {

    public static void main(String[] args) {

        Map<String, Integer> map1 =
                Map.of("A", 1, "B", 2);

        Map<String, Integer> map2 =
                Map.of("B", 3, "C", 4);

        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        System.out.println(result);
    }
}
