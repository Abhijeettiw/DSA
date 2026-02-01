import java.util.Arrays;

public class RotateTheArray {
    //    Solution 1
    static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int x = arr[i];
            int y = arr[arr.length - 1 - i];
            arr[i] = y;
            arr[arr.length - 1 - i] = x;
        }
        return arr;
    }

    static int[] rotateArray(int[] arr, int k) {
        int[] resultArr = new int[arr.length];
        if (arr.length < k) {
            k = k % arr.length;
        }
        int[] arr1 = new int[k];
        int[] arr2 = new int[arr.length - k];
        int[] reverseArr = reverse(arr);
        for (int i = 0; i < reverseArr.length; i++) {
            if (i < k) {
                arr1[i] = reverseArr[i];
            } else {
                arr2[i - k] = reverseArr[i];
            }
        }
        arr1 = reverse(arr1);
        arr2 = reverse(arr2);
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                resultArr[i] = arr1[i];
            } else {
                resultArr[i] = arr2[i - k];
            }
        }
        return resultArr;
    }

    //    Solution 2
    static int[] reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
    /*
    Logic
    Step 1 - if K is greater than n, k = n % k
    Step 2 - reverse the array
    Step 3 - reverse first k element & last k element separately
     */
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int rotation = 5;
        int rotation = 15;
//        Solution 1
        int[] result = rotateArray(arr, rotation);
        System.out.println(Arrays.toString(result));

//        Solution 2
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        if (rotation > arr2.length)
            rotation = rotation % arr2.length;
        reverseArray(arr2, 0, arr2.length - 1);
        reverseArray(arr2, 0, rotation - 1);
        reverseArray(arr2, rotation , arr2.length - 1);
        System.out.println(Arrays.toString(arr2));
    }
}
