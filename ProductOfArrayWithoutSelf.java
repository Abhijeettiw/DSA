import java.util.Arrays;

public class ProductOfArrayWithoutSelf {

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4};
        Integer[] res = new Integer[nums.length];
//        without division
        for(int i =0;i< nums.length;i++){
            Integer resVal = 1;
            for(int j =0;j< nums.length;j++){
                if (i != j) {
                    resVal *= nums[j];
                }
            }
            res[i] = resVal;
        }
        System.out.println(Arrays.toString(res));
//        with division
        int[] res2 = new int[nums.length];
        int product = 1;
        for(int i=0; i<nums.length;i++){
            product *= nums[i];
        }
        for(int i=0; i<nums.length;i++){
            if(product == 0){
                res2[i] = 0;
            } else if (nums[i] == 0) {
                res2[i] = 0;
            } else {
                res2[i] = product/nums[i];
            }
        }
        System.out.println(Arrays.toString(res2));
    }
}
