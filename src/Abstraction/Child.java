package Abstraction;

public class Child extends Parent {

    // Constructor that calls the parent constructor using super().
    Child(int temp, int fin) {
        super(temp, fin); // Passes temp and fin to the parent class constructor.
    }

    // All abstract methods of the parent abstract class must be overridden by the child class.
    @Override
    public void greet() {
        System.out.println("hello"); // Provides implementation for the abstract method from Parent.
    }
}


/**
 * Child Class: Extends the abstract Parent class and must implement all abstract methods from the parent class.
 * Constructor: The super() keyword is used to call the parent class constructor.
 * Overriding: The greet() method from the Parent class is abstract, so it must be overridden in the Child class with its implementation.
 */