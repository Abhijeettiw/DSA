package Tree.BreadthFirstSearch;

import Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PopulatingNextRightOfEachElement {
    static List<Integer> populatingNextRightOfEachElement(Queue<BinaryTree.TreeNode> q) {
        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                BinaryTree.TreeNode node = q.poll();
                if (node != null) {
                    result.add(node.getData());
                    if (node.getLeft() != null) {
                        q.offer(node.getLeft());
                    }
                    if (node.getRight() != null) {
                        q.offer(node.getRight());
                    }
                }
            }
            result.add(null);
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        Queue<BinaryTree.TreeNode> q = new LinkedList<>();
        q.offer(tree.getRoot());
        List<Integer> treeData = populatingNextRightOfEachElement(q);
        System.out.println(treeData);
    }
}
