package Graph.Undirected;

import java.util.*;

public class UndirectedAdjacencyMatrixGraph {
    public int[][] innerArray;

    public int[] createGraph(int[][] input) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int[] integers : input) {
            q.offer(integers[0]);
            q.offer(integers[1]);
        }
        Integer largest = q.poll();
        int size = largest != null ? largest + 1 : 1;
        this.innerArray = new int[size][size];
        Set<Integer> nodeSet = new HashSet<>();
        for (int[] integers : input) {
            innerArray[integers[0]][integers[1]] = 1;
            innerArray[integers[1]][integers[0]] = 1;
            nodeSet.add(integers[0]);
            nodeSet.add(integers[1]);
        }
        List<Integer> traversalArray = new ArrayList<>(nodeSet);
        traversalArray.sort(Comparator.comparingInt(Integer::intValue));
        int[] result = new int[traversalArray.size()];
        for (int i = 0; i < traversalArray.size(); i++) {
            result[i] = traversalArray.get(i);
        }
        return result;
    }
}
