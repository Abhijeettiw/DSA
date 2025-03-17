public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int[] resultArr = new int[nums.length];
        int replace = 3;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == replace) {
                nums[i] = Integer.MAX_VALUE;
            }
            if(nums[i]!=Integer.MAX_VALUE){
                resultArr[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = resultArr[i];
        }
        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println(index);

    }
}
