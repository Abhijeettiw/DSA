import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];

        for(int i = 0;i<9;i++){
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();
        }

        Character[][] board = new Character[9][9];
        Boolean isValid = true;
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int gridNo = (r / 3) * 3 + c / 3;
                if(board[r][c] != '.'){
                    Boolean inRow = rowSet[r].contains(board[r][c]);
                    Boolean inCol = colSet[c].contains(board[r][c]);
                    Boolean inGrid = gridSet[gridNo].contains(board[r][c]);

                    if(inRow || inCol || inGrid){
                        isValid = false;
                        break;
                    }
                    rowSet[r].add(board[r][c]);
                    colSet[c].add(board[r][c]);
                    gridSet[gridNo].add(board[r][c]);
                }
            }
        }
        System.out.println(isValid);
    }
}
