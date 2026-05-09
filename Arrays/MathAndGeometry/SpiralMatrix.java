package Arrays.MathAndGeometry;

import java.util.Arrays;

public class SpiralMatrix {
    static int[] spiralMatrix(int[][] arr) {
        int top = 0, bottom = arr.length - 1, left = 0, right = arr[0].length - 1, k = 0;
        int[] res = new int[arr.length * arr[0].length];
        while (k <= res.length) {
            for (int i = left; i <= right; i++) {
                res[k++] = arr[top][i];
            }
            top++;
            if (k == res.length) break;
            for (int i = top; i <= bottom; i++) {
                res[k++] = arr[i][right];
            }
            right--;
            if (k == res.length) break;
            for (int i = right; i >= left; i--) {
                res[k++] = arr[bottom][i];
            }
            bottom--;
            if (k == res.length) break;
            for (int i = bottom; i >= top; i--) {
                res[k++] = arr[i][left];
            }
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(Arrays.toString(spiralMatrix(arr)));
    }
}
