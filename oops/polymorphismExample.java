package oops;
class shape{
    void area(){
        System.out.println("I am in Shape Area");
    }
}

class circle extends shape{
    @Override //Annotations to check if it is over-ridden or not with parent method or not
    //This will run when obj of circle is created, hence it is overriding the parent method
    void area(){
        System.out.println("I am the area of circle=pie*r*r");
    }
    double area(double a, double b) { //Method Overloading So, Compile-Time Polymorphism
        return a + b;
    }
}

class triangle extends shape{
    @Override
    void area() { // Over-ridden so, Example of Dynamic Polymorphism
        super.area();
        System.out.println("I am the area of triangle");
    }
}

public class polymorphismExample {
    public static void main(String[] args) {
        shape shap= new shape();
        shape circ=new circle();
        triangle tri=new triangle();

        circ.area(); // its object type is circle, so it will call area method of circle class.
        tri.area();
    }
}
/*
Polymorphism refers to the ability of message to be displayed  in more than one form. It allows obj to behave
differently based on their specific class type.

1. Compile-time/Static Polymorphism
    It is achieved by method overloading. Method overloading means there are multiple functions with same name,
    but different parameters. Functions can be overloaded by changes in the number of arguments or/and a
    change in arguments.

2. Runtime/Dynamic Polymorphism
    It is also known as "Dynamic Method Dispatch". It is the process in which a function call to the over-ridden
    method is resolved at runtime. It is achieved by Method Overriding.
    On the other hand, Method overriding occurs when a derived class has a definition for one of the member functions
    of the base class. That base function is said to be overridden.

Also refer this link to understand about Early Binding and Late Binding(v. Imp Concept)
https://geeksforgeeks.org/difference-between-early-and-late-binding-in-java/
*/
