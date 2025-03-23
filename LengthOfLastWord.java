public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String[] sArr = s.split(" ");
        String lastWord = "";
        for(String str: sArr){
            if(!str.trim().isEmpty()){
                lastWord = str;
            }
        }
        System.out.println("The last word is "+lastWord+" with length "+lastWord.length()+".");
    }
}
