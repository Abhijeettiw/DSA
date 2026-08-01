package Tree.BreadthFirstSearch;

import Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeRightSideView {
    static List<Integer> treeRightSideView(Queue<BinaryTree.TreeNode> q) {
        List<Integer> result = new ArrayList<>();
        if (q.isEmpty()) {
            return result;
        } else {
            result.add(q.peek().getData());
        }
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> currentLevel = new ArrayList<>();
            BinaryTree.TreeNode node = q.poll();
            for (int i = 0; i < size; i++) {
                if (node.getLeft() != null) {
                    q.offer(node.getLeft());
                    currentLevel.add(node.getLeft().getData());
                }
                if (node.getRight() != null) {
                    q.offer(node.getRight());
                    currentLevel.add(node.getRight().getData());
                }
            }
            if (!currentLevel.isEmpty()) {
                result.add(currentLevel.removeLast());
            }
            currentLevel.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        Queue<BinaryTree.TreeNode> q = new LinkedList<>();
        q.offer(tree.getRoot());
        System.out.println(treeRightSideView(q));
    }
}
