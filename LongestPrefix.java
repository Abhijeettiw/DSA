public class LongestPrefix {
    static int smallestElementCount(String[] str) {
        int count = Integer.MAX_VALUE;
        for (String s : str) {
            if (s.length() < count) {
                count = s.length();
            }
        }
        return count;
    }

    static String longestCommonPrefix(String[] str, int pos) {
        String sub = "";
        if (pos > 0) {
            for (String s1 : str) {
                String s2 = s1.substring(0, pos);
                if (sub.isEmpty()) {
                    sub = s2;
                } else {
                    if (!s2.equalsIgnoreCase(sub)) {
                        sub = longestCommonPrefix(str, pos - 1);
                    }
                }
            }
        }
        for(String s2:str){
            if(!s2.startsWith(sub))
                return "";
        }
        return sub;
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
//        String[] str = {"dog","racecare","car"};
        int sndIteration = smallestElementCount(str);
        String longestCommonPrefix = longestCommonPrefix(str, sndIteration);
        System.out.println(longestCommonPrefix);
    }
}
