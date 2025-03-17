import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String name = "abhijeettiwari";
        List<Map.Entry<String, Long>> collect = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).toList();
        System.out.println(collect.getFirst().getKey());
    }
}
