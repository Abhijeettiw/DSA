package Sorting;

import java.util.Arrays;

/*
    Theory
        - Select the small element than current element from unsorted part and place it on first position.
        - Sorting starts from start.
        - After each iteration size of comparison iteration decreased by 1.
        - Time Complexity n*n
        - Example
            input = 15, 20, 5, 45, 30, 10   iteration will be 0-5
            step 1
                5, 10, 15, 45, 30, 20        iteration will be 0-4
            step 2
                5, 10, 15, 45, 30, 20        iteration will be 0-3
            step 3
                5, 10, 15, 20, 30, 45        iteration will be 0-2
            Hence input sorted further iteration will not effect input
*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {15, 20, 5, 45, 30, 10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
