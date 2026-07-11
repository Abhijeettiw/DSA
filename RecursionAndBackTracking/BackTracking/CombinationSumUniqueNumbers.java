package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumUniqueNumbers {
    static List<List<Integer>> combinationSumUniqueNumbers(int[] array, int target) {
        return combinationSumUniqueNumbers(array, target, 0, new ArrayList<>(), new HashSet<>());
    }

    static List<List<Integer>> combinationSumUniqueNumbers(int[] array, int target, int index, List<Integer> currentList, Set<Integer> usedIndex) {
        List<List<Integer>> result = new ArrayList<>();
        if (0 == target) {
            result.add(new ArrayList<>(currentList));
            return result;
        }
        for (int i = index; i < array.length; i++) {
            if (!usedIndex.contains(i) && target >= array[i]) {
                usedIndex.add(array[i]);
                currentList.add(array[i]);
                result.addAll(combinationSumUniqueNumbers(array, target - array[i], i, currentList, usedIndex));
                currentList.removeLast();
                usedIndex.remove(array[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {10, 1, 2, 7, 6,  5};
        List<List<Integer>> lists = combinationSumUniqueNumbers(array, 8);
        System.out.println(lists);
    }
}
