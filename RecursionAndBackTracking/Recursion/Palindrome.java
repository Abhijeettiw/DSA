package RecursionAndBackTracking.Recursion;

public class Palindrome {
    static boolean palindromeRecursion(String input) {
        return palindromeStringRecursion(input, 0, input.length() - 1);
    }

    static boolean palindromeRecursion(int input) {
        int result = reverseNumber(input, 0);
        if (result == input) {
            return true;
        }
        return false;
    }

    static boolean palindromeStringRecursion(String str, int s, int e) {
        if (s > e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        return palindromeStringRecursion(str, ++s, --e);
    }

    static int reverseNumber(int num, int result) {
        if (num / 10 == 0) {
            return result * 10 + num;
        }
        result = result * 10 + num % 10;
        return reverseNumber(num / 10, result);
    }

    public static void main(String[] args) {
        System.out.println(palindromeRecursion("abcba"));
        System.out.println(palindromeRecursion(12321));
    }
}
