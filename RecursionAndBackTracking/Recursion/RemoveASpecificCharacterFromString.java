package RecursionAndBackTracking.Recursion;

public class RemoveASpecificCharacterFromString {
    static String removeASpecificCharacterFromString(String str, Character target) {
        return removeASpecificCharacterFromString(str, target, 0).toString();
    }

    static StringBuilder removeASpecificCharacterFromString(String str, Character target, int index) {
        StringBuilder result = new StringBuilder();
        if (index == str.length()) {
            return result;
        }
        if (!target.equals(str.charAt(index))) {
            result.append(str.charAt(index));
        }
        return result.append(removeASpecificCharacterFromString(str, target, ++index));

    }

    public static void main(String[] args) {
        String str = "character";
        System.out.println(removeASpecificCharacterFromString(str, 'a'));
    }
}
