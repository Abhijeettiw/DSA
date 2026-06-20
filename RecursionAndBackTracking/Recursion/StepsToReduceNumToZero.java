package RecursionAndBackTracking.Recursion;

public class StepsToReduceNumToZero {
    static int makeNumZeroRecursion(int num) {
        return makeNumZeroRecursion(num, 0);
    }

    static int makeNumZeroRecursion(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return makeNumZeroRecursion(num / 2, ++steps);
        }
        return makeNumZeroRecursion(num - 1, ++steps);
    }

    static int makeNumZero(int num) {
        int steps = 0;
        int newNum = num;
        while (newNum > 0) {
            if (newNum % 2 == 0) {
                newNum /= 2;
            } else {
                newNum -= 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(makeNumZeroRecursion(14));
        System.out.println(makeNumZero(14));
    }
}
