package HashTable;

import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
//        int[] arr = {4, 1, 2, 5, 3, 7, 6, 9};
        int target = 9;
        int[] res = null;
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i],i);
        }
        for (int i = 0; i < arr.length; i++) {
            int dif = target - arr[i];
            if (hash.containsKey(dif)) {
                res = new int[]{hash.get(dif), i};
                break;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
