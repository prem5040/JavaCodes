package oops;

public class bindingExample {
    public static class superclass {
        void print(){
            System.out.println("Inside Superclass");
        }
    }

    public static class subclass extends superclass {
        @Override //Due to this line of code, Child method override parent method (Late Binding)
        void print(){
            System.out.println("Inside Subclass");
        }
    }

    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }
}

/*
a. Early Binding:
    The binding which can be resolved at compile time by the compiler is known as static or
    early binding. Binding of all the static, private and final methods is done at compile-time.
    Output: Inside Superclass (Comment out override method and make print method static for its example)
            Inside Superclass   (If you don't make print static, then child class will override parent method )

b. Late Binding:
    In the late binding or dynamic binding, the compiler doesn’t decide the method to be called. Overriding is a
    perfect example of dynamic binding. In overriding both parent and child classes have the same method.
    Output: Inside Superclass (For its example, remove static from print method and put @override annotation)
            Inside Subclass

    Note: Static methods cannot be annotated with @override.
 */