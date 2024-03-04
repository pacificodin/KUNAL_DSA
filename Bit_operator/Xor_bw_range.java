
public class Xor_bw_range {
    public static void main(String[] args) {
        int range_ans = XOR(5) ^ XOR(2);
        System.out.println(range_ans);
        int ans = 0;
        for (int i = 3; i <= 6; i++) {
            ans = ans ^ i;
        }
        System.out.println(ans);
    }

    public static int XOR(int num) {
        if (num % 4 == 0) {
            return num;
        }
        if (num % 4 == 1) {
            return 1;
        }
        if (num % 4 == 2) {
            return num + 1;
        }
        return 0;
    }

}