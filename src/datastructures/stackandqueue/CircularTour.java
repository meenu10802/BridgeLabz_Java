package datastructure.stackandqueue.stackqueue;

import java.util.Scanner;

/*
Circular Tour Problem
Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
Hint: Use a queue to simulate the tour, keeping track of surplus petrol at each pump.
*/

class CircularTour {

    static int findStartPoint(int[] petrol, int[] distance) {

        int start = 0;    // Starting index
        int surplus = 0; // Current petrol
        int deficit = 0; // Shortage

        for (int i = 0; i < petrol.length; i++) {

            surplus += petrol[i] - distance[i];

            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter petrol at pump " + i + ": ");
            petrol[i] = sc.nextInt();

            System.out.print("Enter distance to next pump: ");
            distance[i] = sc.nextInt();
        }

        int result = findStartPoint(petrol, distance);

        System.out.println("Starting Pump Index: " + result);
    }
}
