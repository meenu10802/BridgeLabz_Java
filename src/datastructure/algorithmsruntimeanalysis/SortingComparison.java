package datastructure.algorithmsruntimeanalysis;

/*
 This class shows sorting strategies with varying performance.
 It emphasizes the importance of efficient sorting for large data.
 */
class SortingComparison {

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void efficientSort(int[] arr) {
        java.util.Arrays.sort(arr);
    }

    public static void main(String[] args) {

        int size = 10_000;
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < size; i++) {
            arr1[i] = size - i;
            arr2[i] = size - i;
        }

        long start = System.currentTimeMillis();
        bubbleSort(arr1);
        long end = System.currentTimeMillis();
        System.out.println("Bubble Sort Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        efficientSort(arr2);
        end = System.currentTimeMillis();
        System.out.println("Efficient Sort Time: " + (end - start) + " ms");
    }
}
