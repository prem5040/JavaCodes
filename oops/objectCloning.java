package oops;

import java.util.Arrays;

class Human implements Cloneable
{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age=age;
        this.name=name;
        this.arr=new int[]{2,1,4,5};
    }
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone(); //This is a shallow copy
    }
}

public class objectCloning {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human prem=new Human(32, "Prem Yadav");
//        Human another= new Human(prem); //It takes a lot of time
        // So, we will use Object Cleaning method known as cloneable

        Human twin =(Human)prem.clone();
        System.out.println("Prem: "+prem.age+" "+ prem.name+" "+Arrays.toString(prem.arr));
        System.out.println("Prem: "+twin.age+" "+ twin.name+" "+Arrays.toString(twin.arr));
        //This copy is shallow copy
        prem.age=25;
        prem.arr[2]=200;
        System.out.println("After changes in Cloning:");
        System.out.println("Prem: "+twin.age+" "+ twin.name+" "+ Arrays.toString(twin.arr));


        Human triplet=(Human) prem.clone();

    }
}
