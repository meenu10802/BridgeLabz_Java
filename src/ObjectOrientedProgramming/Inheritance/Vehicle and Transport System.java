package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate inheritance and
 * method overriding using different types of vehicles.
 */

/*
 * Class Name: Vehicle
 *
 * Description:
 * This superclass represents a generic vehicle.
 * It stores common properties such as maximum speed
 * and fuel type and provides a method to display them.
 */
class Vehicle {

    // Maximum speed of the vehicle
    int maxSpeed;

    // Type of fuel used by the vehicle
    String fuelType;

    // Constructor to initialize vehicle details
    Vehicle(int maxSpeed, String fuelType) {

        // Assign maximum speed
        this.maxSpeed = maxSpeed;

        // Assign fuel type
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    void displayInfo() {

        // Display speed and fuel type
        System.out.println(maxSpeed + " " + fuelType);
    }
}

/*
 * Class Name: Car
 *
 * Description:
 * This class represents a Car.
 * It extends the Vehicle class and adds
 * seat capacity information.
 */
class Car extends Vehicle {

    // Number of seats in the car
    int seatCapacity;

    // Constructor to initialize car details
    Car(int maxSpeed, String fuelType, int seatCapacity) {

        // Call superclass constructor
        super(maxSpeed, fuelType);

        // Assign seat capacity
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo method
    @Override
    void displayInfo() {

        // Display vehicle details along with seat capacity
        System.out.println(maxSpeed + " " + fuelType + " " + seatCapacity);
    }
}

/*
 * Class Name: Truck
 *
 * Description:
 * This class represents a Truck.
 * It extends the Vehicle class and adds
 * load capacity information.
 */
class Truck extends Vehicle {

    // Load capacity of the truck
    int loadCapacity;

    // Constructor to initialize truck details
    Truck(int maxSpeed, String fuelType, int loadCapacity) {

        // Call superclass constructor
        super(maxSpeed, fuelType);

        // Assign load capacity
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo method
    @Override
    void displayInfo() {

        // Display vehicle details along with load capacity
        System.out.println(maxSpeed + " " + fuelType + " " + loadCapacity);
    }
}

/*
 * Class Name: Motorcycle
 *
 * Description:
 * This class represents a Motorcycle.
 * It extends the Vehicle class and adds
 * gear-related information.
 */
class Motorcycle extends Vehicle {

    // Indicates whether the motorcycle has gears
    boolean hasGear;

    // Constructor to initialize motorcycle details
    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {

        // Call superclass constructor
        super(maxSpeed, fuelType);

        // Assign gear information
        this.hasGear = hasGear;
    }

    // Overriding displayInfo method
    @Override
    void displayInfo() {

        // Display vehicle details along with gear information
        System.out.println(maxSpeed + " " + fuelType + " " + hasGear);
    }
}
