package RecursionAndBackTracking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ArrayElementsSumEqualsTarget {
    static List<List<Integer>> arrayElementsSumEqualsTarget(int[] array, int target) {
        return arrayElementsSumEqualsTarget(array, target, 0, new ArrayList<>());
    }

    static List<List<Integer>> arrayElementsSumEqualsTarget(int[] array, int target, int index, List<Integer> currentList) {
        List<List<Integer>> result = new ArrayList<>();
        if (index == array.length) {
            return result;
        }
        if (0 == target) {
            result.add(new ArrayList<>(currentList));
            return result;
        }
        currentList.add(array[index]);
        result.addAll(arrayElementsSumEqualsTarget(array, target - array[index], index + 1, currentList));
        currentList.removeLast();
        result.addAll(arrayElementsSumEqualsTarget(array, target, index + 1, currentList));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(arrayElementsSumEqualsTarget(new int[]{2, 8, 3, 5, 6, 7}, 19));
    }
}
