package Graph.Directed;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DirectedAdjacencyListGraph {
    private final ArrayList<ArrayList<Integer>> innerList = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> createGraph(int[][] inner) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int[] ints : inner) {
            q.offer(ints[0]);
        }
        Integer largest = q.poll();
        int size = largest != null ? largest + 1 : 1;
        for (int i = 0; i <= size; i++) {
            innerList.add(new ArrayList<>());
        }
        for (int[] ints : inner) {
            innerList.get(ints[0]).add(ints[1]);
        }
        return innerList;
    }

    public DirectedAdjacencyListGraph() {
    }

}
