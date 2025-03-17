import java.util.HashMap;
import java.util.Map;

public class ValidParenthesis {
    static Boolean checkValidity(String input) {
        Map<String,String> parenthesis = new HashMap<>(){{
            put("{","}");
            put("[","]");
            put("(",")");
        }};
        int count = 0;
        String required = "";
        for (String s: input.split("")){
            if(required.isEmpty()) {
                String add = parenthesis.get(s);
                if(add==null) return false;
                required = add;
                count++;
            }else {
                String needed = required.charAt(count-1)+"";
                if(s.equalsIgnoreCase(needed)){
                    required = required.substring(0,required.length()-1);
                    count--;
                }else {
                    required += parenthesis.get(s);
                    count++;
                }
            }
        }
        if (count!=0){
            return  false;
        } else return true;

    }

    public static void main(String[] args) {
        String input = "()";
        System.out.println(checkValidity(input));
    }
}
