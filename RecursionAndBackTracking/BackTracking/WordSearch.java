package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {
    static boolean wordSearch(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (wordSearch(board, word, i, j)) return true;
            }
        }
        return false;
    }

    static boolean wordSearch(char[][] board, String word, int row, int col) {
        boolean found = false;
        if (word.isEmpty() || row == board.length) {
            found = true;
            return found;
        }
        if (board[row][col] == word.charAt(0)) {
            char c = board[row][col];
            board[row][col] = '#';
//            right
            if (isValid(board, row, col + 1) && !found) {
                found = wordSearch(board, word.substring(1), row, col + 1);
            }
//            down
            if (isValid(board, row + 1, col) && !found) {
                found = wordSearch(board, word.substring(1), row + 1, col);
            }
//            left
            if (isValid(board, row, col - 1) && !found) {
                found = wordSearch(board, word.substring(1), row, col - 1);
            }
//            up
            if (isValid(board, row - 1, col) && !found) {
                found = wordSearch(board, word.substring(1), row - 1, col);
            }
            board[row][col] = c;
        }
        return found;
    }

    static boolean isValid(char[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };
        String[] words = {"abe", "cfeh", "igh", "cbe"};
        System.out.println(wordSearch(board, "cfeh"));
        List<String> presentInBoard = new ArrayList<>();
        for (String word : words) {
            if (wordSearch(board, word)) {
                presentInBoard.add(word);
            }
        }
        System.out.println(presentInBoard);
    }
}
