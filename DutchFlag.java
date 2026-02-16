import java.util.Arrays;

public class DutchFlag {
    public static void main(String[] args) {
//        Applying insertion sort
        int[] arr = {2, 0, 2, 1, 1, 0};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
