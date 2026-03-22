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

    //    Using Stack & Map
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
        }
        return res;
    }

    //    Using Stack
    public static boolean checkValidity3(String input) {
        Stack<String> parenthesisStack = new Stack<>();
        if (input.length() % 2 == 0) {
            for (String s : input.split("")) {
                if (s.equals("{"))
                    parenthesisStack.push("}");
                else if (s.equals("["))
                    parenthesisStack.push("]");
                else if (s.equals("("))
                    parenthesisStack.push(")");
                else if (s.equals("}")) {
                    if (!parenthesisStack.pop().equals(s))
                        return false;
                } else if (s.equals("]")) {
                    if (!parenthesisStack.pop().equals(s))
                        return false;
                } else if (!parenthesisStack.pop().equals(s))
                    return false;
            }
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        String input = "({}{[}])";
        System.out.println(checkValidity1(input));
        System.out.println("-------");
        System.out.println(checkValidity2(input));
        System.out.println("-------");
        System.out.println(checkValidity3(input));
    }
}
