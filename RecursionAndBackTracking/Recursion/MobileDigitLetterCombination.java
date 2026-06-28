package RecursionAndBackTracking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class MobileDigitLetterCombination {
    static List<String> mobileDigitLetterCombination(String str, String[] valueArr) {
        return mobileDigitLetterCombination(str, 0, "", valueArr);
    }

    static List<String> mobileDigitLetterCombination(String str, int index, String currentStr, String[] valueArr) {
        List<String> result = new ArrayList<>();
        if (index == str.length()) {
            result.add(currentStr);
            return result;
        }
        String value = valueArr[str.charAt(index) - '0'];
        for (int i = 0; i < value.length(); i++) {
            result.addAll(mobileDigitLetterCombination(str, index + 1, currentStr + value.charAt(i), valueArr));
        }
        return result;
    }

    public static void main(String[] args) {
        String[] stringArr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> strings = mobileDigitLetterCombination("79", stringArr);
        strings.forEach(System.out::println);
        System.out.println("Size of combination - " + strings.size());
    }
}
