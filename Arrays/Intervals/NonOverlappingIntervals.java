package Arrays.Intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
//        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        int cnt = 0;
        int[] initial = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (initial[1]>intervals[i][0]) {
                cnt++;
            } else {
                initial = intervals[i];
            }
        }
        System.out.println(cnt);
    }
}
