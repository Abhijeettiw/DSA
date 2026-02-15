package Sorting;

import java.util.Arrays;

public class QuickSort {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pi = partition(arr, left, right);
            quickSort(arr, 0, pi - 1);
            quickSort(arr, pi + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 2, 5, 3, -6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
