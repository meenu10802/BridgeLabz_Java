package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate inheritance and
 * interface implementation using different types of vehicles.
 */

/*
 * Interface Name: Refuelable
 *
 * Description:
 * This interface defines refueling behavior
 * that fuel-based vehicles must implement.
 */
interface Refuelable {

    // Method to refuel the vehicle
    void refuel();
}

/*
 * Class Name: VehicleBase
 *
 * Description:
 * This base class represents a generic vehicle.
 * It stores common properties like maximum speed
 * and model name.
 */
class VehicleBase {

    // Maximum speed of the vehicle
    int maxSpeed;

    // Model name of the vehicle
    String model;

    // Constructor to initialize vehicle details
    VehicleBase(int maxSpeed, String model) {

        // Assign maximum speed
        this.maxSpeed = maxSpeed;

        // Assign model name
        this.model = model;
    }
}

/*
 * Class Name: ElectricVehicle
 *
 * Description:
 * This class represents an electric vehicle.
 * It extends the VehicleBase class and provides
 * charging functionality.
 */
class ElectricVehicle extends VehicleBase {

    // Constructor to initialize electric vehicle details
    ElectricVehicle(int maxSpeed, String model) {

        // Call superclass constructor
        super(maxSpeed, model);
    }

    // Method to charge the electric vehicle
    void charge() {

        // Display charging action
        System.out.println("Charging vehicle");
    }
}

/*
 * Class Name: PetrolVehicle
 *
 * Description:
 * This class represents a petrol-powered vehicle.
 * It extends the VehicleBase class and implements
 * the Refuelable interface.
 */
class PetrolVehicle extends VehicleBase implements Refuelable {

    // Constructor to initialize petrol vehicle details
    PetrolVehicle(int maxSpeed, String model) {

        // Call superclass constructor
        super(maxSpeed, model);
    }

    // Implementation of refuel method from Refuelable interface
    public void refuel() {

        // Display refueling action
        System.out.println("Refueling vehicle");
    }
}
