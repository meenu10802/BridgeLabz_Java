package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate inheritance and
 * method overriding using an Animal hierarchy.
 */

/*
 * Class Name: Animal
 *
 * Description:
 * This superclass represents a generic animal.
 * It stores common attributes like name and age
 * and provides a method that can be overridden by subclasses.
 */
class Animal {

    // Name of the animal
    String name;

    // Age of the animal
    int age;

    // Constructor to initialize animal details
    Animal(String name, int age) {

        // Assign animal name
        this.name = name;

        // Assign animal age
        this.age = age;
    }

    // Method to display generic animal sound
    void makeSound() {

        // Default sound behavior
        System.out.println("Animal makes a sound");
    }
}

/*
 * Class Name: Dog
 *
 * Description:
 * This class represents a Dog and extends the Animal class.
 * It overrides the makeSound() method to provide
 * dog-specific behavior.
 */
class Dog extends Animal {

    // Constructor to initialize dog details
    Dog(String name, int age) {

        // Call superclass constructor
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    void makeSound() {

        // Dog-specific sound
        System.out.println("Dog barks");
    }
}

/*
 * Class Name: Cat
 *
 * Description:
 * This class represents a Cat and extends the Animal class.
 * It overrides the makeSound() method to provide
 * cat-specific behavior.
 */
class Cat extends Animal {

    // Constructor to initialize cat details
    Cat(String name, int age) {

        // Call superclass constructor
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    void makeSound() {

        // Cat-specific sound
        System.out.println("Cat meows");
    }
}

/*
 * Class Name: Bird
 *
 * Description:
 * This class represents a Bird and extends the Animal class.
 * It overrides the makeSound() method to provide
 * bird-specific behavior.
 */
class Bird extends Animal {

    // Constructor to initialize bird details
    Bird(String name, int age) {

        // Call superclass constructor
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    void makeSound() {

        // Bird-specific sound
        System.out.println("Bird chirps");
    }
}
