package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FlatteningOfArray {
    public static Object[] flatArray(Object[] objectArr, ArrayList<Object> result) {
        for (Object obj : objectArr) {
            if (obj instanceof Object[] innerObj) {
                flatArray(innerObj, result);
            }
            else result.add(obj);
        }
        return List.of(result).toArray();
    }

    public static void main(String[] args) {
        Object[] objects = {1, 2, new Object[]{3, 4, 5}, 6, 7, new Object[]{8, 9}};
        ArrayList<Object> result = new ArrayList<>();
        Object[] flattenedArr = flatArray(objects, result);
        System.out.println();
    }
}
