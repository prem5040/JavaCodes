package oops.inheritence;

public class Main {
    public static void main(String[] args) {
        box box1= new box(4.6,3.2,8.6);
        box box2=new box(box1);
        System.out.println("Box1.l Box2.h: "+box1.l+" & "+box2.h);

        boxWeight box3 =new boxWeight();
        boxWeight box4 =new boxWeight(2,4,6,8);
        System.out.println(box3.h+" and "+box3.weight);


        box box5=new boxWeight(1,2,3,4); // boxWeight object is created here(in heap memory) and,
                                //its reference is stored in box5 of type box class(stack memory )
                                //i.e child class is referred by parent class
        System.out.println(box5);


//        There are many variables in both parent and child
//        you are given access to variables that are in ref type i.e boxWeight
//        Hence, you should have access to weight variable
//        this means that ones we are trying to access should also be initialized
//        but here object itself is of parent class, so we cant call parent constructor bcoz. parent class has no idea about weight variable of child class
//        *<Code>*
//        boxWeight box6 = new  box(9,8,7);
//        Here, Parent is referred by parent, Thus, it's not possible.
//        System.out.println();
//        *</Code>*
    }
}
