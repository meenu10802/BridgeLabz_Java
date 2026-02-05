package collectionsandstreams.collections.queue;

import java.util.PriorityQueue;

/*
 * Simulates hospital triage using PriorityQueue
 */
class Patient implements Comparable<Patient> {

    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity); // higher first
    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>();

        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        while (!queue.isEmpty()) {
            Patient p = queue.remove();
            System.out.println(p.name);
        }
    }
}
