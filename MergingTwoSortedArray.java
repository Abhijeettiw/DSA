import java.util.Arrays;

public class MergingTwoSortedArray {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 6,11,19};
        int n1 = 0;
        int[] a2 = {7, 10,11,12,18};
        int n2 = 0;
        int k = 0;
        int[] res = new int[a1.length + a2.length ];
        while (n1 < a1.length || n2 < a2.length) {
            if (n1 < a1.length && n2 < a2.length) {
                if (a1[n1] < a2[n2]) {
                    res[k] = a1[n1];
                    n1++;
                } else {
                    res[k] = a2[n2];
                    n2++;
                }
            } else if (n1 < a1.length) {
                res[k] = a1[n1];
                n1++;
            } else {
                res[k] = a2[n2];
                n2++;
            }
            k++;
        }
        System.out.println(Arrays.toString(res));
    }
}
