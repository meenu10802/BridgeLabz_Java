package ObjectOrientedProgramming.ThisStaticFinal;

/*
 * HospitalPatientSystem class
 * ---------------------------
 * This class manages patient records in a hospital.
 * It demonstrates static members, final patient ID,
 * this keyword, and instanceof usage.
 */
public class HospitalPatientSystem {

    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    // Constructor using this keyword
    HospitalPatientSystem(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatient(Object obj) {
        if (obj instanceof HospitalPatientSystem) {
            System.out.println(name + " | " + age + " | " + ailment);
        }
    }

    public static void main(String[] args) {
        HospitalPatientSystem p = new HospitalPatientSystem("Sita", 30, "Fever", 701);
        p.displayPatient(p);
        getTotalPatients();
    }
}
