package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationOfNumbers {
    static void permutation(int[] nums, int idx, ArrayList<Integer> cur, List<ArrayList<Integer>> res, Map<Integer, Boolean> used) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(cur));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!used.containsKey(nums[i])) {
                    cur.add(nums[i]);
                    used.put(nums[i], true);
                    permutation(nums, idx + 1, cur, res, used);
                    cur.removeLast();
                    used.remove(nums[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<ArrayList<Integer>> result = new ArrayList<>();
        permutation(nums, 0, new ArrayList<>(), result, new HashMap<>());
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
