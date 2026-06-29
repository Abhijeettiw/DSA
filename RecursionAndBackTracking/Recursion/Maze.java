package RecursionAndBackTracking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    static List<String> ways(int[][] maze, int startRow, int startCol, int endRow, int endCol) {
        return ways(maze, startRow, startCol, endRow, endCol, "");
    }

    static List<String> ways(int[][] maze, int startRow, int startCol, int endRow, int endCol, String currentWay) {
        List<String> result = new ArrayList<>();
        if (startRow == maze.length || startCol == maze[0].length) {
            return result;
        }
        if (startRow == endRow && startCol == endCol) {
            result.add(currentWay);
            return result;
        }
        if (startRow < maze.length) {
            result.addAll(ways(maze, startRow + 1, startCol, endRow, endCol, currentWay + "D"));
        }
        if (startRow < maze.length) {
            result.addAll(ways(maze, startRow, startCol + 1, endRow, endCol, currentWay + "R"));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ways(new int[3][3], 0, 0, 2, 2));
    }
}
