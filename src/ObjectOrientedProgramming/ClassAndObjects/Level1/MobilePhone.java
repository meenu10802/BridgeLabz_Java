package ObjectOrientedProgramming.ClassAndObjects.Level1;

/*
 * MobilePhone class
 * -----------------
 * This class represents a Mobile Phone.
 * It stores brand, model, and price.
 * The class provides a method to display phone details.
 */
public class MobilePhone {

    String brand;
    String model;
    double price;

    // Method to display mobile phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();

        phone.brand = "Samsung";
        phone.model = "Galaxy S23";
        phone.price = 75000;

        phone.displayDetails();
    }
}
