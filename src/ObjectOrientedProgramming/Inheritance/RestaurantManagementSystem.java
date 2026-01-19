package ObjectOrientedProgramming.Inheritance;

/*
 * WorkerRole interface
 * --------------------
 * Defines contract for worker behavior.
 */
interface WorkerRole {
    // Method to perform job duties
    void performDuties();
}

/*
 * PersonBase class
 * ----------------
 * Abstract superclass representing a person in restaurant.
 * Contains common attributes for all roles.
 */
abstract class PersonBase {
    String name;  // Name of the person
    int id;  // Person ID

    // Constructor to initialize person
    PersonBase(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to display role
    abstract void displayRole();
}

/*
 * ChefWorker class
 * ----------------
 * Subclass representing a Chef.
 * Implements both PersonBase and WorkerRole.
 */
class ChefWorker extends PersonBase implements WorkerRole {
    // Constructor to initialize chef
    ChefWorker(String name, int id) {
        super(name, id);
    }

    // Implementation of abstract method
    @Override
    void displayRole() {
        System.out.println("Chef - " + name);
    }

    // Implementation of interface method
    @Override
    public void performDuties() {
        System.out.println("Cooking food");
    }
}

/*
 * WaiterWorker class
 * ------------------
 * Subclass representing a Waiter.
 * Implements both PersonBase and WorkerRole.
 */
class WaiterWorker extends PersonBase implements WorkerRole {
    // Constructor to initialize waiter
    WaiterWorker(String name, int id) {
        super(name, id);
    }

    // Implementation of abstract method
    @Override
    void displayRole() {
        System.out.println("Waiter - " + name);
    }

    // Implementation of interface method
    @Override
    public void performDuties() {
        System.out.println("Serving customers");
    }
}
