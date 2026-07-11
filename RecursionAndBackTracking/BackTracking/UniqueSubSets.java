package RecursionAndBackTracking.BackTracking;

import java.util.*;

public class UniqueSubSets {
    static List<List<Integer>> uniqueSubSets(int[] array) {
        Arrays.sort(array);
        return new ArrayList<>(uniqueSubSets(array, 0, new ArrayList<>()));
    }

    static Set<List<Integer>> uniqueSubSets(int[] array, int index, List<Integer> currentList) {
        Set<List<Integer>> result = new HashSet<>();
        if (index == array.length) {
            result.add(new ArrayList<>(currentList));
            return result;
        }
        currentList.add(array[index]);
        result.addAll(uniqueSubSets(array, index + 1, currentList));
        currentList.removeLast();
        result.addAll(uniqueSubSets(array, index + 1, currentList));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(uniqueSubSets(new int[]{1, 2, 2}));
    }
}
