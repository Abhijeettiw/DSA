package Recursion;

public class UppercaseLetterInStringRecursion {
    static String singleUpperCase(String str, String res) {
        if (!str.isEmpty()) {
            char c = str.charAt(0);
            if ((int) c >= 65 && (int) c <= 95) {
                res = c + "";
            } else {
                res = singleUpperCase(str.substring(1), res);
            }
        }
        return res;
    }

    static String multipleUpperCase(String str, String res) {
        if (!str.isEmpty()) {
            char c = str.charAt(0);
            if ((int) c >= 65 && (int) c <= 95) {
                res = !res.isEmpty() ? res + "," + c : c + "";
            }
            res = multipleUpperCase(str.substring(1), res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(singleUpperCase("abHijeet", ""));
        System.out.println(multipleUpperCase("abHijeEt", ""));
    }
}
