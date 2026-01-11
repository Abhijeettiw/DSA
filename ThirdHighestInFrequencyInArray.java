import java.util.*;
import java.util.stream.Collectors;

public class ThirdHighestInFrequencyInArray {

    static Integer method(Integer[] array) {
        Integer value = null;
        Map<Integer, Long> collect = Arrays.stream(array)
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
        Set<Long> values = new HashSet<>(collect.values());
        ArrayList<Long> longs = new ArrayList<>(values);
        Collections.sort(longs);
        Long targetValue = values.size() > 2 ? longs.get(2) : longs.getLast();
        for (Map.Entry<Integer, Long> entry : collect.entrySet()) {
            if (Objects.equals(targetValue, entry.getValue())) {
                value = entry.getKey();
                break;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 3, 2, 1, 4, 5, 6, 23, 4, 5, 3, 1, 4, 5, 6, 4, 3, 1};
        Map<Integer, Long> collect1 = new HashMap<>();
        Map<Integer, Long> collect2 = new HashMap<>();
//       -----  Other methods for finding frequency
        for (Integer i : arr) {
            collect1.compute(i, (k, v) -> v == null ? 1L : v + 1);
        }
        for (Integer i : arr) {
            collect2.computeIfAbsent(i, v -> 1L);
            collect2.computeIfPresent(i, (k, v) -> v + 1);
        }
//        -----
        System.out.println(method(arr));
    }
}
