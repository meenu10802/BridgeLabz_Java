package object_oriented_programming.Encapsulation;

/*
 * Problem Statement:
 * Write a Java program to demonstrate encapsulation, abstraction,
 * interfaces, inheritance, and polymorphism in a hospital
 * management system.
 */

/*
 * Interface Name: MedicalRecord
 *
 * Description:
 * This interface defines medical record-related operations
 * that can be implemented by patient-related classes.
 */
interface MedicalRecord {

    // Method to add a medical record
    void addRecord(String record);

    // Method to view stored medical records
    String viewRecords();
}

/*
 * Abstract Class Name: Patient
 *
 * Description:
 * This abstract class represents a generic patient.
 * It demonstrates encapsulation using private variables
 * and abstraction using an abstract billing method.
 */
abstract class Patient {

    // Unique patient identification number
    private int patientId;

    // Name of the patient
    private String name;

    // Age of the patient
    private int age;

    // Constructor to initialize patient details
    Patient(int id, String n, int a) {

        // Assign patient ID
        patientId = id;

        // Assign patient name
        name = n;

        // Assign patient age
        age = a;
    }

    // Abstract method to calculate patient bill
    abstract double calculateBill();

    // Method to display patient details
    void getPatientDetails() {

        // Display patient name
        System.out.println(name);
    }
}

/*
 * Class Name: InPatient
 *
 * Description:
 * This class represents an in-patient admitted to the hospital.
 * It extends the Patient abstract class and provides
 * its own billing logic.
 */
class InPatient extends Patient {

    // Constructor to initialize in-patient details
    InPatient(int id, String n, int a) {

        // Call superclass constructor
        super(id, n, a);
    }

    // Implementation of bill calculation for in-patient
    double calculateBill() {

        // Fixed bill amount for demonstration
        return 5000;
    }
}

/*
 * Class Name: HospitalDemo
 *
 * Description:
 * This class contains the main method and demonstrates
 * polymorphism by using a Patient reference to access
 * an InPatient object.
 */
public class HospitalDemo {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating InPatient object using Patient reference
        Patient p = new InPatient(1, "Aayush", 21);

        // Calling overridden method using runtime polymorphism
        System.out.println(p.calculateBill());
    }
}
