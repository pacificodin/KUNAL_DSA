// import java.util.ArrayList;

public class RangePrime {
    public static void main(String[] args) {
        PrimeNo(10, 23);
    }

    public static void PrimeNo(int M, int N) {
        // ArrayList<Integer> ans=new ArrayList<Integer>();
        boolean[] prime = new boolean[N + 1];
        prime[1] = true;
        for (int i = 2; i * i <= N; i++) {
            for (int j = i * 2; j <= N; j += i) {
                if (!prime[j]) {
                    prime[j] = true;
                }
            }
        }
        for (int k = M; k <= N; k++) {
            if (!prime[k]) {
                // ans.add(k);
                System.out.print(k + " ");
            }
        }
    }
}
