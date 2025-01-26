package oops;

interface Add{
    int add(int a,int b);
}
interface Sub{
    int sub(int a,int b);
}

class calc implements Add , Sub //Multiple Inheritance
{
    int a; //This is not accessible
    @Override
    public int add(int a,int b){
        return a+b;
    }
    @Override
    public int sub(int a,int b){
        return a-b;
    }
}

public class interfaces {
    public static void main(String[] args) {
        calc x = new calc();

        System.out.println("Addition : " + x.add(20,10));
        System.out.println("Subtraction : " + x.sub(20,10));
    }
}


/*
Notes:
An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
An interface in Java is a blueprint of a behavior. A Java interface contains static constants and abstract methods.

1. The interface in Java is a mechanism to achieve abstraction.
2. By default, variables in an interface are public, static, and final.
3. It is used to achieve abstraction and multiple inheritances in Java.
4. It is also used to achieve loose coupling.
5. In other words, interfaces primarily define methods that other classes must implement.
6. Java Interface also represents the IS-A relationship.

Note: In Java, the abstract keyword applies only to classes and methods, indicating that they cannot
be instantiated directly and must be implemented. When we decide on a type of entity by its behavior
and not via attribute we should define it as an interface.

To declare an interface, use the interface keyword. It is used to provide total abstraction.
That means all the methods in an interface are declared with an empty body and are public
and all fields are public, static, and final by default. A class that implements an interface
must implement all the methods declared in the interface. To implement the interface, use the
implements keyword.

only a class can implement an interface, and the reverse (an interface implementing a class) is not allowed.




* */
