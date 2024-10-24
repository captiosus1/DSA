package Abstraction;

// If a class has at least one abstract method, the class must be abstract.
public abstract class Parent {

    // Static and final variables can be declared.
    static int temp;
    final int fin; // Must be initialized in the constructor.
    int normal;

    // Constructor to initialize variables.
    Parent(int temp, int fin) {
        Parent.temp = temp;  // Static variable assigned using class name.
        this.fin = fin;      // Final variable initialized here.
        normal = 10;         // Normal instance variable initialized.
    }

    // Static methods cannot be abstract because static methods cannot be overridden.
    // Abstract methods do not have a body, hence contradiction.
//    abstract static void hello();  // This is not allowed.

    // Static methods are allowed in abstract classes.
    static void hi() {
        System.out.println("Hi");
    }

    final void temp(){
        System.out.println("zhello");
    }

    private void setTemp(){

    }

    // Non-abstract (concrete) methods are allowed in abstract classes.
    void greethello() {
        System.out.println("Hi");
    }

    // Abstract methods cannot have a body; they must be implemented by child classes.
    abstract void greet();
}


/**
 * Abstract Class: A class that cannot be instantiated and can have both abstract (without a body) and non-abstract methods.
 * Static Methods: Can exist in an abstract class, but they cannot be abstract because static methods cannot be overridden.
 * Final Variables: Must be initialized once, either directly or through the constructor.
 * Abstract Method: Must be implemented in child classes.
 */