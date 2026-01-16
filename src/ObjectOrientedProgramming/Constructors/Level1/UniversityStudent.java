package ObjectOrientedProgramming.Constructors.Level1;

/*
 * UniversityStudent class
 * -----------------------
 * Demonstrates public, protected, and private access.
 */
public class UniversityStudent {

    public int rollNumber;
    protected String name;
    private double cgpa;

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends UniversityStudent {

    void displayDetails() {
        System.out.println(rollNumber + " - " + name);
    }
}
