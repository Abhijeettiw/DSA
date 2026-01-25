public class SumOfNnumbersRecursion {
    static Integer sum(Integer num, Integer sum) {
        if (num > 0) {
            sum = sum(num - 1, sum + num);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,0));
    }
}
