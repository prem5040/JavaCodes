package oops;

public class singletonExample{
    private static singletonExample instance;
    private singletonExample() {

    }

    public static singletonExample getInstance() {
        if (instance==null)
            instance = new singletonExample(); //if instance is not created, it will create instance
        return instance;
    }

    public static void main(String[] args) {
        singletonExample s1 = singletonExample.getInstance();
        singletonExample s2 = singletonExample.getInstance();
        // All reference variables are pointing to that same one object
        if (s1 == s2) {
            System.out.println("Both objects are the same instance.");
        }
    }
}

/*
Notes:
1. A Singleton class is a class that allows only one instance of itself to be created and provides a global point
    of access to that instance. This is achieved by making the constructor private, so that no other instances of the
    class can be created, and providing a static method that returns the single instance of the class.
2. The Singleton pattern is commonly used in situations where a single instance of a class needs to coordinate
    actions across the system, such as in a logging or configuration system. It ensures that there is only one
    instance of the class, which can be accessed globally, preventing unnecessary duplication and ensuring
    consistency across the system.

Implementation:
a. Declare a private static variable to hold the single instance of the class.
b. Make the constructor of the class private, so that no other instances can be created.
c. Provide a public static method to return the single instance of the class, creating it if necessary.
* */