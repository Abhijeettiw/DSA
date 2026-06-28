package RecursionAndBackTracking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CharacterCombination {
    static List<String> combination(String str) {
        return combination("", str);
    }

    static List<String> combination(String processed, String unProcessed) {
        List<String> result = new ArrayList<>();
        if (unProcessed.isEmpty()) {
            result.add(processed);
            return result;
        }
        char c = unProcessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String last = processed.substring(i);
            result.addAll(combination(first + c + last, unProcessed.substring(1)));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> abc = combination("abc");
        abc.forEach(System.out::println);
    }
}
