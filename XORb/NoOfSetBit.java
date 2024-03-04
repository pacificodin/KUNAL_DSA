public class NoOfSetBit {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setbit(num));
    }

    public static int setbit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            // s = s & (s - 1); or use
            n = n - (n & -n);
        }
        return count;
    }
}
