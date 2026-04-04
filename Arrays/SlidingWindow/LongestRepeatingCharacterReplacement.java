package Arrays.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    /*
        Theory
            length of substring - max frequency of character <= no of place to be replaced
    */

    static int characterReplacement(String str, int n) {
        int k = str.length();
        int[] count = new int[26];
        int start = 0, maxLength = 0, maxCount = 0;
        for (int end = 0; end < k; end++) {
            maxCount = Math.max(maxCount, ++count[str.charAt(end) - 'A']);
            while (end - start + 1 - maxCount > n) {
                count[str.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "ABBCCBB";
//        String str = "ABAB";
//        String str = "AABABBA";
//        int n = 2;
        int n = 1;
        System.out.println(characterReplacement(str, n));
    }
}
