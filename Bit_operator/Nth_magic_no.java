
class Nth_magic_no {
    public static void main(String[] args) {
        int n = 16;
        NO_of_bits(n);
    }

    public static void NO_of_bits(int n) {
        // this is the simple mathod with time complexity is logn
        int a = 125;
        int b = 2;
        int ans = (int) (Math.log(a) / Math.log(b)) + 1;
        System.out.println(ans);

        // this is the first way
        // int ans = 0;
        // while (n > 0) {
        // ans++;
        // n = n >> 1;
        // }
        // System.out.println(ans);
    }

    // static void Nthmagic_no(int n,int base){
    // int ans = 0;
    // while (n > 0) {
    // int p = n & 1;
    // n = n >> 1;
    // ans = ans + p * base;
    // base = base * base;
    // }
    // System.out.println(ans);
    // }

}