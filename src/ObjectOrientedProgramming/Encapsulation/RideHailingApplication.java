package ObjectOrientedProgramming.Encapsulation;

/*
 * GPS interface
 * -------------
 * Defines contract for GPS functionality.
 */
interface GPS {
    // Method to update location
    void updateLocation(String location);
    // Method to get current location
    String getCurrentLocation();
}

/*
 * RideVehicle abstract class
 * --------------------------
 * Abstract superclass representing a ride-hailing vehicle.
 * Uses encapsulation to protect vehicle and driver details.
 */
abstract class RideVehicle {
    // Private: Vehicle and driver details are protected
    private int vehicleId;
    private String driverName;
    // Protected: Can be accessed by subclasses
    protected double ratePerKm;

    // Constructor to initialize ride vehicle
    public RideVehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method for fare calculation
    abstract double calculateFare(double distance);

    // Concrete method to display vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
    }
}

/*
 * RideCar class
 * -----------
 * Represents a Car in the ride-hailing service.
 * Implements GPS interface for location tracking.
 */
class RideCar extends RideVehicle implements GPS {
    private String location;  // Current location of the car

    // Constructor to initialize ride car
    public RideCar(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    // Calculate fare based on distance
    @Override
    double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    // Update car location
    public void updateLocation(String location) {
        this.location = location;
    }

    // Get current location of car
    public String getCurrentLocation() {
        return location;
    }
}

/*
 * RideBike class
 * -----------
 * Represents a Bike in the ride-hailing service.
 */
class RideBike extends RideVehicle {
    // Constructor to initialize ride bike
    public RideBike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    // Calculate fare based on distance
    @Override
    double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}

/*
 * RideAuto class
 * -----------
 * Represents an Auto (3-wheeler) in the ride-hailing service.
 */
class RideAuto extends RideVehicle {
    // Constructor to initialize ride auto
    public RideAuto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    // Calculate fare with 20 rupees extra charge for auto
    @Override
    double calculateFare(double distance) {
        return (ratePerKm * distance) + 20;
    }
}

/*
 * RideHailingApplication class
 * ----------------------------
 * Main class demonstrating polymorphism with different vehicle types.
 */
public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating array of vehicles using parent reference (Polymorphism)
        RideVehicle[] rides = {
                new RideCar(1, "Ravi", 15),
                new RideBike(2, "Suresh", 10),
                new RideAuto(3, "Kumar", 12)
        };

        // Calculate and display fare dynamically for different vehicle types
        for (RideVehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for 10 km: " + v.calculateFare(10));
            System.out.println("--------------------------------");
        }
    }
}
