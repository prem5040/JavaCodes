package oops.inheritence;

public class box {
    double l,w,h;

    public box() {
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    public box(double l, double w, double h) {
        System.out.println("Box(Parent) Class Constructor");
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public box(double side) {
//        super(); //Object Class
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public box(box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
    public void info(){
        System.out.println("Running the box/Parent Class");
    }

}
