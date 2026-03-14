package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        Map<String, ArrayList<String>> res = new HashMap<>();
        for (String i : arr) {
            char[] charArray = i.toCharArray();
            Arrays.sort(charArray);
            String string = Arrays.toString(charArray);
            if(res.containsKey(string)){
                ArrayList<String> strings = res.get(string);
                strings.add(i);
                res.put(string,strings);
            } else {
                res.put(string,new ArrayList<>(){{add(i);}});
            }
        }
        res.values().forEach(e-> System.out.println(Arrays.toString(e.toArray())));
    }
}
