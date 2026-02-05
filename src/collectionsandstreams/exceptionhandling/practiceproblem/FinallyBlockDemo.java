package collectionsandstreams.exceptionhandling.practiceproblem;

import java.util.*;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        } finally {
            System.out.println("Operation completed");
        }
    }
}

