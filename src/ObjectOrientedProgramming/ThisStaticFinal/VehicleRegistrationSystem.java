package ObjectOrientedProgramming.ThisStaticFinal;

/*
 * VehicleRegistrationSystem class
 * -------------------------------
 * This class manages vehicle registrations.
 * It uses static registration fee, final registration number,
 * this keyword, and instanceof operator.
 */
public class VehicleRegistrationSystem {

    static double registrationFee = 5000;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    // Constructor using this keyword
    VehicleRegistrationSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayVehicle(Object obj) {
        if (obj instanceof VehicleRegistrationSystem) {
            System.out.println(ownerName + " | " + vehicleType + " | " + registrationNumber);
        }
    }

    public static void main(String[] args) {
        VehicleRegistrationSystem v = new VehicleRegistrationSystem("Raj", "Car", "TN09AB1234");
        v.displayVehicle(v);
    }
}
