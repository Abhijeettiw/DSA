package RecursionAndBackTracking.Recursion;

public class ReverseNumber {
    static int reverseNumberRecursion(int num) {
        return reverseNumberRecursion(num, 0);
    }

    static int reverseNumberRecursion(int num, int result) {
        if (num / 10 == 0) {
            return num;
        }
        result = result * 10 + num % 10;
        return reverseNumberRecursion(num / 10, result);
    }

    public static void main(String[] args) {
        System.out.println(reverseNumberRecursion(1234));
    }
}
