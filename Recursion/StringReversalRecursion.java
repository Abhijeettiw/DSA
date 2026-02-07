package Recursion;

public class StringReversalRecursion {
    static String reverse(String word,int length,String result){
        if(length>=0){
            result = result+word.charAt(length);
            result = reverse(word,length-1,result);
        }
        return result;
    }
    public static void main(String[] args) {
        String string = "Abhijeet";
        String result = reverse(string, string.length() - 1, "");
        System.out.println(result);
    }
}
