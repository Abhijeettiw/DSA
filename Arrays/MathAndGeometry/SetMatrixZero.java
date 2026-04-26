package Arrays.MathAndGeometry;

import java.util.Arrays;

public class SetMatrixZero {

    static void bruteForce(int[][] arr) {
        StringBuffer row = new StringBuffer();
        StringBuffer col = new StringBuffer();
        int r = arr.length, c = arr[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 0) {
                    if (!row.isEmpty()) {
                        row.append(",").append(i).append(" ");
                    } else {
                        row.append(i).append(" ");
                    }
                    if (!col.isEmpty()) {
                        col.append(",").append(j).append(" ");
                    } else {
                        col.append(j).append(" ");
                    }
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row.toString().contains(i+" ") || col.toString().contains(j+" ")) {
                    arr[i][j] = 0;
                }
            }
        }

    }

//    static void fromNet(int[][] arr) {
//        boolean r0 = false, c0 = false;
//        int r = arr.length, c = arr[0].length;
//
//        for (int i = 0; i < c; i++) {
//            if (arr[i][0] == 0) {
//                r0 = true;
//            }
//        }
//        for (int i = 0; i < r; i++) {
//            if (arr[0][i] == 0) {
//                c0 = true;
//            }
//        }
//
//        for (int i = 1; i < r; i++) {
//            for (int j = 1; j < c; c++) {
//                if (arr[i][j] == 0) {
//                    arr[i][0] = 0;
//                    arr[0][j] = 0;
//                }
//            }
//        }
//
//        for (int i = 1; i < r; i++) {
//            for (int j = 1; j < c; c++) {
//                if (arr[i][0] == 0 || arr[0][j] == 0) {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//
//        if (c0) {
//            for (int i = 0; i < r; i++) {
//                arr[0][i] = 0;
//            }
//        }
//
//        if (r0) {
//            for (int i = 0; i < r; i++) {
//                arr[i][0] = 0;
//            }
//        }
//    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

//        fromNet(arr);
        bruteForce(arr);
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
