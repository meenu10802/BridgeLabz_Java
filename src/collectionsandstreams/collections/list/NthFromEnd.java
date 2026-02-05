package collectionsandstreams.collections.list;

import java.util.LinkedList;
import java.util.List;

/*
 * Find Nth element from the end without size calculation
 */
public class NthFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {

        int first = 0;
        int second = 0;

        while (second < n) {
            second++;
        }

        while (second < list.size()) {
            first++;
            second++;
        }

        return list.get(first);
    }

    public static void main(String[] args) {

        LinkedList<String> list =
                new LinkedList<>(List.of("A", "B", "C", "D", "E"));

        System.out.println(findNthFromEnd(list, 2));
    }
}
