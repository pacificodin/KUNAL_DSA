import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7 };
        System.out.println(Arrays.toString(selectionSort(arr, arr.length, 0, 0)));
    }

    // 4 * * * * * by following these pattern we solving the bubble sort and
    // 3 * * * * the selection sort first check for 4 element
    // 2 * * * then decrease by one every time untill n==1;
    // 1 * *
    // 0 *
    public static int[] selectionSort(int[] arr, int row, int col, int index) {
        if (row == 0) {
            return arr;
        }
        if (row > col) {
            if (arr[index] < arr[col]) {
                return selectionSort(arr, row, col + 1, col);
            } else {
                return selectionSort(arr, row, col + 1, index);
            }
        } else {
            int temp = arr[row - 1];
            arr[row - 1] = arr[index];
            arr[index] = temp;
            return selectionSort(arr, row - 1, 0, 0);
        }
    }

    public static int[] bubbleSort(int[] arr, int row, int col) {
        if (row == 0) {
            return arr;
        }
        if (row > col + 1) {
            if (arr[col + 1] < arr[col]) {
                // System.out.println("p");
                int temp = arr[col + 1];
                arr[col + 1] = arr[col];
                arr[col] = temp;
            }
            return bubbleSort(arr, row, col + 1);
        } else {

            return bubbleSort(arr, row - 1, 0);
        }
    }

    // public static void reversetriangle(int row, int col) {
    // if (row == 0) {
    // return;
    // }
    // if (row > col) {
    // System.out.print("* ");
    // reversetriangle(row, col + 1);
    // } else {
    // System.out.println();
    // reversetriangle(row - 1, 0);
    // }
    // }

    // public static void simpletriangle(int row, int col) {
    // if (row == 0) {
    // return;
    // }
    // if (row > col) {
    // simpletriangle(row, col + 1);
    // System.out.print("* ");

    // } else {

    // simpletriangle(row - 1, 0);
    // System.out.println();
    // }
    // }
}
