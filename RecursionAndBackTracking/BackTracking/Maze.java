package RecursionAndBackTracking.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    static List<String> ways(int[][] maze, int startRow, int startCol, int endRow, int endCol, List<int[]> obstracles) {
        obstracles.addFirst(new int[]{startRow, startCol});
        return ways(maze, startRow, startCol, endRow, endCol, "", obstracles);
    }

    static List<String> ways(int[][] maze, int startRow, int startCol, int endRow, int endCol, String currentWay, List<int[]> obstracles) {
        List<String> result = new ArrayList<>();
        if (startRow >= maze.length || startCol >= maze[0].length || startRow < 0 || startCol < 0) {
            return result;
        }
        if (startRow == endRow && startCol == endCol) {
            result.add(currentWay);
            return result;
        }
//        Diagonal
//        if (startRow < maze.length && startRow < maze.length) {
//            boolean allowed = true;
//            for (int[] obs : obstracles) {
//                if (startRow + 1 == obs[0] && startCol + 1 == obs[1]) {
//                    allowed = false;
//                    break;
//                }
//            }
//            if (allowed) {
//                result.addAll(ways(maze, startRow + 1, startCol + 1, endRow, endCol, currentWay + "C", obstracles));
//            }
//        }
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
                obstracles.add(new int[]{startRow + 1, startCol});
                result.addAll(ways(maze, startRow + 1, startCol, endRow, endCol, currentWay + "D", obstracles));
                if (!obstracles.isEmpty()) {
                    obstracles.removeLast();
                }
            }
        }
//        UP
        if (startRow > 0) {
            boolean allowed = true;
            for (int[] obs : obstracles) {
                if (startRow - 1 == obs[0] && startCol == obs[1]) {
                    allowed = false;
                    break;
                }
            }
            if (allowed) {
                obstracles.add(new int[]{startRow - 1, startCol});
                result.addAll(ways(maze, startRow - 1, startCol, endRow, endCol, currentWay + "U", obstracles));
                if (!obstracles.isEmpty()) {
                    obstracles.removeLast();
                }
            }
        }
//        Right
        if (startCol < maze[0].length) {
            boolean allowed = true;
            for (int[] obs : obstracles) {
                if (startRow == obs[0] && startCol + 1 == obs[1]) {
                    allowed = false;
                    break;
                }
            }
            if (allowed) {
                obstracles.add(new int[]{startRow, startCol + 1});
                result.addAll(ways(maze, startRow, startCol + 1, endRow, endCol, currentWay + "R", obstracles));
                if (!obstracles.isEmpty()) {
                    obstracles.removeLast();
                }
            }
        }
//        Left
        if (startCol > 0) {
            boolean allowed = true;
            for (int[] obs : obstracles) {
                if (startRow == obs[0] && startCol - 1 == obs[1]) {
                    allowed = false;
                    break;
                }
            }
            if (allowed) {
                obstracles.add(new int[]{startRow, startCol - 1});
                result.addAll(ways(maze, startRow, startCol - 1, endRow, endCol, currentWay + "L", obstracles));
                if (!obstracles.isEmpty()) {
                    obstracles.removeLast();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<int[]> obstracles = new ArrayList<>() {{
            add(new int[]{1, 1});
        }};
        System.out.println(ways(new int[3][3], 0, 0, 2, 2, obstracles));
    }
}
