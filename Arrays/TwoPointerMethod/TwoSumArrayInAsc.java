package Arrays.TwoPointerMethod;

import java.util.Arrays;

public class TwoSumArrayInAsc {
    static int[] twoSumTwoPointer(int[] arr, int target) {
        int s = 0, e = arr.length - 1;
        int[] res = new int[2];
        while (s < e) {
            int val = arr[s] + arr[e];
            if (val == target) {
                res[0] = arr[s];
                res[1] = arr[e];
                return res;
            } else if (val < target) {
                s++;
            } else if (val > target) {
                e--;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumTwoPointer(arr, target)));
    }
}
