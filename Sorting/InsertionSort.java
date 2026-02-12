package Sorting;

import java.util.Arrays;

/*
    Theory
        - First element is always taken as selected element sorted & remaining as unsorted.
        - Iteration is done with remaining element & lowest element is found
        - If lowest is smaller that highest in sorted, it is placed in correct position in sorted.
        - Example
            input = 5, 19, 40, 15, 25   iteration will be 1-4
            step 1
                5, 19, 40, 15, 25        iteration will be 2-4
            step 2
                5, 15, 19, 40, 25       iteration will be 3-4
            step 3
                5, 15, 19, 25, 40      iteration will be 4-4

*/
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 19, 40, 15, 25};
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
