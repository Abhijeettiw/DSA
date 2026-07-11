package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {
    static List<List<String>> palindromePartioning(String s) {
        List<List<String>> result = new ArrayList<>();
        palindromePartioning(s, 0, new ArrayList<>(), result);
        return result;    }

    static void palindromePartioning(String s, int idx, List<String> currentList, List<List<String>> result) {
        if (idx == s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                currentList.add(s.substring(idx, i + 1));
                palindromePartioning(s, i + 1, currentList, result);
                currentList.removeLast();
            }
        }
    }

    static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<String>> partioning = palindromePartioning("aab");
        System.out.println(partioning);
    }
}
