package HashTable;

import java.util.Hashtable;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,0,6,9};
        Hashtable<Integer,Integer> count= new Hashtable<>();
        boolean duplicate = false;
        for (int i : arr){
            if(count.containsKey(i)){
                duplicate = true;
                break;
            } else {
                count.put(i,1);
            }
        }
        System.out.println(duplicate);
    }
}
