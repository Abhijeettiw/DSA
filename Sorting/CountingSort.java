package Sorting;

import java.util.Arrays;

/*
    Theory
        - Bubble, Selection, Insertion, Merge & Quick sort are comparison based sort.
        - Lower limit of time complexity for comparison based is nLog(n).
        - Counting sort is non comparison based hence time complexity is linear.
        - Algorithm
            - Calculate max & min of array
            - Create a frequency array of size (max-min+1) & record the frequency at the index in frequency array
            - Create a cumulative array of size (max-min+1) and adding value of previous position to the current position.
            - Create a temporary array of same size of input array.
            - Iterate input array for reverse direction
            - Place the element in temporary array on positon taken from cumulative array decreased by 1.
            - eg: {1,6,5,3,2,1} - array
                  {1(fre 1),2(fre 2),1(fre 3),0(fre 4),1(fre 5),1(fre 6)} - frequency array
                  {1(pos 1),3(pos 2),4(pos 3),4(pos 4),5(pos 5),6(pos 6)} - cumulative array for position
*/
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 2, 5, -3, 6, 0};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int l = max - min + 1;
        int[] freqArr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            int pos = arr[i] - min;
            freqArr[pos] = freqArr[pos] + 1;
        }
        int[] cumArr = new int[l];
        for (int j = 0; j < freqArr.length; j++) {
            if (j == 0) {
                cumArr[j] = freqArr[j];
            } else {
                cumArr[j] = cumArr[j - 1] + freqArr[j];
            }
        }
        System.out.println(Arrays.toString(freqArr));
        System.out.println(Arrays.toString(cumArr));
        int[] res = new int[arr.length];
        for (int k = arr.length - 1; k >= 0; k--) {
            int fPos = arr[k] - min;
            if (freqArr[fPos] > 0) {
                res[cumArr[fPos] - 1] = arr[k];
                freqArr[fPos] = freqArr[fPos] - 1;
                cumArr[fPos] = cumArr[fPos] - 1;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
