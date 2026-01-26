public class MaxProfit {
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
//        int[] array = {7, 6, 5, 3, 5, 4};
//        int[] array = {7, 6, 5, 4, 3, 2};
        int maxProfit = 0;
        int currentProfit = 0;
        int purchaseDay = 0;
        int sellDay = 0;
//        Using kaden's algo
        for (int i = 1; i < array.length; i++) {
            currentProfit = array[i] - array[purchaseDay];
            if (maxProfit < currentProfit) {
                maxProfit = currentProfit;
                sellDay = i;
            }
            if (currentProfit < 0) {
                purchaseDay = i;
            }
        }
        System.out.println(maxProfit);
        System.out.println(purchaseDay + "(P) - " + sellDay + "(S)");
    }
}
