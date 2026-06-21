package RecursionAndBackTracking.Recursion;

public class PrintTriangle {
    static void printTriangleReverse(int row) {
        printTriangleReverse(row, 0);
    }

    static void printTriangleReverse(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            printTriangleReverse(row, col + 1);
        } else if (col == row) {
            System.out.println("");
            printTriangleReverse(row - 1, 0);
        }
    }

    public static void printTriangle(int lines) {
        printTriangle(lines, 0, 0);
    }

    public static void printTriangle(int lines, int row, int col) {
        if (lines == row) {
            return;
        }
        if (col <= row) {
            System.out.print("*");
            printTriangle(lines, row, col + 1);
        } else {
            System.out.println();
            printTriangle(lines, row + 1, 0);
        }
    }

    public static void main(String[] args) {
        printTriangleReverse(4);
        printTriangle(4);
    }
}
