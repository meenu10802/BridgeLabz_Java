package collectionsandstreams.ioStreams;

import java.io.*;

/**
 * Stores student details (roll number, name, GPA) in a binary file using DataOutputStream
 * and retrieves them using DataInputStream.
 */
public class StudentDataStreams {
    private static final String FILE_PATH = "src/collecctionsandstreams/ioStreams/students.dat";

    public static void main(String[] args) {
        // Write sample students to file
        try {
            writeStudents();
            System.out.println("Students written to " + FILE_PATH);
        } catch (IOException e) {
            System.err.println("Write error: " + e.getMessage());
            return;
        }

        // Read and display students
        try {
            readStudents();
        } catch (IOException e) {
            System.err.println("Read error: " + e.getMessage());
        }
    }

    /**
     * Writes primitive data (int, UTF string, double) for each student using DataOutputStream.
     */
    static void writeStudents() throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_PATH))) {
            // Student 1
            dos.writeInt(101);
            dos.writeUTF("Raj");
            dos.writeDouble(3.8);
            // Student 2
            dos.writeInt(102);
            dos.writeUTF("Priya");
            dos.writeDouble(3.9);
            // Student 3
            dos.writeInt(103);
            dos.writeUTF("Amit");
            dos.writeDouble(3.5);
            dos.flush();
        }
    }

    /**
     * Reads primitive data in same order using DataInputStream; resources closed in try-with-resources.
     */
    static void readStudents() throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_PATH))) {
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        }
    }
}
