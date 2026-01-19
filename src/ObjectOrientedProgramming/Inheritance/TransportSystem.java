package ObjectOrientedProgramming.Inheritance;

/*
 * VehicleBase class
 * -----------------
 * Superclass representing a generic vehicle.
 * Contains common vehicle attributes.
 */
class VehicleBase {
    int maxSpeed;  // Maximum speed of the vehicle
    String fuelType;  // Type of fuel used

    // Constructor to initialize vehicle
    VehicleBase(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    void displayInfo() {
        System.out.println(maxSpeed + " km/h | " + fuelType);
    }
}

/*
 * CarVehicle class
 * ----------------
 * Subclass representing a Car.
 * Extends VehicleBase with seat capacity.
 */
class CarVehicle extends VehicleBase {
    int seatCapacity;  // Number of seats in the car

    // Constructor to initialize car
    CarVehicle(int speed, String fuel, int seats) {
        super(speed, fuel);
        this.seatCapacity = seats;
    }

    // Overridden method to include seat capacity
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

/*
 * TruckVehicle class
 * ------------------
 * Subclass representing a Truck.
 * Extends VehicleBase with load capacity.
 */
class TruckVehicle extends VehicleBase {
    int loadCapacity;  // Load capacity in kg

    // Constructor to initialize truck
    TruckVehicle(int speed, String fuel, int load) {
        super(speed, fuel);
        this.loadCapacity = load;
    }

    // Overridden method to include load capacity
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

/*
 * MotorcycleVehicle class
 * -----------------------
 * Subclass representing a Motorcycle.
 * Extends VehicleBase with basic motorcycle attributes.
 */
class MotorcycleVehicle extends VehicleBase {
    // Constructor to initialize motorcycle
    MotorcycleVehicle(int speed, String fuel) {
        super(speed, fuel);
    }

    // Overridden method to display motorcycle type
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Two Wheeler");
    }
}

/*
 * VehiclePolymorphismDemo
 * -----------------------
 * Demonstrates polymorphism using VehicleBase reference.
 */
class VehiclePolymorphismDemo {

    public static void main(String[] args) {
        // Polymorphism: parent reference holding child objects
        VehicleBase[] vehicles = {
                new CarVehicle(180, "Petrol", 5),
                new TruckVehicle(120, "Diesel", 10000),
                new MotorcycleVehicle(150, "Petrol")
        };

        // Loop calling overridden methods dynamically
        for (VehicleBase v : vehicles) {
            v.displayInfo();
        }
    }
}
