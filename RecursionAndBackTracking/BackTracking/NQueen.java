package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
    static List<List<int[]>> nQueen(boolean[][] board, int n) {
        List<List<int[]>> result = new ArrayList<>();
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                result.addAll(nQueen(board, n, new ArrayList<>(), r, c));
            }
        }
        return result;
    }

    static List<List<int[]>> nQueen(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<int[]>> result = new ArrayList<>();
        for (int c = 0; c < board.length; c++) {
            result.addAll(nQueen(board, n, new ArrayList<>(), 0, c));
        }
        return result;
    }

    static List<List<int[]>> nQueen(boolean[][] board, int n, List<int[]> current, int row, int column) {
        List<List<int[]>> result = new ArrayList<>();
        if (n == 0) {
            result.add(new ArrayList<>(current));
            return result;
        }
        if (row == board.length || column == board[0].length) {
            return result;
        }
        if (!board[row][column]) {
            boolean allowed = true;
            for (int[] i : current) {
                if (i[1] == column) {
                    allowed = false;
                    break;
                }
            }
            int leftCol = column - 1, rightCol = column + 1, upRow = row - 1;
            while (allowed && (leftCol >= 0 || rightCol < board[0].length) && upRow >= 0) {
                if ((leftCol >= 0 && board[upRow][leftCol])) {
                    allowed = false;
                    break;
                }
                if (rightCol < board[0].length && board[upRow][rightCol]) {
                    allowed = false;
                    break;
                }
                leftCol--;
                rightCol++;
                upRow--;
            }
            if (allowed) {
                current.add(new int[]{row, column});
                board[row][column] = true;
                result.addAll(nQueen(board, n - 1, current, row + 1, 0));
                current.removeLast();
                board[row][column] = false;
                result.addAll(nQueen(board, n, current, row, column + 1));
            } else {
                result.addAll(nQueen(board, n, current, row, column + 1));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
//        List<List<int[]>> queens = nQueen(board, 3);
        List<List<int[]>> queens = nQueen(5);
        queens.forEach(queen -> {
            System.out.println("Path");
            queen.forEach(q -> {
                System.out.println(Arrays.toString(q));
            });
        });
        System.out.println("No of ways - " + queens.size());
    }
}
