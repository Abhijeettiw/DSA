package RecursionAndBackTracking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceThrowSumEqualsTarget {
    static List<String> diceThrowSumEqualsTarget(int target) {
        return diceThrowSumEqualsTarget("", target);
    }

    static List<String> diceThrowSumEqualsTarget(String processed, int target) {
        List<String> result = new ArrayList<>();
        if (0 == target) {
            result.add(processed);
            return result;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            result.addAll(diceThrowSumEqualsTarget(processed + i, target - i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> lists = diceThrowSumEqualsTarget(4);
        System.out.println(lists);
    }
}
