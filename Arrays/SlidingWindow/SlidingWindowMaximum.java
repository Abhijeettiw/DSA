package Arrays.SlidingWindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    static int[] bruteForce(int[] arr, int k) {
        int[] res = new int[arr.length - k + 1];
        Deque<Integer> max = new LinkedList<>();
        for (int i = 0; i < res.length; i++) {
            max.addFirst(arr[i]);
            int count = 1;
            while (count < k && !max.isEmpty()) {
                if (max.getFirst() < arr[i + count]) {
                    max.addFirst(arr[i + count]);
                    max.removeLast();
                }
                count++;
            }
            res[i] = max.removeFirst();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int n = 3;
        System.out.println(Arrays.toString(bruteForce(arr, n)));
    }
}
