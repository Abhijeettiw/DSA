package BinarySearch;

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

    static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {30, 11, 23, 4, 20};
//        int[] arr = {3, 6, 7, 11};
        int completedHrs = 5;
        int ans = 0;
        int start = 1, end = maxElement(arr);
        while (start <= end) {
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
