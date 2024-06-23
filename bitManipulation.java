public class bitManipulation {
    public static void main(String[] args) {
        int n = 14;
        int k = 2;
        System.out.println("ith bit=" + func(n, k));
        System.out.println("After setting kth bit=" + setbit(n, k));
        System.out.println("After resetting kth bit=" + resetbit(n, k));
    }

    static int func(int n, int k) {
        // find the ith bit of a number
        if ((n & (1 << (k - 1))) == 0)
            return 0;
        return 1;
    }

    static int setbit(int n, int k) {
        //If kth bit is 0 then change it to 1
        int result = (n | (1 << (k - 1)));
        //To verify  kth bit has been changed to 1
        System.out.println("ith bit=" + func(result, k));
        return result;
    }

    static int resetbit(int n, int k) {
        //If kth bit is 1 then change it to 0
        int result = n & (~(1 << (k - 1)));
        System.out.println("kth bit=" + func(result, k));
        return result;
    }
}