// import java.util.Arrays;

class Pivot {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3 };
        System.out.println(peak(arr));
    }

    public static int peak(int[] arr) {
        if (arr[0] < arr[arr.length - 1]) {
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;
        {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    return arr[mid + 1];
                } else if (arr[mid - 1] > arr[mid]) {
                    return arr[mid];
                } else if (arr[mid] < arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return end;
    }
}