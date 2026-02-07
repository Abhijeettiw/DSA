package Recursion;

public class WaysToTop {
    static int recursion(int first, int next, int steps, int result) {
        if (steps > 0) {
            result = first + next;
            result = recursion(next, first + next, steps - 1, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int steps = 10;
        System.out.println(recursion(0, 1, steps, 0));
    }
}
