public class Find_a_topower_b {
    public static void main(String[] args) {
        int a = 3, b = 6;
        powerAtoB(a, b);
    }

    public static void powerAtoB(int base, int power) {
        int ans = 1;
        while (power > 0) {
            int bit = power & 1;
            power = power >> 1;
            if (bit == 1) {
                ans = ans * base;
            }
            base = base * base;

        }
        System.out.println(ans);
    }
}
