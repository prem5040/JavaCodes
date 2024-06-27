public class noOfDigits {

    //    Find no of digits of a number with base n(decimal, binary, Hexadecimal, Octal)
    //    Time Complexity=O(log(n))
    public static void main(String[] args) {
        int n = 10;
        int base = 2;
        int ans = (int) (Math.log(n) / Math.log(base)) + 1;
        System.out.println("No. Of digits in " + n + " = " + ans);


        //Find sum of nth row of pascal triangle
        System.out.println("Sum of nth row of pascal triangle = " + pascalTriangle(6));
        
    }

    static int pascalTriangle(int num) {
        return (1 << (num - 1));
        //return (int) Math.pow(2, num - 1);
    }


}
