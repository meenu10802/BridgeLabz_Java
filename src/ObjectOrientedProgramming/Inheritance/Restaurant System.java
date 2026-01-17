package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate interface implementation
 * and inheritance using different worker roles in an organization.
 */

/*
 * Interface Name: Worker
 *
 * Description:
 * This interface defines a common behavior that
 * all worker roles must implement.
 */
interface Worker {

    // Method to perform job-specific duties
    void performDuties();
}

/*
 * Class Name: PersonBase
 *
 * Description:
 * This base class represents a generic person.
 * It stores common attributes like name and id
 * that are shared by all worker types.
 */
class PersonBase {

    // Name of the person
    String name;

    // Unique identifier for the person
    int id;

    // Constructor to initialize person details
    PersonBase(String name, int id) {

        // Assign person name
        this.name = name;

        // Assign person ID
        this.id = id;
    }
}

/*
 * Class Name: Chef
 *
 * Description:
 * This class represents a Chef.
 * It extends the PersonBase class and
 * implements the Worker interface.
 */
class Chef extends PersonBase implements Worker {

    // Constructor to initialize chef details
    Chef(String name, int id) {

        // Call superclass constructor
        super(name, id);
    }

    // Implementation of Worker interface method
    public void performDuties() {

        // Chef-specific duty
        System.out.println("Cooking food");
    }
}

/*
 * Class Name: Waiter
 *
 * Description:
 * This class represents a Waiter.
 * It extends the PersonBase class and
 * implements the Worker interface.
 */
class Waiter extends PersonBase implements Worker {

    // Constructor to initialize waiter details
    Waiter(String name, int id) {

        // Call superclass constructor
        super(name, id);
    }

    // Implementation of Worker interface method
    public void performDuties() {

        // Waiter-specific duty
        System.out.println("Serving customers");
    }
}
