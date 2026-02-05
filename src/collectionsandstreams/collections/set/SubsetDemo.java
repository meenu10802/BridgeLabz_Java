package collectionsandstreams.collections.set;

import java.util.Set;

/*
 * Checks whether one set is a subset of another
 */
public class SubsetDemo {

    public static void main(String[] args) {

        Set<Integer> set1 = Set.of(2, 3);
        Set<Integer> set2 = Set.of(1, 2, 3, 4);

        System.out.println(set2.containsAll(set1)); // true
    }
}
