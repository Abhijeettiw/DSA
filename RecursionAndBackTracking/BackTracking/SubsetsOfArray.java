package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {
    static void subsetRecursion(int[] arr, int idx, List<Integer> cur, List<List<Integer>> res) {
        if (idx == arr.length) {
            res.add(new ArrayList<>(cur));
        } else {
            cur.add(arr[idx]);
            subsetRecursion(arr, idx + 1, cur, res);
            cur.removeLast();
            subsetRecursion(arr, idx + 1, cur, res);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        subsetRecursion(arr, 0, new ArrayList<>(), result);
        int cnt = 0;
        for (List<Integer> il : result) {
            StringBuilder r = new StringBuilder();
            for (Integer i : il) {
                r.append(i).append(" ");
            }
            System.out.println(r);
            cnt++;
        }
        System.out.println(cnt);
    }
}
