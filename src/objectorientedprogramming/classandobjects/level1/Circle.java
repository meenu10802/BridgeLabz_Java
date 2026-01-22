package ObjectOrientedProgramming.ClassAndObjects.Level1;

/*
 * Circle class
 * ------------
 * This class represents a Circle.
 * It stores the radius and provides methods
 * to calculate area and circumference.
 */
public class Circle {

    // Attribute to store radius
    double radius;

    // Method to calculate area of the circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference of the circle
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Creating Circle object
        Circle c = new Circle();

        // Assigning radius
        c.radius = 7;

        // Displaying area and circumference
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());
    }
}
