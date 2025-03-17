public class RemovingDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = {-3, -1, 0, 0, 0, 3, 3};
        int[] tempArr = new int[nums.length];
        int count = 0;
        int index = 0;
        StringBuilder exist = new StringBuilder();
        for (int n = 0; n < nums.length; n++) {
            String str = "";
            if (nums[n] >= 0) str = "+" + nums[n]+",";
            else str = nums[n]+",";
            if (exist.toString().contains(str)) {
                nums[n] = Integer.MAX_VALUE;
            } else {
                if (nums[n] >= 0) exist.append("+").append(nums[n]).append(",");
                else exist.append(nums[n]).append(",");
                count++;
                if (nums[n] != Integer.MAX_VALUE) {
                    tempArr[index] = nums[n];
                    index++;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempArr[i];
        }
        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println(count);
    }
}
