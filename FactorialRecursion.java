public class FactorialRecursion {
    static Long factorial(Integer num,Long res){
        if(num < 1){
            return res;
        } else return factorial(num-1,res*num);
    }
    public static void main(String[] args) {
        System.out.println(factorial(10,1L));
    }
}
