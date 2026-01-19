public class PalindromeRecursion {
    static Boolean isPalindrome(String str, Integer idx) {
        Boolean isPalin = Boolean.TRUE;
        if (idx < str.length() / 2) {
            if (str.charAt(idx) == str.charAt(str.length() - idx - 1)) {
                isPalin = isPalindrome(str, idx + 1);
            } else isPalin = Boolean.FALSE;
        }
        return isPalin;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba",0));
    }
}
