package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NonDecreasingSubSequencing {
    static List<List<Integer>> subSequence(int[] array) {
        return subSequence(array, 0, new ArrayList<>());
    }

    static List<List<Integer>> subSequence(int[] array, int idx, List<Integer> currentList) {
        List<List<Integer>> result = new ArrayList<>();
        if (idx == array.length) {
            if (currentList.size() > 1) {
                result.add(new ArrayList<>(currentList));
            }
            return result;
        }
        if (currentList.isEmpty() || currentList.getLast() <= array[idx]) {
            currentList.add(array[idx]);
        }
        result.addAll(subSequence(array, idx + 1, currentList));
        if (!currentList.isEmpty()) {
            currentList.removeLast();
        }
        result.addAll(subSequence(array, idx + 1, currentList));
        return result;
    }


    public static void main(String[] args) {
        System.out.println(subSequence(new int[]{3,4,2,1,6}));
    }
}
