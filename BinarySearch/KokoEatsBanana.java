package BinarySearch;

import java.util.Arrays;

public class KokoEatsBanana {
    static int computeHrs(int[] arr, int speed) {
        int hr = 0;
        for (int b : arr) {
            if (b > speed) {
                hr += b / speed;
            }
            hr++;
        }
        return hr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int completedHrs = 5;
        Arrays.sort(arr);
        int ans = 0;
        int start = 1, end = arr[arr.length - 1];
        while (start < end) {
            int mid = (end + start) / 2;
            int sp = computeHrs(arr, mid);
            if (completedHrs == sp) {
                ans = mid;
                start = mid + 1;
            } else if (completedHrs < sp) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
