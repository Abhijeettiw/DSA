package Arrays.MathAndGeometry;

public class Power {
    static Double powerBruteforce(double num, Integer pow) {
        if (pow == 0) return 1d;
        double n = (double) 1;
        int p = pow < 0 ? -pow : pow;
        for (int i = 1; i <= p; i++) {
            n *= num;
        }
        if (pow < 0) {
            n = 1 / n;
        }
        return n;
    }

    static Double powerRecursion(double num, Integer pow) {
//        Divide & conquer
        if (pow == 0) return 1d;
        double res = num;
        res = pow < 0 ? 1 / res : res;
        int p = pow < 0 ? -pow : pow;
        Double r1 = powerRecursion(res, p / 2);
        Double r2 = powerRecursion(res, p / 2);
        res = r1 * r2;
        res = p % 2 == 1 ? pow < 0 ? res * 1 / num : res * num : res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(powerBruteforce(3, 10));
        System.out.println(powerRecursion(3, 10));
    }
}
