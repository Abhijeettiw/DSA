import java.util.Arrays;

public class MissingNo {
    static int[] arr = {1,2,3,5,6};
    static int gauss(int[] array){
        int n = array.length+1;
        return ((n*(n+1))/2)-Arrays.stream(array).reduce(0, Integer::sum);
    }

    static int xor(int[] array){
        int xor = 0;
        int n = array.length+1;
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        System.out.println(gauss(arr));
        System.out.println(xor(arr));
    }
}
