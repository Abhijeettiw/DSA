package RecursionAndBackTracking.Recursion;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSortRecursion(int[] arr) {
        bubbleSortRecursion(arr, 0, arr.length - 2);
    }

    static void bubbleSortRecursion(int[] arr, int currentIndex, int lastIndex) {
        if (lastIndex == 0 || currentIndex > lastIndex) {
            return;
        }
        if (arr[currentIndex] > arr[currentIndex + 1]) {
            int temp = arr[currentIndex];
            arr[currentIndex] = arr[currentIndex + 1];
            arr[currentIndex + 1] = temp;
        }
        bubbleSortRecursion(arr, currentIndex + 1, lastIndex);
        bubbleSortRecursion(arr, currentIndex, lastIndex - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 7, 6, 5};
        bubbleSortRecursion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
