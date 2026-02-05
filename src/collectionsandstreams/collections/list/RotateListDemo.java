package collectionsandstreams.collections.list;

import java.util.ArrayList;
import java.util.List;

/*
 * Rotate list elements by K positions
 */
public class RotateListDemo {

    public static <T> void rotate(List<T> list, int k) {
        k = k % list.size();

        List<T> rotated = new ArrayList<>();
        rotated.addAll(list.subList(k, list.size()));
        rotated.addAll(list.subList(0, k));

        list.clear();
        list.addAll(rotated);
    }

    public static void main(String[] args) {

        List<Integer> numbers =
                new ArrayList<>(List.of(10, 20, 30, 40, 50));

        rotate(numbers, 2);
        System.out.println(numbers);
    }
}
