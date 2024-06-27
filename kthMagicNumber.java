public class kthMagicNumber {
    public static void main(String[] args) {
        int n = 2;
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans = ans + last * base;
            base = base * 5;
        }
        System.out.println(ans);

        //Power a^b program with time complexity log(N)
        int num = 3;
        int exp = 6;
        System.out.println(num + "^" + exp + " = " + powerab(num, exp));
    }


    static int powerab(int base, int power) {
        System.out.println("Binary number of power = " + Integer.toBinaryString(power));
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1)
                ans = ans * base;

            base = base * base;
            power = power >> 1;
        }
        return ans;
    }

}
