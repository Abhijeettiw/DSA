import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWordAscFrequencyAndLexicographical {

    static Map<String, Integer> basicMethod(String string) {
        Map<String, Integer> count = new HashMap<>();
        for (String i : string.split("")) {
            count.computeIfPresent(i, (k, v) -> v + 1);
            count.computeIfAbsent(i, (v) -> 1);
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<>(count.entrySet());
        list.sort(Comparator.comparing(Map.Entry<String, Integer>::getValue).thenComparing(Map.Entry::getValue));
        Map<String, Integer> res = new LinkedHashMap<>();
        list.forEach(e -> res.put(e.getKey(), e.getValue()));
        return res;
    }

    public static void main(String[] args) {
        String str = "worfbwcwohjgwojwpkwpfracnvbd";
        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(
                        Map.Entry.<String, Long>comparingByValue()
                                .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        collect.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("----------");
        Map<String, Integer> stringIntegerMap = basicMethod(str);
        stringIntegerMap.forEach((k, v) -> System.out.println(k + " - " + v));

    }
}
