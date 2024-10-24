package Abstraction;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Child class
        Child child = new Child(5, 4);
        child.greet();  // Calls the overridden greet() method from Child class
        System.out.println(child.fin);  // Access final variable from Parent class

        // Modify static variable
        Child.temp = 50;
        System.out.println(Child.temp);  // Static variable is shared across all instances

        // Create another instance of Child class
        Child child2 = new Child(40, 80);
        System.out.println(Child.temp);  // Static variable remains updated for all instances
        System.out.println(child2.fin);  // Access final variable of the second instance
    }
}

/**
 * Child Instance: child and child2 are instances of the Child class, which inherits from the abstract Parent class.
 * Static Variable (temp): Shared across all instances of the class. When you modify temp through one instance, it affects all instances.
 * Final Variable (fin): Initialized in the constructor and cannot be changed once assigned. Each instance has its own copy of the final variable.
 * Method Call: greet() is overridden in the Child class and called on the child instance.
 */