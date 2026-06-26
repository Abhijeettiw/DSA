package RecursionAndBackTracking.Recursion;

public class RemoveASpecificCharacterFromString {
    static String removeASpecificCharacterFromString(String str, Character target) {
        return removeASpecificCharacterFromString(str, target, 0);
    }

    static String removeASpecificCharacterFromString(String str, Character target, int index) {
        String result = "";
        if (index == str.length()) {
            return result;
        }
        if (!target.equals(str.charAt(index))) {
            result = result + str.charAt(index);
        }
        String string = removeASpecificCharacterFromString(str, target, ++index);
        return result + string;

    }

    public static void main(String[] args) {
        String str = "character";
        System.out.println(removeASpecificCharacterFromString(str,'a'));
    }
}
