package Graph.Undirected;

import java.util.ArrayList;
import java.util.Arrays;

public class UndirectedGraphTest {
    public static void main(String[] args) {
        int[][] input = {{1, 2}, {2, 4}, {4, 5}, {5, 3}, {3, 6}};
        UndirectedAdjacencyMatrixGraph graph = new UndirectedAdjacencyMatrixGraph();
        int[] result = graph.createGraph(input);
        System.out.println("Undirected graph element");
        System.out.println(Arrays.toString(result));
        System.out.println("Undirected graph");
        for (int[] ints : graph.innerArray) {
            System.out.println(Arrays.toString(ints));
        }
        UndirectedAdjacencyListGraph graph1 = new UndirectedAdjacencyListGraph();
        ArrayList<ArrayList<Integer>> graph2Result = graph1.createGraph(input);
        System.out.println("Undirected list graph element");
        System.out.println(graph2Result);
    }
}
