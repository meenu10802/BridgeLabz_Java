package object_oriented_programming.ObjectModelling;

/*
 * Problem Statement:
 * Write a Java program to demonstrate Object Modelling
 * using Doctor and Patient classes to show association
 * between two independent objects.
 */

/*
 * Class Name: Doctor
 *
 * Description:
 * This class represents a Doctor.
 * A doctor can consult a patient, demonstrating
 * an association relationship between Doctor and Patient.
 */
class Doctor {

    // Name of the doctor
    private String name;

    // Constructor to initialize doctor details
    Doctor(String name) {

        // Assign doctor name
        this.name = name;
    }

    // Method to consult a patient
    void consult(Patient patient) {

        // Display consultation message using patient object
        System.out.println("Dr." + name + " consulted " + patient.getName());
    }
}

/*
 * Class Name: Patient
 *
 * Description:
 * This class represents a Patient.
 * It stores patient details and is associated
 * with the Doctor during consultation.
 */
class Patient {

    // Name of the patient
    private String name;

    // Constructor to initialize patient details
    Patient(String name) {

        // Assign patient name
        this.name = name;
    }

    // Method to return patient name
    String getName() {
        return name;
    }
}

/*
 * Class Name: HospitalDemo
 *
 * Description:
 * This class contains the main method and demonstrates
 * interaction between Doctor and Patient objects
 * using association.
 */
class HospitalDemo {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Doctor object
        Doctor doctor = new Doctor("James Bond");

        // Creating Patient object
        Patient patient = new Patient("Ravi");

        // Doctor consults the patient
        doctor.consult(patient);
    }
}
