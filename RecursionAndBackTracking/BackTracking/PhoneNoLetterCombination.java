package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;

public class PhoneNoLetterCombination {
    static void phoneNoLetterCombination(String str, int idx, String[] mapping, ArrayList<String> res, String current) {
        if (idx == str.length()) {
            res.add(current);
        } else {
            String string = mapping[str.charAt(idx) - '0'];
            for (int i = 0; i < string.length(); i++) {
                phoneNoLetterCombination(str, idx + 1, mapping, res, current + string.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "wxyz"};
        ArrayList<String> result = new ArrayList<>();
        phoneNoLetterCombination("23", 0, mapping, result, "");
        int cnt = 0;
        for (String il : result) {
            System.out.println(il);
            cnt++;
        }
        System.out.println(cnt);
    }
}
