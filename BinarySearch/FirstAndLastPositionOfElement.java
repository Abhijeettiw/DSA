package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    static Integer binarySearchFirst(Integer[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int idx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                idx = mid;
                end = mid - 1;
            } else if (target > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return idx;
    }

    static Integer binarySearchLast(Integer[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int idx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                idx = mid;
                start = mid + 1;
            } else if (target > mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 7, 7, 8, 8, 10};
        Integer i2 = binarySearchLast(arr, 6);
        Integer i1 = binarySearchFirst(arr, 6);
        int[] res = {i1, i2};
        System.out.println(Arrays.toString(res));
    }
}
