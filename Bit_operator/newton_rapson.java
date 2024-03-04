
public class newton_rapson {
    public static void main(String[] args) {
        System.out.println(Sqrt(40));
    }

    public static double Sqrt(double num) {
        double ans = num;
        double root;
        while (true) {
            root = 0.5 * (ans + (num / ans));
            if ((ans - root) < 0.001) { // we can use Math.abs(root-abs)<0.001
                break;
            }
            ans = root;
        }
        return ans;
    }

}
