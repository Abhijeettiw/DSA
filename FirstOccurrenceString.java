public class FirstOccurrenceString {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "sipp";
        int index = -1;
        if (haystack.equals(needle)) {
            index = 0;
        } else if (haystack.contains(needle)) {
            int needleLength = needle.length();
            String firstChar = needle.charAt(0) + "";
            if (haystack.length() > 1) {
                String[] hayStackArr = haystack.split("");
                for (int i = 0; i < hayStackArr.length; i++) {
                    if (firstChar.equals(hayStackArr[i])) {
                        String substring = haystack.substring(i, i+needleLength);
                        if(needle.equals(substring)) {
                            index = i;
                            break;
                        }
                    }
                }
            } else index = 0;
        }
        System.out.println(index);
    }
}
