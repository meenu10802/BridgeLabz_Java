package ObjectOrientedProgramming.Constructors.Level1;

/*
 * VehicleRegistration class
 * -------------------------
 * Demonstrates static registration fee for all vehicles.
 */
public class VehicleRegistration {

    String ownerName;
    String vehicleType;

    static double registrationFee = 5000;

    VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType + " | Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}
