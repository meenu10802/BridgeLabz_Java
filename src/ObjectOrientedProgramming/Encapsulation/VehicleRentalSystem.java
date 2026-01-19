package ObjectOrientedProgramming.Encapsulation;

/*
 * Insurable interface
 * -------------------
 * Defines contract for insurance operations.
 */
interface Insurable {
    // Method to calculate insurance cost
    double calculateInsurance();
    // Method to get insurance details
    String getInsuranceDetails();
}

/*
 * Vehicle abstract class
 * ----------------------
 * Abstract superclass representing a rental vehicle.
 * Uses encapsulation to protect vehicle details.
 */
abstract class Vehicle {
    // Private: Vehicle number is protected
    private String vehicleNumber;
    // Protected: Rental rate can be accessed by subclasses
    protected double rentalRate;

    // Constructor to initialize vehicle
    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    // Getter for vehicle number
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    // Abstract method for rental cost calculation
    abstract double calculateRentalCost(int days);
}

/*
 * Car class
 * --------
 * Represents a Car for rental with insurance.
 * Implements Insurable interface.
 */
class Car extends Vehicle implements Insurable {
    // Constructor to initialize rental car
    public Car(String number, double rate) {
        super(number, rate);
    }

    // Calculate rental cost
    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    // Calculate insurance for car (500 rupees)
    @Override
    public double calculateInsurance() {
        return 500;
    }

    // Get car insurance details
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

/*
 * Bike class
 * ---------
 * Represents a Bike for rental.
 */
class Bike extends Vehicle {
    // Constructor to initialize rental bike
    public Bike(String number, double rate) {
        super(number, rate);
    }

    // Calculate rental cost
    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}

/*
 * Truck class
 * ---------
 * Represents a Truck for rental with insurance and 20% surcharge.
 * Implements Insurable interface.
 */
class Truck extends Vehicle implements Insurable {
    // Constructor to initialize rental truck
    public Truck(String number, double rate) {
        super(number, rate);
    }

    // Calculate rental cost with 20% surcharge
    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days * 1.2;
    }

    // Calculate insurance for truck (1000 rupees)
    @Override
    public double calculateInsurance() {
        return 1000;
    }

    // Get truck insurance details
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}

/*
 * VehicleRentalSystem class
 * -------------------------
 * Main class demonstrating polymorphism with different vehicle types.
 */
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Creating array of rental vehicles
        Vehicle[] vehicles = {
                new Car("TN01", 2000),
                new Bike("TN02", 500),
                new Truck("TN03", 4000)
        };

        // Display rental cost and insurance for each vehicle
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: " + v.calculateRentalCost(3));

            // Check if vehicle has insurance
            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance Cost: " + i.calculateInsurance());
            }
            System.out.println("-------------------");
        }
    }
}
