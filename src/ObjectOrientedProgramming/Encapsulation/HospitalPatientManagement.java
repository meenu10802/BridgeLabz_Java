package ObjectOrientedProgramming.Encapsulation;

/*
 * MedicalRecord interface
 * -----------------------
 * Defines contract for medical record operations.
 */
interface MedicalRecord {
    // Method to add a medical record
    void addRecord(String record);
    // Method to view medical records
    void viewRecords();
}

/*
 * Patient abstract class
 * ----------------------
 * Abstract superclass representing a patient.
 * Uses encapsulation to protect sensitive patient data.
 */
abstract class Patient {
    // Private: Sensitive patient data is protected
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;

    // Constructor to initialize patient
    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    // Abstract method for bill calculation
    abstract double calculateBill();

    // Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill Amount: " + calculateBill());
        System.out.println("--------------------------------");
    }

    // Setter to add medical history
    public void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }
}

/*
 * InPatient class
 * ---------------
 * Represents an In-Patient with fixed bill of 5000.
 * Implements MedicalRecord interface.
 */
class InPatient extends Patient implements MedicalRecord {
    // Constructor to initialize in-patient
    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    // Bill amount for in-patient
    @Override
    double calculateBill() {
        return 5000;
    }

    // Add medical record
    public void addRecord(String record) {
        setMedicalHistory(record);
    }

    // View medical records
    public void viewRecords() {
        System.out.println("In-patient medical record available");
    }
}

/*
 * OutPatient class
 * ----------------
 * Represents an Out-Patient with bill of 800.
 */
class OutPatient extends Patient {
    // Constructor to initialize out-patient
    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    // Bill amount for out-patient
    @Override
    double calculateBill() {
        return 800;
    }
}

/*
 * HospitalPatientManagement class
 * --------------------------------
 * Main class demonstrating polymorphism with different patient types.
 */
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Creating array of patients
        Patient[] patients = {
                new InPatient(1, "Kaviya", 20),
                new OutPatient(2, "Anu", 22)
        };

        // Displaying details using polymorphism
        for (Patient p : patients) {
            p.getPatientDetails();
        }
    }
}
