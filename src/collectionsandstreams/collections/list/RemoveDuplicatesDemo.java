package collectionsandstreams.collections.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Remove duplicates while preserving insertion order
 */
public class RemoveDuplicatesDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(3, 1, 2, 2, 3, 4);

        Set<Integer> unique = new LinkedHashSet<>(numbers);
        List<Integer> result = new ArrayList<>(unique);

        System.out.println(result);
    }
}
