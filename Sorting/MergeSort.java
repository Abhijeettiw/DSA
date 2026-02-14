package Sorting;

/*
    Theory
        - Divide array into 2 parts.
        - Sort both array.
        - Merge the arrays in to one.
*/

import java.util.Arrays;

public class MergeSort {
    static int[] merge(int[] a1, int[] a2) {
        int n1 = 0;
        int n2 = 0;
        int k = 0;
        int[] res = new int[a1.length + a2.length];
        while (n1 < a1.length || n2 < a2.length) {
            if (n1 < a1.length && n2 < a2.length) {
                if (a1[n1] < a2[n2]) {
                    res[k] = a1[n1];
                    n1++;
                } else {
                    res[k] = a2[n2];
                    n2++;
                }
            } else if (n1 < a1.length) {
                res[k] = a1[n1];
                n1++;
            } else {
                res[k] = a2[n2];
                n2++;
            }
            k++;
        }
        return res;
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 1, 2, 4, 5, 11, 4, 6, 13, 43, 23, 7};
//        diving into 2 array
        int l = arr.length / 2;
        int[] a1 = new int[l];
        int[] a2 = new int[arr.length - l];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i < l) {
                a1[i] = arr[i];
            } else {
                a2[i - l] = arr[i];
            }
        }
        insertionSort(a1);
        insertionSort(a2);

        int[] merge = merge(a1, a2);
        System.out.println(Arrays.toString(merge));
    }
}
