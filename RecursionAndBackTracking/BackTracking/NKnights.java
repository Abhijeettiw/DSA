package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NKnights {

    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board[0].length) {
            return true;
        }
        return false;
    }

    static boolean isSafe(boolean[][] board, int row, int column) {
        if (isValid(board, row - 1, column - 2) && board[row - 1][column - 2]) {
            return false;
        }
        if (isValid(board, row - 2, column - 1) && board[row - 2][column - 1]) {
            return false;
        }
        if (isValid(board, row - 2, column + 1) && board[row - 2][column + 1]) {
            return false;
        }
        if (isValid(board, row - 1, column + 2) && board[row - 1][column + 2]) {
            return false;
        }
        return true;
    }

    static List<List<int[]>> nKnights(int n) {
        boolean[][] board = new boolean[n][n];
        return nKnights(board, n, 0, 0, new ArrayList<>());
    }

    static List<List<int[]>> nKnights(boolean[][] board, int k, int row, int col, List<int[]> currentPattern) {
        List<List<int[]>> result = new ArrayList<>();
        if (k == 0) {
            result.add(new ArrayList<>(currentPattern));
            return result;
        }
        if (row == board.length) {
            return result;
        }
        if (col == board[0].length) {
            result.addAll(nKnights(board, k, row + 1, 0, currentPattern));
            return result;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            currentPattern.add(new int[]{row, col});
            result.addAll(nKnights(board, k - 1, row, col + 1, currentPattern));
            board[row][col] = false;
            currentPattern.removeLast();
        }
        result.addAll(nKnights(board, k , row, col + 1, currentPattern));
        return result;
    }


    public static void main(String[] args) {
        List<List<int[]>> knights = nKnights(3);
        knights.forEach(knight -> {
            System.out.println();
            System.out.println("Pattern");
            knight.forEach(k -> {
                System.out.print(Arrays.toString(k));
            });
        });
        System.out.println("No of ways - " + knights.size());
    }
}
