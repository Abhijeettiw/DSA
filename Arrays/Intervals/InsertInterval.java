package Arrays.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        List<int[]> res = new ArrayList<>();
        int i = 0;
        while (i < arr.length && arr[i][1] < newInterval[0]) {
            res.add(arr[i]);
            i++;
        }
        while (i < arr.length && arr[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(arr[i][0], newInterval[0]);
            newInterval[1] = Math.max(arr[i][1], newInterval[1]);
            i++;
        }
        res.add(newInterval);
        while (i < arr.length) {
            res.add(arr[i]);
            i++;
        }

        for (int[] ints : res) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
