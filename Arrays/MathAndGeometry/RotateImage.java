package Arrays.MathAndGeometry;

import java.util.Arrays;

public class RotateImage {

    static void rotate(int[][] arr) {
        int n = arr.length;

        // Transpose of array
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse of rows
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int[] i:arr){
            System.out.println(Arrays.toString(i));
        }
        rotate(arr);
        for(int[] i:arr){
            System.out.println(Arrays.toString(i));
        }
    }
}
