import java.util.HashMap;
import java.util.Map;

public class RomanNo {
    public static int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>(){{
            put("I",1);
            put("V",5);
            put("X",10);
            put("L",50);
            put("C",100);
            put("D",500);
            put("M",1000);
        }};
        Integer result = 0;
        Integer preVal = 0;
        for(int i = s.length()-1;i>=0;i--){
            Integer val = map.get(s.charAt(i)+"");
            if(preVal!=0){
                if(val>=preVal){
                    result += val;
                } else {
                    result -= val;
                }
            } else {
                result += val;
            }
            preVal = val;
        }
        return result;
    }

    public static void main(String[] args) {
        int mcmxciv = romanToInt("MCMXCIV");
        System.out.println(mcmxciv);
    }
}
