package oops;

public class garbageCollection {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);

        final A prem = new A("Prem Yadav");
        prem.name = "Stranger Things";
        // when a non primitive is final, you cannot reassign it.
        //prem = new A("new object");

        A obj = new A("Cricbuzz");
        System.out.println(obj);

//        for (int i = 0; i < 1000000000; i++) { //For Garbage Collection
//            obj = new A("Random name");
//        }

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }

    @Override  //Garbage Collection
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
