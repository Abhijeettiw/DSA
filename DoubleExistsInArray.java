public class DoubleExistsInArray {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        boolean exist = false;
        outer:for (int i=0;i< arr.length;i++) {
            for (int j=0;j< arr.length;j++) {
                if(i!=j) {
                    if (arr[i] == 0 && arr[j] == 0) {
                        System.out.println(i+"-"+j);
                        exist = true;
                        break outer;
                    }
                    if (arr[i] == 2 * arr[j]) {
                        System.out.println(i+"-"+j);
                        exist = true;
                        break outer;
                    }
                }
            }
        }
        System.out.println(exist);
    }
}
