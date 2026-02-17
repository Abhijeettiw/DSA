import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //    Majority element is a element which exists more that half times in array.

    static int majorityElement(int[] arr) {
/*
    Moore's Algorithm
    - Find the candidate
*/
        int candidate = 0;
        int cnt = 0;
        for (int num : arr) {
            if (cnt == 0) {
                candidate = num;
            }

            if (num == candidate)
                cnt++;
            else
                cnt--;
        }
        // Step 2: Verify candidate (important!)
        cnt = 0;
        for (int num : arr) {
            if (num == candidate)
                cnt++;
        }

        if (cnt > arr.length / 2)
            return candidate;

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 2, 2};
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : arr) {
            count.computeIfPresent(i, (k, v) -> v + 1);
            count.computeIfAbsent(i, (v) -> 1);
        }
        Integer majorityElement = null;
        int l = arr.length / 2;
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if ((int) l < (int) e.getValue()) {
                majorityElement = e.getKey();
            }
        }
        System.out.println(majorityElement);
        System.out.println(majorityElement(arr));

    }
}
