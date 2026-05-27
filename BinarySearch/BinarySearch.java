package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    static Integer binarySearch(Integer[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 1));
    }
}
