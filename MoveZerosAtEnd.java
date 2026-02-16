import java.util.Arrays;

public class MoveZerosAtEnd {
    public static void main(String[] args) {
//        int[] arr = {0};
//        int[] arr = {1, 3, 0, 0, 12};
//        int[] arr = {4, 0, 0, 5, 0, 1, 0};
        int[] arr = {4, 2, 0, 5, 0, 1, 0};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
