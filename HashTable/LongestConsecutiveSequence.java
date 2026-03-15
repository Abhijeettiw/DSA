package HashTable;

import java.util.Hashtable;

public class LongestConsecutiveSequence {
    static Integer solution1(int[] arr) {
//      Time Complexity - O(n*m)
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hash.containsKey(arr[i])) {
                hash.put(arr[i], i);
            }
        }
        int cnt = 0;
        for (int i : arr) {
            int newCnt = 1;
            int nxtNum = i + 1;
            while (hash.containsKey(nxtNum) && !hash.containsKey(i - 1)) {
                nxtNum++;
                newCnt++;
            }
            if (newCnt > cnt) {
                cnt = newCnt;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 5, 4, 3, 10, 8};

        System.out.println(solution1(arr));
    }
}
