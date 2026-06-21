package RecursionAndBackTracking.Recursion;

public class PrintTriangle {
    static void printTriangle(int row) {
        printTriangle(row, 0);
    }

    static void printTriangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            printTriangle(row, col + 1);
        } else if (col == row) {
            System.out.println("");
            printTriangle(row - 1, 0);
        }

    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}
