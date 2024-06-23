//Find the first position of rightmost Set Bit

public class positionOfRightMostSetBit {
    public static void main(String[] args) {
        int n = 77;
        System.out.println("Using bruteforce method, Position of rightmost Set bit = " + brute(n));
        System.out.println("Using Mask, Position of rightmost Set bit = " + mask(n));
    }

    //Using Masking
    static int mask(int n) {
        int counter = 1;
        int mask = 1;
        while (n > 0) {
            if ((n & mask) != 0)
                return counter;
            else {
                n = n >> 1;
                counter++;
            }
        }
        return counter;
    }


    //Using brute force method
    static int brute(int n) {
        int counter = 1;
        while (n > 0) {
            if (n % 2 == 1)
                return counter;
            else {
                n = n / 2;
                counter++;
            }
        }
        return counter;
    }

}
