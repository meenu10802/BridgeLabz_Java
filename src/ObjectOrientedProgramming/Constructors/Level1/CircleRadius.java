package ObjectOrientedProgramming.Constructors.Level1;

/*
 * CircleRadius class
 * ------------------
 * This class demonstrates constructor chaining.
 * A default constructor calls the parameterized constructor.
 */
public class CircleRadius {

    double radius;

    // Default constructor using constructor chaining
    CircleRadius() {
        this(1.0);
    }

    // Parameterized constructor
    CircleRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        CircleRadius c1 = new CircleRadius();
        CircleRadius c2 = new CircleRadius(5);

        System.out.println(c1.calculateArea());
        System.out.println(c2.calculateArea());
    }
}
