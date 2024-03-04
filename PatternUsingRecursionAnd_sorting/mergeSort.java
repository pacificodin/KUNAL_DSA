// package PatternUsingRecursionAnd_sorting;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, -5, -1, -7 };
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    public static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merge[k++] = left[i++];
            } else {
                merge[k++] = right[j++];
            }
        }
        while (i < left.length) {
            merge[k++] = left[i++];
        }
        while (j < right.length) {
            merge[k++] = right[j++];
        }
        return merge;
    }
}
