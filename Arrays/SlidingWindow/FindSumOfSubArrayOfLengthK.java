package Arrays.SlidingWindow;

import java.util.Arrays;

public class FindSumOfSubArrayOfLengthK {
    static int[] bruteForce(int[] arr, int k) {
        int[] res = new int[arr.length - k + 1];
        for (int i = 0; i < res.length; i++) {
            int count = k - 1;
            res[i] = arr[i];
            while (count > 0) {
                res[i] = res[i] + arr[i + count];
                count--;
            }
        }
        return res;
    }

    static int[] slidingWindow(int[] arr, int k) {
        int[] res = new int[arr.length - k + 1];
        int count = k - 1;
        res[0] = arr[0];
        while (count > 0) {
            res[0] = res[0] + arr[count];
            count--;
        }
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i - 1] - arr[i - 1] + arr[i + k - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 7, 9};
        int k = 3;
        System.out.println(Arrays.toString(bruteForce(arr, k)));
        System.out.println(Arrays.toString(slidingWindow(arr, k)));
    }
}
