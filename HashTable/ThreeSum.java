package HashTable;

import java.util.*;

public class ThreeSum {
    static Set<int[]> solution1(int[] arr, int target) {
        Map<String, int[]> result = new HashMap<>();
        Map<Integer, Integer> freMap = new HashMap<>();
        for (int i : arr) {
            if (freMap.containsKey(i)) {
                freMap.put(i, freMap.get(i) + 1);
            } else {
                freMap.put(i, 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    int req = target - (arr[i] + arr[j]);
                    if (freMap.containsKey(req) && freMap.get(req) > 0 && freMap.get(arr[i]) > 0 && freMap.get(arr[j]) > 0 && req >= 0) {
                        int[] a = new int[]{arr[i], arr[j], req};
                        freMap.put(req, freMap.get(req) - 1);
                        freMap.put(arr[i], freMap.get(arr[i]) - 1);
                        freMap.put(arr[j], freMap.get(arr[i]) - 1);
                        Arrays.sort(a);
                        result.put(Arrays.toString(a), a);
                    }
                }
            }
        }
        return new HashSet<>(result.values());
    }

    public static void main(String[] args) {
//        int[] arr = {0, 1, 1};
        int[] arr = {-1, 0, 1, 2, -1, 4};
        int target = 0;

        for (int[] a : solution1(arr, target)) {
            System.out.println(Arrays.toString(a));
        }
    }
}
