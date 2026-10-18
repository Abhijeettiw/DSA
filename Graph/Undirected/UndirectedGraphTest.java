package Graph.Undirected;

import Graph.Directed.DirectedAdjacencyMatrixGraph;

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
    }
}
