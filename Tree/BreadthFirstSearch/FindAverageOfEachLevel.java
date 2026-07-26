package Tree.BreadthFirstSearch;

import Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindAverageOfEachLevel {
    static List<Double> avgAtEachLevel(Queue<BinaryTree.TreeNode> queue) {
        List<Double> result = new ArrayList<>();
        if (queue.isEmpty()) {
            return result;
        }
        int size = queue.size();
        int val = 0;
        for (int i = 0; i < size; i++) {
            BinaryTree.TreeNode node = queue.poll();
            if (node != null) {
                val += node.getData();
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
        }
        double avg = (double) val / size;
        result.add(avg);
        result.addAll(avgAtEachLevel(queue));
        return result;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        Queue<BinaryTree.TreeNode> q = new LinkedList<>();
        q.offer(tree.getRoot());
        List<Double> avgAtLevel = avgAtEachLevel(q);
        System.out.println(avgAtLevel);
    }
}
