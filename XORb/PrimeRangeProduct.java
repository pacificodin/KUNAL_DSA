public class PrimeRangeProduct {
    public static void main(String[] args) {
        primeProduct(2, 10);
    }

    static long primeProduct(long M, long N) {
        long ans = 1;
        int n = (int) (N);
        boolean[] prime = new boolean[n + 1];
        prime[1] = true;
        for (int i = 2; i * i <= n; i++) {
            for (int j = i * 2; j <= n; j += i) {
                if (!prime[j]) {
                    prime[j] = true;
                }
            }
        }
        int m = (int) (M);
        for (int k = m; k <= n; k++) {
            if (!prime[k]) {
                ans = ans * (long) k;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
