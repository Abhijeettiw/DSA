package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubSetString {
    static List<String> subSetString(String str) {
        return subSetString(str, 0, "");
    }

    static List<String> subSetString(String str, int index, String current) {
        List<String> result = new ArrayList<>();
        if (index == str.length()) {
            return result;
        }
        current = current + str.charAt(index);
        result.add(current);
        result.addAll(subSetString(str, index + 1, current));
        current = current.substring(0, current.length() - 1);
        result.addAll(subSetString(str, index + 1, current));
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = subSetString("abc");
        strings.forEach(System.out::println);
    }
}
