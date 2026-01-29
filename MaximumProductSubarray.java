public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] array = {3, 5, -4, 5, 8};
//        int[] array = {-2,0,-1};
//        int[] array = {-1, -1};
//        int[] array = {-2,-3,-1};
//        int[] array = {2,3,-2,4};
//        int[] array = {3, 5, -4, 5, 8,-5};
        int result = array[0];
        int currentPosProduct = array[0];
        int currentNegProduct = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= 0) {
                currentPosProduct = Math.max(array[i], array[i] * currentPosProduct);
                currentNegProduct = Math.min(array[i], array[i] * currentNegProduct);
            } else {
                int temp = currentPosProduct;
                currentPosProduct = Math.max(array[i], currentNegProduct * array[i]);
                currentNegProduct = Math.min(array[i], temp * array[i]);
            }
            result = Math.max(result, currentPosProduct);
        }
        System.out.println(result);

    }
}
