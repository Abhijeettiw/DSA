public class MaximumProductSubarray {
    public static void main(String[] args) {
//        int[] array = {3, 5, -4, 5, 8};
//        int[] array = {-2,0,-1};
//        int[] array = {2,3,-2,4};
        int[] array = {3, 5, -4, 5, 8,-5};
        int result = 0;
        int currentPosProduct = 1;
        int currentNegProduct = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                currentPosProduct = currentPosProduct * array[i];
            } else {
                result = Math.max(currentPosProduct,result);
                currentPosProduct = 1;
            }
            result = Math.max(currentPosProduct,result);
            currentNegProduct = currentNegProduct * array[i];
        }
        result = Math.max(result, currentNegProduct);
        if(result == 1) result = 0;
        System.out.println(result);
    }
}
