package collectionsandstreams.collections.set;

import java.util.HashSet;
import java.util.Set;

/*
 * Check whether two sets contain the same elements
 */
public class SetEqualityDemo {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 2, 1));

        System.out.println(set1.equals(set2)); // true
    }
}
