package Arrays.SlidingWindow;

import java.util.Arrays;

public class SlidingWindowMaximum {
    static int[] bruteForce(int[] arr, int k) {
        int[] res = new int[arr.length - k + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < res.length; i++) {
            max = arr[i];
            int count = 1;
            while (count < k) {
                if (max < arr[i + count]) {
                    max = arr[i + count];
                }
                count++;
            }
            res[i] = max;
            max = Integer.MIN_VALUE;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int n = 3;
        System.out.println(Arrays.toString(bruteForce(arr, n)));
    }
}
