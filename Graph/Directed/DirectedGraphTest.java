package Graph.Directed;

import java.util.ArrayList;
import java.util.Arrays;

public class DirectedGraphTest {
    public static void main(String[] args) {
        int[][] input = {{1, 2}, {2, 4}, {4, 5}, {5, 3}, {3, 6}};
        DirectedAdjacencyMatrixGraph graph = new DirectedAdjacencyMatrixGraph();
        int[] result = graph.createGraph(input);
        System.out.println("Directed matrix graph element");
        System.out.println(Arrays.toString(result));
        System.out.println("Directed matrix graph");
        for (int[] ints : graph.innerArray) {
            System.out.println(Arrays.toString(ints));
        }
        DirectedAdjacencyListGraph graph1 = new DirectedAdjacencyListGraph();
        ArrayList<ArrayList<Integer>> graph2Result = graph1.createGraph(input);
        System.out.println();
        System.out.println("Directed list graph element");
        System.out.println(graph2Result);
    }
}
