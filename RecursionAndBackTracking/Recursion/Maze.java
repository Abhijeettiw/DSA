package RecursionAndBackTracking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    static List<String> ways(int[][] maze, int startRow, int startCol, int endRow, int endCol, int[][] obstracles) {
        return ways(maze, startRow, startCol, endRow, endCol, "", obstracles);
    }

    static List<String> ways(int[][] maze, int startRow, int startCol, int endRow, int endCol, String currentWay, int[][] obstracles) {
        List<String> result = new ArrayList<>();
        if (startRow == maze.length || startCol == maze[0].length) {
            return result;
        }
        if (startRow == endRow && startCol == endCol) {
            result.add(currentWay);
            return result;
        }
//        Diagonal
        if (startRow < maze.length && startRow < maze.length) {
            boolean allowed = true;
            for (int[] obs : obstracles) {
                if (startRow + 1 == obs[0] && startCol + 1 == obs[1]) {
                    allowed = false;
                    break;
                }
            }
            if (allowed) {
                result.addAll(ways(maze, startRow + 1, startCol + 1, endRow, endCol, currentWay + "C", obstracles));
            }
        }
//        Down
        if (startRow < maze.length) {
            boolean allowed = true;
            for (int[] obs : obstracles) {
                if (startRow + 1 == obs[0] && startCol == obs[1]) {
                    allowed = false;
                    break;
                }
            }
            if (allowed) {
                result.addAll(ways(maze, startRow + 1, startCol, endRow, endCol, currentWay + "D", obstracles));
            }
        }
//        Right
        if (startRow < maze.length) {
            boolean allowed = true;
            for (int[] obs : obstracles) {
                if (startRow == obs[0] && startCol + 1 == obs[1]) {
                    allowed = false;
                    break;
                }
            }
            if (allowed) {
                result.addAll(ways(maze, startRow, startCol + 1, endRow, endCol, currentWay + "R", obstracles));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] obstracles = {{1, 1},{0,2}};
        System.out.println(ways(new int[3][3], 0, 0, 2, 2, obstracles));
    }
}
