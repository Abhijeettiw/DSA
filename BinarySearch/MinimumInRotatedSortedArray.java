package BinarySearch;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {9, 10, 11, 1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0, end = arr.length - 1;
        int result = arr[0];
        while (start <= end) {
            int mid = (end + start) / 2;
            if (arr[mid] < result) {
                end = mid - 1;
                result = arr[mid]; // For searching minimum
            } else {
                // result = arr[mid]; For searching minimum
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
}
