package Arrays.MathAndGeometry;

public class Power {
    static Number powerBruteforce(double num, Integer pow) {
        if (pow == 0) return 1;
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

    static Number powerRecursion(double num, Integer pow) {
//        Divide & conquer
        if(pow == 0) return 1;
        double res = num;
        res = pow < 0 ? 1 / res : res;
        int p = pow < 0 ? -pow : pow;
        if (p > 1) {
            int p1 = p / 2;
            int p2 = p / 2;
            Number r1 = powerRecursion(res, p1);
            Number r2 = powerRecursion(res, p2);
            res = (double) r1 * (double) r2;
            res = pow % 2 == 1 ? res * res : res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(powerBruteforce(4, 2));
        System.out.println(powerRecursion(4, 2));
    }
}
