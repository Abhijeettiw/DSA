package RecursionAndBackTracking.Recursion;

public class CountZerosInNumber {
    static int countZerosInNumber(int num) {
        return countZerosInNumber(num, 0);
    }

    static int countZerosInNumber(int num, int cnt) {
        if (num / 10 == 0) {
            return cnt;
        }
        if (num % 10 == 0) {
            cnt++;
        }
        return countZerosInNumber(num / 10, cnt);
    }

    public static void main(String[] args) {
        System.out.println(countZerosInNumber(102034));
    }
}
