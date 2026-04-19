package Arrays.TwoPointerMethod;

public class TrappingRainWater {

    static int twoPointer(int[] arr) {
        int[] l_arr = new int[arr.length];
        int[] r_arr = new int[arr.length];
        int ans = 0;
        /*
            Highest element at the left of index
        */
        l_arr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            l_arr[i] = Math.max(arr[i], l_arr[i - 1]);
        }
        /*
            Highest element at the right of index
        */
        r_arr[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            r_arr[i] = Math.max(arr[i], r_arr[i + 1]);
        }
       /*
            Min of highest at left & right minus current value
        */
        for (int j = 0; j < arr.length; j++) {
            ans += Math.min(l_arr[j], r_arr[j]) - arr[j];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(twoPointer(arr));
    }
}
