package HashTable;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnaGram {
    static Boolean solution1(String s1, String s2) {
//        Time Complexity - O(n)
        boolean valid = true;
        Map<String, Long> s1Free = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> s2Free = Arrays.stream(s2.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        if (s1Free.size() != s2Free.size()) return false;
        for (String s : s1Free.keySet()) {
            if ((long) s1Free.get(s) != (long) s2Free.get(s)) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    static Boolean solution2(String s1, String s2) {
//        Time Complexity - O(long n)
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        return Arrays.equals(s1Arr, s2Arr);
    }

    public static void main(String[] args) {
        String s1 = "anagra";
        String s2 = "nagrama";

        System.out.println(solution1(s1, s2));
        System.out.println(solution2(s1, s2));
    }
}
