package ObjectOrientedProgramming.Inheritance;

/*
 * AnimalBase class
 * ----------------
 * Superclass representing a generic animal.
 * It defines common attributes and behavior.
 */
class AnimalBase {

    String name;
    int age;

    AnimalBase(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

/*
 * DogAnimal class
 * ----------------
 * Subclass of AnimalBase with dog-specific behavior.
 */
class DogAnimal extends AnimalBase {

    DogAnimal(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

/*
 * CatAnimal class
 * ----------------
 * Subclass of AnimalBase with cat-specific behavior.
 */
class CatAnimal extends AnimalBase {

    CatAnimal(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

/*
 * BirdAnimal class
 * -----------------
 * Subclass of AnimalBase with bird-specific behavior.
 */
class BirdAnimal extends AnimalBase {

    BirdAnimal(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

/*
 * AnimalHierarchyDemo
 * -------------------
 * Demonstrates polymorphism using AnimalBase reference.
 */
class AnimalHierarchyDemo {

    public static void main(String[] args) {

        // Polymorphism: superclass reference holding subclass objects
        AnimalBase[] animals = {
                new DogAnimal("Tommy", 3),
                new CatAnimal("Kitty", 2),
                new BirdAnimal("Tweety", 1)
        };

        // Loop calling overridden methods dynamically
        for (AnimalBase animal : animals) {
            animal.makeSound();
        }
    }
}
