public class LargestCharacterSeriesInString {
    public static void main(String[] args) {
        String str = "abcabcdedefg";
        StringBuilder largestSubString = new StringBuilder();
        StringBuilder currentSubString = new StringBuilder();
        int asci = 0;
        for (int i = 0; i < str.length(); i++) {

            if (asci < (int) str.charAt(i)) {
                asci = (int) str.charAt(i);
                currentSubString.append(str.charAt(i));
            }
            if (largestSubString.length() < currentSubString.length()) {
                largestSubString = new StringBuilder(currentSubString);
            }
            if (asci > (int) str.charAt(i)) {
                asci = 0;
                currentSubString.setLength(0);
                currentSubString.append(str.charAt(i));
            }
        }
        System.out.println(largestSubString);
    }
}
