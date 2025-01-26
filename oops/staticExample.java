package oops;

public class staticExample {
    static int a=10; //Static Members and their Initialization
    static  int b;

    static{                     //Static Block
        System.out.println("Inside Static Block");
        b=20;
    }


    public static void main(String[] args) {
        System.out.println("Value of a:" + a);
        System.out.println("Value of b:"+b);

        staticExample obj=new staticExample();
        a+=20;
        b--;
        System.out.println("Value of a and b: " +obj.a + " & " + obj.b);
        greeting();
//        fun();   Not Allowed
    }

    static void greeting()
    {
        System.out.println("Greeting");
//        fun(); //Not Allowed bcoz fun is a non-static method
    }
    void fun()
    {
        System.out.println("Coding is Fun");
        greeting(); // Allowed
    }
}

/*
Notes:
Static keyword is used for constant variable or method that is same for every instance of a class.

Here are some characteristics of the static keyword in Java:
1. Static variables and methods are allocated memory space only once during the execution of the program. This memory
    space is shared among all instances of the class, which makes static members useful for maintaining global state or
    shared functionality.
2. Static members can be accessed without the need to create an instance of the class. This makes them useful for
    providing utility functions and constants that can be used across the entire program.
3. Static members are associated with the class, not with individual objects. This means that changes to a static
    member are reflected in all instances of the class, and that you can access static members using the class name
    rather than an object reference.
4. Static methods and variables cannot access non-static members of a class, as they are not associated with any
    particular instance of the class.
5. Static methods can be overloaded, which means that you can define multiple methods with the same name but
    different parameters. However, they cannot be overridden, as they are associated with the class rather than with a
    particular instance of the class

Note:
a. When a method/member is declared static, it can be accessed before any object of its classes are created. That's
   why main method is static in java.
b. When we declare a static block gets executed exactly only once, when class is first loaded.
c. Static method can be accessed by static method only because static method do not require instances.
d. You can't access non-static stuff without referencing their instances in static method.
e. We can't use "this" word inside static method. we should use class reference;
   class Test{
        static int count=0;
        void
        sout(this.count); //Not allowed
   }
   psvm(){
        Test obj = new Test();
        sout(obj.count); // Not allowed
        sout(Test.count);  // Allowed and preferred
   }
* */
