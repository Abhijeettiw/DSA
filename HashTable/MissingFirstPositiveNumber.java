package HashTable;

public class MissingFirstPositiveNumber {
    /*
        Theory
            - Place element in array which is less than size of array & greater than 0 to element-1 position in array.
            - Iterate modified array if element-1 not equal to its positon return positon+1;
    */
    public static void main(String[] args) {
        int missingNo = 1;
        int[] arr = {7,8,9,11,12};
//        int[] arr = {3, 4, -1, 1};
//        int[] arr = {1,2,0};
//        int[] arr = {2,4,1,8,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr.length && arr[i] > 0) {
                if (i != arr[i] - 1) {
                    int temp = arr[i];
                    int temp2 = arr[i] - 1;
                    arr[i] = arr[temp2];
                    arr[temp2] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 != i) {
                missingNo = i + 1;
                break;
            }
        }
        System.out.println(missingNo);
    }
}
