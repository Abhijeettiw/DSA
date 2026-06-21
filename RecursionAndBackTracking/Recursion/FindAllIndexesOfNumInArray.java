package RecursionAndBackTracking.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllIndexesOfNumInArray {
    static ArrayList<Integer> findAllIndexesOfNumInArray(int[] arr, int target) {
//        return findAllIndexesOfNumInArray(arr, target, 0, new ArrayList<>());
        return findAllIndexesOfNumInArray(arr, target, 0);
    }

    static ArrayList<Integer> findAllIndexesOfNumInArray(int[] arr, int target, int idx, ArrayList<Integer> result) {
        if (idx == arr.length) {
            return result;
        }
        if (arr[idx] == target) {
            result.add(idx);
        }
        return findAllIndexesOfNumInArray(arr, target, ++idx, result);
    }

    static ArrayList<Integer> findAllIndexesOfNumInArray(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        if (arr[idx] == target) {
            result.add(idx);
        }
        result.addAll(findAllIndexesOfNumInArray(arr, target, ++idx));
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6, 7, 5, 4, 3};
        int target = 3;
        ArrayList<Integer> indexes = findAllIndexesOfNumInArray(arr, target);
        System.out.println(Arrays.toString(indexes.toArray()));
    }
}
