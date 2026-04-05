package Arrays.SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

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

    static int[] slidingWindowMax(int[] arr, int k) {
        int[] res = new int[arr.length - k + 1];
        Deque<Integer> max = new ArrayDeque<>();
        max.offer(0);
        for (int i = 1; i < k; i++) {
            while (!max.isEmpty() && arr[max.peekLast()] < arr[i]) {
                max.removeLast();
            }
            max.offerLast(i);
        }
        for (int j = k - 1; j < arr.length; j++) {
            int start = j - k + 1;
            while (!max.isEmpty() && max.peekFirst() < start) {
                max.removeFirst();
            }
            while (!max.isEmpty() && arr[max.peekLast()] < arr[j]) {
                max.removeLast();
            }
            max.offerLast(j);
            res[start] = arr[max.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -1, -3, 5, 3, 6, 7};
        int n = 3;
        System.out.println(Arrays.toString(bruteForce(arr, n)));
        System.out.println(Arrays.toString(slidingWindowMax(arr, n)));
    }
}
