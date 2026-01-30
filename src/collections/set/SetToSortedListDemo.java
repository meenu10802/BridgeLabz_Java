package collectionsandstreams.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Converts a HashSet into a sorted List
 */
public class SetToSortedListDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Set.of(5, 3, 9, 1));

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println(list);
    }
}
