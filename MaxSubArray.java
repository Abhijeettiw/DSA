public class MaxSubArray {
    public static void main(String[] args) {
//        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] array = {1};
        int sum = 0, start = -1, end = -1;
        for (int i = 0; i < array.length; i++) {
            int initialSum = 0;
            initialSum = initialSum + array[i];
            if (array.length > 1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (i != j) {
                        initialSum = initialSum + array[j];
                        if (sum < initialSum) {
                            sum = initialSum;
                            start = i;
                            end = j;
                        }
                    }
                }
            } else {
                sum = initialSum;
                start = 1;
                end = 1;
            }
        }
        System.out.println(sum);
        System.out.println(start + "(Start) - " + end + "(End)");
    }
}
