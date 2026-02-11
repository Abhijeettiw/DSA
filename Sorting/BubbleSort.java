package Sorting;

import java.util.Arrays;

/*
    Theory
        - Comparing each element to the next one it order is not present swap them.
        - Sorting happens from end
        - After each iteration size of comparison iteration decreased by 1
        - Time Complexity n*n
        - Example
            input = 10, 40, 20, 50, 25, 15    iteration will be 0-4
            step 1
                10, 20, 40, 25, 15, 50        iteration will be 0-3
            step 2
                10, 20, 25, 15, 40, 50        iteration will be 0-2
            Hence input sorted further iteration will not effect input
*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 50, 25, 15};
        int n = arr.length - 1;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
