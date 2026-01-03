import java.util.Arrays;

public class RemovingDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,3,4,4,4,4,4,5};
        int i = 0;
        int j = 1;
        while (j<arr.length){
            if(arr[i]!=arr[j]) {
                i=i+1;
                arr[i] = arr[j];
            }
            j = j+1;
        }
        Arrays.stream(arr).forEach(System.out::print);
    }

}
