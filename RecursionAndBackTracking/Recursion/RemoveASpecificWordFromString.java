package RecursionAndBackTracking.Recursion;

public class RemoveASpecificWordFromString {
    static String removeASpecificWordFromString(String str, String target) {
        return removeASpecificWordFromString(str, target, 0).toString();
    }

    static StringBuilder removeASpecificWordFromString(String str, String target, int index) {
        StringBuilder result = new StringBuilder();
        if (index >= str.length()) {
            return result;
        }
        if (str.substring(index).startsWith(target)) {
            return removeASpecificWordFromString(str, target, index + target.length());
        } else {
            result.append(str.charAt(index));
            return result.append(removeASpecificWordFromString(str, target, ++index));
        }
    }

    public static void main(String[] args) {
        System.out.println(removeASpecificWordFromString("abhijeet", "jee"));
    }
}
