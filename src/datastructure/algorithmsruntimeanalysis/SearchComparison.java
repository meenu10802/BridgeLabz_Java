package datastructure.algorithmsruntimeanalysis;

/*
 This class demonstrates searching techniques with different time complexities.
 It highlights efficiency differences based on algorithm choice.
 */
class SearchComparison {

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int size = 1_000_000;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        int target = size - 1;

        long start = System.currentTimeMillis();
        linearSearch(arr, target);
        long end = System.currentTimeMillis();
        System.out.println("Linear Search Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        binarySearch(arr, target);
        end = System.currentTimeMillis();
        System.out.println("Binary Search Time: " + (end - start) + " ms");
    }
}
