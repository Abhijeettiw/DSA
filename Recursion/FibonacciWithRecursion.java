package Recursion;

public class FibonacciWithRecursion {
    static String getFibonacci(int limit,String res){
        if(limit>0){
            if(res.isEmpty()){
                res = "0";
            } else {
                String[] resArr = res.split(",");
                if(res.contains(",")){
                    int s = Integer.parseInt(resArr[resArr.length-2]);
                    int f = Integer.parseInt(resArr[resArr.length-1]);
                    int r = s+f;
                    res = res+","+r;
                } else {
                    int f = Integer.parseInt(resArr[resArr.length-1]);
                    int r = f+1;
                    res = res+","+r;
                }
            }
            res = getFibonacci(limit-1,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int limit = 10;
        String fibonacci = getFibonacci(limit,"");
        System.out.println(fibonacci);
    }
}
