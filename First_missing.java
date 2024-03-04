import java.util.Arrays;

public class First_missing {
    public static void main(String[] args) {
        int[] ans = { 1, 6, 3, 8, 2, 9 };
        System.out.println(firstmiss(ans));
    }

    public static int firstmiss(int[] nums) {
        int min = 0, max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                min = max;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("min" + min + "max" + max);
        if (min > 1) {
            return 1;
        }
        // boolean[] ans = new boolean[max];
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                nums[nums[k] - 1] = nums[k];
            }
        }
        System.out.println(Arrays.toString(nums));
        // for (int i = 0; i < ans.length; i++) {
        // if (ans[i] == false) {
        // return i + 1;
        // }
        // }
        return max + 1;
    }
}
