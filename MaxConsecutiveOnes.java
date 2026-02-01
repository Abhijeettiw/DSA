public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1};
//        int[] nums = {1, 1, 0, 1, 1, 1};
        int max = 0;
        int currentMax = 0;
        int idx = 0;
        while (idx < nums.length) {
            if (nums[idx] == 1) {
                currentMax++;
            } else {
                currentMax = 0;
            }
            if (currentMax > max) {
                max = currentMax;
            }
            idx++;
        }
        System.out.println(max);
    }
}
