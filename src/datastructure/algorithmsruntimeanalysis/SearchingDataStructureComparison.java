package datastructure.algorithmsruntimeanalysis;

import java.util.*;

/*
 This class evaluates search performance across different data structures.
 It demonstrates how internal organization affects lookup efficiency.
 */
class SearchingDataStructureComparison {

    public static void main(String[] args) {

        int size = 100000;

        // Array
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            hashSet.add(i);
        }

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            treeSet.add(i);
        }

        int target = size - 1;

        // Array search
        long startTime = System.currentTimeMillis();
        for (int num : array) {
            if (num == target)
                break;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Array Search Time: " + (endTime - startTime) + " ms");

        // HashSet search
        startTime = System.currentTimeMillis();
        hashSet.contains(target);
        endTime = System.currentTimeMillis();
        System.out.println("HashSet Search Time: " + (endTime - startTime) + " ms");

        // TreeSet search
        startTime = System.currentTimeMillis();
        treeSet.contains(target);
        endTime = System.currentTimeMillis();
        System.out.println("TreeSet Search Time: " + (endTime - startTime) + " ms");
    }
}
