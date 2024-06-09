import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        int start = 10;
//        int end = 70;
//        System.out.println("Fibonacci numbers between " + start + " and " + end + " are:");
//        fib(start, end);


        // Program for Fibonacci series up to nth position
        int nth = 10;
        System.out.println("Fibonacci Numbers up to " + nth + " position are:");
        for (int i = 0; i <= nth; ++i) {
            System.out.print(fib2(i) + " ");
        }
        System.out.println();

//        Program for nth fibonacci number using recursion
        int fib3 = 10;
        System.out.println("Fibonacci Numbers at " + fib3 + " position=");
        System.out.println();
    }

    // Fibonacci series between given range without using recursion
    public static void fib(int start, int end) {
        int a = 0, b = 1;
        int sum = 0;

        for (int i = 2; i <= end; i++) {
            sum = a + b;
            if (sum >= start && sum <= end)
                System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }

    //Fibonacci upto nth number using recursion
    public static int fib2(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return fib2(n - 1) + fib2(n - 2);


    }

    //    nth fibonacci number using recursion;
    public static int fib3(int n) {
        if (n < 2)
            return n;
        return fib3(n - 2) + fib3(n - 1);
    }

}



/*
1. While the function is not finished executing, it will remain in stack memory.
   And if memory is exhausted by these function in the stack it will cause overflow error(Stack Overflow).
   This phenomenon happens if base condition is not given.
2. When a function finishes executing it is removed from stack and flow of program is restored to where function is called.

3. Recursions helps in solving bigger complex function by breaking into simpler and smaller problems.
4. You can convert recursions into iterations and vice versa
5. A function is said to be tail recursive when recursive call is the last thing executed by the function.
6. Direct Recursion: function that calls itself
   Indirect Recursion: function that calls another function

 */


