package object_oriented_programming.Encapsulation;

import java.util.*;

/*
 * Problem Statement:
 * Write a Java program to demonstrate encapsulation, abstraction,
 * interfaces, inheritance, and polymorphism using a vehicle
 * rental system with insurance support.
 */

/*
 * Interface Name: Insurable
 *
 * Description:
 * This interface defines insurance-related behaviors
 * that insurable vehicles must implement.
 */
interface Insurable {

    // Method to calculate insurance cost
    double calculateInsurance();

    // Method to return insurance details
    String getInsuranceDetails();
}

/*
 * Abstract Class Name: Vehicle
 *
 * Description:
 * This abstract class represents a generic rental vehicle.
 * It demonstrates encapsulation using private variables
 * and abstraction using an abstract method for rental cost calculation.
 */
abstract class Vehicle {

    // Unique vehicle number
    private String vehicleNumber;

    // Rental rate per day
    private double rentalRate;

    // Constructor to initialize vehicle details
    Vehicle(String vehicleNumber, double rentalRate) {

        // Assign vehicle number
        this.vehicleNumber = vehicleNumber;

        // Assign rental rate
        this.rentalRate = rentalRate;
    }

    // Getter method to access rental rate
    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method to calculate rental cost
    abstract double calculateRentalCost(int days);
}

/*
 * Class Name: Car
 *
 * Description:
 * This class represents a car available for rental.
 * It extends the Vehicle abstract class and implements
 * the Insurable interface.
 */
class Car extends Vehicle implements Insurable {

    // Constructor to initialize car details
    Car(String no, double rate) {

        // Call superclass constructor
        super(no, rate);
    }

    // Implementation of rental cost calculation
    double calculateRentalCost(int days) {

        // Rental cost = rate per day × number of days
        return getRentalRate() * days;
    }

    // Implementation of insurance cost calculation
    public double calculateInsurance() {

        // Fixed insurance cost for car
        return 500;
    }

    // Returns insurance details
    public String getInsuranceDetails() {

        // Insurance description
        return "Car Insurance";
    }
}

/*
 * Class Name: VehRent
 *
 * Description:
 * This class contains the main method and demonstrates
 * polymorphism by storing vehicle objects in a list
 * and calculating their rental cost.
 */
public class VehRent {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating a list of vehicles
        List<Vehicle> vehicles = List.of(new Car("KA01", 2000));

        // Iterating through the vehicle list
        for (Vehicle v : vehicles) {

            // Calculating and displaying rental cost for 3 days
            System.out.println(v.calculateRentalCost(3));
        }
    }
}
