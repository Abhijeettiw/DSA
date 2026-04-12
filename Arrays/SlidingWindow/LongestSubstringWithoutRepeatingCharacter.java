package Arrays.SlidingWindow;

public class LongestSubstringWithoutRepeatingCharacter {
    static Integer bruteForce(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int length = 1;
        int currLength = length;
        StringBuilder initial = new StringBuilder(str.charAt(0) + "");
        int a = 0, b = length;
        while (b < str.length()) {
            if (initial.toString().contains(str.charAt(b) + "")) {
                a = initial.indexOf(str.charAt(b) + "");
                initial = new StringBuilder(initial.substring(a + 1) + str.charAt(b));
                currLength = initial.length();
            } else {
                initial.append(str.charAt(b));
                currLength++;
            }
            if (currLength > length) {
                length = currLength;
            }
            b++;
        }
        return length;
    }

    public static void main(String[] args) {
        String str = "bacabcadbb";
//        String str = "abcadbcabb";
//        String str = "bbbb";
//        String str = "pwwkew";
        System.out.println(bruteForce(str));
    }
}
