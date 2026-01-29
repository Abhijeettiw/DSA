import java.util.Arrays;

public class ProductOfArrayWithoutSelf {

    public static void main(String[] args) {
        Integer[] nums = {5, 2, 3, 4};
        Integer[] res = new Integer[nums.length];
//        without division but N*N
        for (int i = 0; i < nums.length; i++) {
            Integer resVal = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    resVal *= nums[j];
                }
            }
            res[i] = resVal;
        }
        System.out.println(Arrays.toString(res));
//        with division with N
        int[] res2 = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (product == 0) {
                res2[i] = 0;
            } else if (nums[i] == 0) {
                res2[i] = 0;
            } else {
                res2[i] = product / nums[i];
            }
        }
        System.out.println(Arrays.toString(res2));
//        with N
        int[] res3 = new int[nums.length];
        int[] l_array = new int[nums.length];
        int[] r_array = new int[nums.length];
        int l_index = 0;
        int r_index = nums.length - 1;
        while (l_index < nums.length || r_index > 0) {
            if(l_index == 0 || r_index == nums.length-1){
                l_array[l_index] = 1;
                r_array[r_index] = 1;
            } else {
                l_array[l_index] = l_array[l_index-1] * nums[l_index-1];
                r_array[r_index] = r_array[r_index+1] * nums[r_index+1];
            }
            l_index++;
            r_index--;
        }
        for(int i = 0;i<nums.length;i++){
            res3[i] = l_array[i] * r_array[i];
        }
        System.out.println(Arrays.toString(res3));
    }
}
