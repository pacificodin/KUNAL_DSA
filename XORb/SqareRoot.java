
public class SqareRoot {
    public static void main(String[] args) {
        System.out.printf("%.3f", Sqareroot(21, 3));
    }

    public static double Sqareroot(int num, int per) {
        int start = 0;
        int end = num;
        double root = 0.0;
        // this part for integer value
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return mid;
            }
            if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // if this line is not run inside the code then will run mostly
        root = end;
        double incr = 0.1;
        for (int i = 0; i < per; i++) {
            while (root * root < num) {
                root += incr;
                System.out.print(root + " ");
            }
            root -= incr;

            incr = incr / 10;
        }
        return root;
    }

}
