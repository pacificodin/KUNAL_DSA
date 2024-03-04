import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = { -9, -5, -3, 1, 4, 7, 9, 10, 13 };
        Sort(arr);
        // System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if ((-arr[start]) > arr[end]) {
                arr1[i] = (-arr[start]) * (-arr[start]);
                start++;
            } else {
                arr1[i] = arr[end] * arr[end];
                end--;
            }

        }
        System.out.println(Arrays.toString(arr1));
    }
}
