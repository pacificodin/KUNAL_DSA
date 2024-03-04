package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 2, 1 };
        // ArrayList<ArrayList<Integer>> ans = remoREPEATsub(arr);
        // System.out.println(ans);
        // String str = "abcd";
        // ArrayList<String> ans = permutation2("", str);
        // System.out.println(ans);
        // Dicepair("", 4);
        System.out.println(Keypad("", "69"));
    }

    // GOOGLE phone keypad pattern
    static public ArrayList<String> Keypad(String p, String str) {
        if (str.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = (int) (str.charAt(0) - '0');
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3 + 1; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(Keypad(p + ch, str.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = (digit - 2) * 3 + 1; i < (digit - 1) * 3 + 1; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(Keypad(p + ch, str.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = (digit - 2) * 3 + 1; i < (digit - 1) * 3 + 2; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(Keypad(p + ch, str.substring(1)));
            }
        } else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(Keypad(p + ch, str.substring(1)));
            }
        }
        return ans;
    }

    // AMAZONE TAG dice all possiblity
    public static void Dicepair(String str, int num) {
        if (num == 0) {
            System.out.println(str + " ");
            return;
        }
        for (int i = 1; i <= num; i++) {
            Dicepair(str + i, num - i);
        }
    }

    // all permutation of number sunsets
    // public static ArrayList<ArrayList<Integer>> subsetBYiteration(int[] arr) {
    // ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
    // outer.add(new ArrayList<>());
    // for (int num : arr) {
    // int n = outer.size();
    // for (int i = 0; i < n; i++) {
    // ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
    // internal.add(num);
    // outer.add(internal);
    // }
    // }
    // return outer;
    // }

    // now its for the repetative element remove subset
    public static ArrayList<ArrayList<Integer>> remoREPEATsub(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        Arrays.sort(arr);
        int start = 0, end = 0;
        for (int j = 0; j < arr.length; j++) {
            start = 0;
            if (j > 0 && arr[j - 1] == arr[j]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
    }

    // NOE THE ACTUAL PERMUTATION IS GOING ON
    public static void permutation1(String p, String str) {
        if (str.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation1(first + ch + second, str.substring(1));
        }
    }

    // this will return a array in permutaiton
    public static ArrayList<String> permutation2(String p, String str) {
        if (str.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans1 = new ArrayList<>();
        char ch = str.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans1.addAll(permutation2(first + ch + second, str.substring(1)));
        }
        return ans1;
    }

}
