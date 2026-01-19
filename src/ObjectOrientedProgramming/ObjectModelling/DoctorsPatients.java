package ObjectOrientedProgramming.ObjectModelling.Level1;

/*
 * PatientDetails class
 * --------------------
 * Represents a patient with a name.
 * Can exist independently (Aggregation).
 */
class PatientDetails {
    String name;  // Name of the patient

    // Constructor to initialize patient
    PatientDetails(String name) {
        this.name = name;
    }
}

/*
 * DoctorDetails class
 * -------------------
 * Represents a doctor who consults patients (Aggregation).
 * Doctor can have association with multiple patients.
 */
class DoctorDetails {
    String name;  // Name of the doctor

    // Constructor to initialize doctor
    DoctorDetails(String name) {
        this.name = name;
    }

    // Method for doctor to consult a patient
    void consult(PatientDetails patient) {
        System.out.println(name + " consulting " + patient.name);
    }
}

/*
 * HospitalDetails class
 * --------------------
 * Demonstrates association between doctors and patients.
 * Both can exist independently.
 */
class HospitalDetails {

    public static void main(String[] args) {
        // Creating doctor and patient objects
        DoctorDetails doc = new DoctorDetails("Dr. Mehta");
        PatientDetails pat = new PatientDetails("Ramesh");

        // Doctor consulting patient
        doc.consult(pat);
    }
}
