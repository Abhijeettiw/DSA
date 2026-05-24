package Arrays.Intervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}, {8, 13}};
//        Arrays.sort(intervals,
//                Comparator
//                        .comparingInt((int[] a) -> a[0])
//                        .thenComparingInt((int[] a) -> a[1])
//        );
        Arrays.sort(intervals, (a, b) -> {
                    if (a[0] == b[0]) {
                        return a[1] - b[1];
                    }
                    return a[0] - b[0];
                }
        );
        ArrayList<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if(result.getLast()[1]>=intervals[i][0]){
                result.getLast()[1] = Math.max(result.getLast()[1],intervals[i][1]);
            } else {
                result.add(intervals[i]);
            }
        }
        result.forEach(a-> System.out.println(Arrays.toString(a)));
    }
}
