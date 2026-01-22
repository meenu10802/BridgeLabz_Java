package datastructure.algorithmsruntimeanalysis;

/*
 This class compares recursive and iterative techniques for computing Fibonacci numbers.
 It highlights performance differences caused by exponential versus linear growth.
 */
class FibonacciComparison {

    // Recursive Fibonacci (exponential time)
    static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci (linear time)
    static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // Main method for performance comparison
    public static void main(String[] args) {

        int n = 30;

        long startTime = System.currentTimeMillis();
        int recursiveResult = fibonacciRecursive(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Recursive Fibonacci Result: " + recursiveResult);
        System.out.println("Recursive Time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        int iterativeResult = fibonacciIterative(n);
        endTime = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci Result: " + iterativeResult);
        System.out.println("Iterative Time: " + (endTime - startTime) + " ms");
    }
}
