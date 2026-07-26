package Tree.BreadthFirstSearch;

import Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessor {
    static Integer levelOrderSuccessor(Queue<BinaryTree.TreeNode> q, int target) {
        if (q.isEmpty()) {
            return null;
        }
        int size = q.size();
        for (int i = 0; i < size; i++) {
            BinaryTree.TreeNode node = q.poll();
            if (node != null) {
                if (node.getLeft() != null) {
                    q.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    q.offer(node.getRight());
                }
                if (node.getData() == target) {
                    BinaryTree.TreeNode resultNode = q.poll();
                    if (resultNode != null) {
                        return resultNode.getData();
                    }
                }
            }
        }
        return levelOrderSuccessor(q, target);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        Queue<BinaryTree.TreeNode> q = new LinkedList<>();
        q.offer(tree.getRoot());
        System.out.println(levelOrderSuccessor(q,2));
    }
}
