import java.util.ArrayList;
import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
        // String str = "abc";
        // ArrayList<String> ans = substringAscii(str, "");
        // one string will be empty
        int[] arr = { 2, 1, 2 };

        System.out.println(substringRepeat(arr));
    }
    // this is the simple form
    // public static void substring(String str, String p) {
    // if (str.isEmpty()) {
    // System.out.print(p + " ");
    // return;
    // }
    // char ch = str.charAt(0);
    // substring(str.substring(1), p + ch);
    // substring(str.substring(1), p);

    // }

    // Now we will make by using the return type of arraylist
    // public static ArrayList<String> substringList(String str, String p) {
    // if (str.isEmpty()) {
    // ArrayList<String> ans = new ArrayList<>();
    // if (p.isEmpty() == false) {
    // ans.add(p);
    // }
    // return ans;
    // }
    // char ch = str.charAt(0);
    // ArrayList<String> left = substringList(str.substring(1), p + ch);
    // ArrayList<String> right = substringList(str.substring(1), p);
    // left.addAll(right); // or can return right by using the right.addAll(left);
    // return left;
    // }

    // now we will make for the generating the ascii value also
    // public static ArrayList<String> substringAscii(String str, String p) {
    // if (str.isEmpty()) {
    // ArrayList<String> ans = new ArrayList<>();
    // if (p.isEmpty() == false) {
    // ans.add(p);
    // }
    // return ans;
    // }
    // char ch = str.charAt(0);
    // ArrayList<String> left = substringAscii(str.substring(1), p);
    // ArrayList<String> Ascii = substringAscii(str.substring(1), "" + (ch + 0));
    // // if we use (ch + 0) now it convert into the number value
    // ArrayList<String> right = substringAscii(str.substring(1), p + ch);
    // left.addAll(Ascii);
    // left.addAll(right);
    // return left;
    // }

    // now we will look for the repeated element then make the subsets
    public static ArrayList<ArrayList<Integer>> substringRepeat(int[] arr) {

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        Arrays.sort(arr);
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            int n = outer.size();
            end = outer.size() - 1;
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
