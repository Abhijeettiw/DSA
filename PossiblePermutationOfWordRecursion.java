import java.util.HashSet;
import java.util.Set;

public class PossiblePermutationOfWordRecursion {
    static Set<String> wordPermutation(String word, Set<String> result, int iteration) {
        if(iteration>0) {
            int length = word.length();
            StringBuilder per = new StringBuilder(word.charAt(iteration - 1) + "");
            while (length > 0) {
                if (length-1 != iteration-1)
                    per.append(word.charAt(length-1));
                length--;
            }
            result.add(per.toString());
            wordPermutation(word,result,iteration-1);
        }
        return result;
    }



    public static void main(String[] args) {
        String word = "ABC";
        Set<String> result = new HashSet<>();
        Set<String> permutation = wordPermutation(word, result, word.length());
        System.out.println(permutation);
    }
}
