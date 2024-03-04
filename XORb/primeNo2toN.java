public class primeNo2toN {
    public static void main(String[] args) {
        int n = 41;
        boolean[] prime = new boolean[n + 1];
        // initialy all prime array value is false
        PrintPrime(n, prime);
    }

    // the time complexity for the function is O(nlog(log(n)))
    static void PrintPrime(int n, boolean[] prime) {
        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == false) {
                for (int j = i * 2; j <= n; j = j + i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == false) {
                System.out.print(i + " ");
            }
        }
    }
}
