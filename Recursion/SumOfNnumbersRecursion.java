package Recursion;

public class SumOfNnumbersRecursion {
    static Integer sum(Integer num, Integer sum) {
        if (num > 0) {
            sum = sum(num - 1, sum + num);
        }
        return sum;
    }

    static Integer sum2(Integer num) {
        if (num > 0) {
            return num + sum2(num-1);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 0));
        System.out.println(sum2(10));
    }
}
