package RecursionAndBackTracking.Recursion;

public class Palindrome {
    static boolean palindromeRecursion(String str) {
        return palindromeRecursion(str, 0, str.length() - 1);
    }

    static boolean palindromeRecursion(String str, int s, int e) {
        if (s > e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        return palindromeRecursion(str, ++s, --e);
    }

    public static void main(String[] args) {
        System.out.println(palindromeRecursion("abcbd"));
        System.out.println(palindromeRecursion("abcba"));
    }
}
