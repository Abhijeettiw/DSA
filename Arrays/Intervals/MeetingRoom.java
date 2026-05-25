package Arrays.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
    public static void main(String[] args) {
        int[][] intervals = {{7, 10}, {2, 4}};
//        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt((int[] a) -> a[1]));
        int[] first = intervals[0];
        boolean attendAll = true;
        for (int i = 1; i < intervals.length; i++) {
            if (first[1] >= intervals[i][0]) {
                attendAll = false;
                break;
            } else {
                first = intervals[i];
            }
        }
        System.out.println(attendAll);
    }
}
