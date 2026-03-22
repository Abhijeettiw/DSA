package Stacks;

import java.util.HashMap;
import java.util.Map;

public class ValidParenthesis {

    //    Using String
    static Boolean checkValidity1(String input) {
        Map<String, String> parenthesis = new HashMap<>() {{
            put("{", "}");
            put("[", "]");
            put("(", ")");
        }};
        int count = 0;
        String required = "";
        for (String s : input.split("")) {
            if (required.isEmpty()) {
                String add = parenthesis.get(s);
                if (add == null) return false;
                required = add;
                count++;
            } else {
                String needed = required.charAt(count - 1) + "";
                if (s.equalsIgnoreCase(needed)) {
                    required = required.substring(0, required.length() - 1);
                    count--;
                } else {
                    required += parenthesis.get(s);
                    count++;
                }
            }
        }
        if (count != 0) {
            return false;
        } else return true;
    }

    //    Using Stack
    public static boolean checkValidity2(String input) {
        Map<String, String> parenthesisMap = new HashMap<>() {{
            put("{", "}");
            put("[", "]");
            put("(", ")");
        }};
        boolean res = true;
        Stack<String> parenthesisStack = new Stack<>();
        for (String s : input.split("")) {
            if (parenthesisMap.containsKey(s)) {
                parenthesisStack.push(parenthesisMap.get(s));
            } else {
                if (!parenthesisStack.pop().equals(s)) {
                    return false;
                }
            }
            ;
        }
        return res;
    }

    public static void main(String[] args) {
        String input = "({}[])";
        System.out.println(checkValidity1(input));
        System.out.println("-------");
        System.out.println(checkValidity2(input));
    }
}
