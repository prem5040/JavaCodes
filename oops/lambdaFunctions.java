package oops;

public class lambdaFunctions {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a+b;
        Operation sub = (a, b) -> a-b;
        Operation prod = (a, b) -> a*b;

        lambdaFunctions calc=new lambdaFunctions();
        System.out.println(calc.operate(5,3,sum));
        System.out.println(calc.operate(5,3,sub));
        System.out.println(calc.operate(5,3,prod));
    }
    private int operate(int a, int b,Operation op){
        return  op.operation(a,b);
    }
}

interface Operation {
    int operation(int a, int b);
}

/*
* Notes:
* */