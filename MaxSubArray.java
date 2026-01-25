public class MaxSubArray {
    public static void main(String[] args) {
//        Kaden's Algo
//        if current sum < 0 reset it to zero

//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] nums = {1};
        int[] nums = {-2,1};
        int maxSum = nums[0];
        int start=0,end=0;
        int currentSum = nums[0];
        for(int i =1;i<nums.length;i++){
            if(currentSum<0){
                currentSum = 0;
                start = i;
            }
            currentSum = currentSum+nums[i];
            if(maxSum<currentSum){
                maxSum = currentSum;
                end = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(start+" - "+end);
    }
}
