package Recursion;

public class DigitsInNumber {
    static Integer digits(Integer num, Integer count) {
        if (num % 10 > 0) {
            count = digits(num / 10, ++count);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(digits(12345, 0));
    }
}
