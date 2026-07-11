package RecursionAndBackTracking.BackTracking;

import java.util.*;

public class CombinationSumUniqueNumbers {
    static List<List<Integer>> combinationSumUniqueNumbers(int[] array, int target) {
        return combinationSumUniqueNumbers(array, target, 0, new ArrayList<>(), new HashSet<>());
//        return combinationSumUniqueNumbers(array, target, 0, new ArrayList<>());
    }

    static List<List<Integer>> combinationSumUniqueNumbers(int[] array, int target, int index, List<Integer> currentList, Set<Integer> usedIndex) {
        List<List<Integer>> result = new ArrayList<>();
        if (0 == target) {
            result.add(new ArrayList<>(currentList));
            return result;
        }
        for (int i = index; i < array.length; i++) {
            if (!usedIndex.contains(i) && target >= array[i]) {
                usedIndex.add(i);
                currentList.add(array[i]);
                result.addAll(combinationSumUniqueNumbers(array, target - array[i], i, currentList, usedIndex));
                currentList.removeLast();
                usedIndex.remove(i);
            }
        }
        return result;
    }

    static List<List<Integer>> combinationSumUniqueNumbers(int[] array, int target, int index, List<Integer> currentList) {
        List<List<Integer>> result = new ArrayList<>();
        if (0 == target) {
            Collections.sort(currentList);
            result.add(new ArrayList<>(currentList));
            return result;
        }
        if(index==array.length){
            return result;
        }
        currentList.add(array[index]);
        result.addAll(combinationSumUniqueNumbers(array, target - array[index], index + 1, currentList));
        currentList.removeLast();
        result.addAll(combinationSumUniqueNumbers(array, target, index + 1, currentList));

        return result;
    }

    public static void main(String[] args) {
        int[] array = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> lists = combinationSumUniqueNumbers(array, 8);
        System.out.println(lists);
    }
}
