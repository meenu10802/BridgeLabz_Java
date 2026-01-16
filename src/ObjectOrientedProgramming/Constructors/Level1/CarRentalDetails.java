package ObjectOrientedProgramming.Constructors.Level1;

/*
 * CarRentalDetails class
 * ----------------------
 * This class models a car rental system.
 * It calculates rental cost based on days.
 */
public class CarRentalDetails {

    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Parameterized constructor
    CarRentalDetails(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRentalDetails rental = new CarRentalDetails("Suresh", "Sedan", 4);
        System.out.println("Total Cost: " + rental.calculateTotalCost());
    }
}
