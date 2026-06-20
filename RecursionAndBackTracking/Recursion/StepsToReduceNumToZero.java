package RecursionAndBackTracking.Recursion;

public class StepsToReduceNumToZero {
    static int makeNumZero(int num) {
        return makeNumZero(num, 0);
    }

    static int makeNumZero(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return makeNumZero(num / 2, ++steps);
        }
        return makeNumZero(num - 1, ++steps);
    }

    public static void main(String[] args) {
        System.out.println(makeNumZero(14));
    }
}
