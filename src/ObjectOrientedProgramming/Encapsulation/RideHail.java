package object_oriented_programming.Encapsulation;

/*
 * Problem Statement:
 * Write a Java program to demonstrate encapsulation, abstraction,
 * interfaces, inheritance, and polymorphism using a ride-hailing system.
 */

/*
 * Interface Name: GPS
 *
 * Description:
 * This interface defines GPS-related functionalities
 * such as fetching and updating the current location.
 */
interface GPS {

    // Method to get current location of the vehicle
    String getCurrentLocation();

    // Method to update the vehicle location
    void updateLocation(String location);
}

/*
 * Abstract Class Name: Vehicle
 *
 * Description:
 * This abstract class represents a generic vehicle in a ride-hailing system.
 * It demonstrates encapsulation using private variables, abstraction using
 * abstract methods, and provides common vehicle functionality.
 */
abstract class Vehicle {

    // Unique identifier for the vehicle
    private String vehicleId;

    // Rate charged per kilometer (accessible by subclasses)
    protected double ratePerKm;

    // Constructor to initialize vehicle details
    Vehicle(String id, double rate) {

        // Assign vehicle ID
        vehicleId = id;

        // Assign rate per kilometer
        ratePerKm = rate;
    }

    // Abstract method to calculate fare based on distance
    abstract double calculateFare(double distance);

    // Method to display vehicle details
    void getVehicleDetails() {

        // Display vehicle ID
        System.out.println(vehicleId);
    }
}

/*
 * Class Name: Auto
 *
 * Description:
 * This class represents an Auto vehicle.
 * It extends the Vehicle abstract class and
 * provides fare calculation logic.
 */
class Auto extends Vehicle {

    // Constructor to initialize auto details
    Auto(String id, double rate) {

        // Call superclass constructor
        super(id, rate);
    }

    // Implementation of fare calculation
    double calculateFare(double distance) {

        // Fare = rate per km × distance traveled
        return ratePerKm * distance;
    }
}

/*
 * Class Name: RideHail
 *
 * Description:
 * This class contains the main method and demonstrates
 * polymorphism by using a Vehicle reference to access
 * an Auto object at runtime.
 */
public class RideHail {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Auto object using Vehicle reference
        Vehicle v = new Auto("AUTO1", 15);

        // Calculating and displaying fare for 10 km ride
        System.out.println(v.calculateFare(10));
    }
}
