public class AtoiRecursion {
    static Integer atoi(String num, Integer idx, Integer res) {
        num = num.replaceAll("[^0-9]", "");
        if (idx < num.length()) {
            int multiplier = (int) Math.pow(10, num.length() - 1 - idx);
            int no = Integer.parseInt(num.charAt(idx) + "");
            res = atoi(num, ++idx, res+no * multiplier);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(atoi("1234",0,0));
    }
}
