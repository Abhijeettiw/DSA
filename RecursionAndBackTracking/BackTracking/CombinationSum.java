package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    static void combinationSum(int[] nums, int idx, int target, List<ArrayList<Integer>> result, List<Integer> current) {
        if (idx == nums.length) {
            if (0 == target) {
                result.add(new ArrayList<>(current));
            }
        } else {
            int times = target / nums[idx];
            for (int i = 0; i <= times; i++) {
                int newTarget = target - i * nums[idx];
                for (int j = 0; j < i; j++) {
                    current.add(nums[idx]);
                }
                combinationSum(nums, idx + 1, newTarget, result, current);
                for (int j = 0; j < i; j++) {
                    current.removeLast();
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7};
        List<ArrayList<Integer>> result = new ArrayList<>();
        combinationSum(nums, 0, 7, result, new ArrayList<>());
        for (List<Integer> il : result) {
            StringBuilder r = new StringBuilder();
            for (Integer i : il) {
                r.append(i).append(" ");
            }
            System.out.println(r);
        }
    }
}
