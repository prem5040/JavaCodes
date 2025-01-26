package oops.inheritence;

public class boxWeight extends box{
    double weight;

    public boxWeight() {
        this.weight=-1;
    }
    boxWeight(boxWeight other){
        super(other);
        weight=other.weight;
    }

    public boxWeight(double l, double w, double h, double weight) {
        //super(l,w,h) calls parent_class(box) constructor & used to initialize value in parent class
        super(l, w, h);
        System.out.println("Inside child(boxWeight) class constructor called");

        // "super.h" will access value from parent class and,
        // if child class would have same variable 'h' then it would be accessible as "this.h"
        // System.out.println(super.h);
        this.weight = weight;
    }
}
