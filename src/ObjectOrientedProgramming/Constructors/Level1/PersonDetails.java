package ObjectOrientedProgramming.Constructors.Level1;

/*
 * PersonDetails class
 * -------------------
 * This class demonstrates a copy constructor.
 * It creates a new object by copying another object.
 */
public class PersonDetails {

    String name;
    int age;

    // Parameterized constructor
    PersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    PersonDetails(PersonDetails p) {
        this.name = p.name;
        this.age = p.age;
    }

    void displayPerson() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        PersonDetails p1 = new PersonDetails("Amit", 25);
        PersonDetails p2 = new PersonDetails(p1);

        p1.displayPerson();
        p2.displayPerson();
    }
}
