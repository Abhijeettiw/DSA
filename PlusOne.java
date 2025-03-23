import java.math.BigInteger;


public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        StringBuilder resultStr = new StringBuilder();
        for(int i:digits){
            resultStr.append(i);
        }
        String result = String.valueOf((new BigInteger(resultStr.toString())).add(BigInteger.ONE));
        int[] resultArr = new int[result.length()];
        for(int s=0;s< result.split("").length;s++){
            resultArr[s] = Integer.parseInt(result.charAt(s)+"");
        }
        System.out.println();
    }
}
