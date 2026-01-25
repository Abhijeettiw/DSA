import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWordAscFrequencyAndLexicographical {
    public static void main(String[] args) {
        String str = "worfbwcwohjgwojwpkwpfracnvbd";
        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(
                        Map.Entry.<String, Long>comparingByKey()
                                .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        collect.forEach((k, v) -> System.out.println(k + " - " + v));

    }
}
