/*
 * This program generates array of random 4-digit numbers and calculates
 * average, min and max from them.
 * It demonstrates random number generation and array processing methods.
 */
package CoreProgramming.Methods.Level2;

import java.util.Random;

public class RandomStatsCalculator {

    // Method generates array of specified size with random 4-digit numbers (1000-9999)
    public int[] generateRandomFourDigitArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(9000) + 1000;
        }
        return arr;
    }

    // Method calculates average, min and max from array of numbers
    public double[] calculateAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        long sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Creating object because methods are non-static
        RandomStatsCalculator stats = new RandomStatsCalculator();

        // Generating random array of size 5
        int[] randomNumbers = stats.generateRandomFourDigitArray(5);

        // Calculating stats
        double[] results = stats.calculateAverageMinMax(randomNumbers);

        // Printing average, min, max respectively
        for (double res : results) {
            System.out.println(res);
        }
    }
}