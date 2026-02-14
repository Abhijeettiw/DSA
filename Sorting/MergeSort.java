package Sorting;

/*
    Theory
        - Solved by recursion
        - Divide array into 2 parts.
        - Keep on dividing array until size of each array is 1.
            eg: {2,1,4,2,5,3,6}
                {2}{1}{4}{2}{5}{3}{6} - end result of dividing or array
        - Merge the arrays in to one by merge algorithm.
            eg: {2}{1}{4}{2}{5}{3}{6}
                {1,2}{2,4}{3,5},{6}
                {1,2,2,4},{3,5,6}
                {1,2,2,3,4,5,6}
*/

import java.util.Arrays;

public class MergeSort {
    //    for merging sorted array
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

    static int[] mergeRecursion(int[] arr) {
        int[] res = arr;
        if (arr.length > 1) {
            int l = arr.length / 2;
            int[] a1 = new int[l];
            int[] a2 = new int[arr.length - l];
            for (int i = 0; i < arr.length; i++) {
                if (i < l) {
                    a1[i] = arr[i];
                } else {
                    a2[i - l] = arr[i];
                }
            }
            int[] a3 = mergeRecursion(a1);
            int[] a4 = mergeRecursion(a2);
            res = merge(a3, a4);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,2,5,3,6};
//        int[] arr = {1, 2, 4, 6, 3, 1, 2, 4, 5, 11, 4, 6, 13, 43, 23, 7};
        System.out.println(Arrays.toString(mergeRecursion(arr)));
    }
}
