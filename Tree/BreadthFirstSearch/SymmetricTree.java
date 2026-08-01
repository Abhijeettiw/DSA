package Tree.BreadthFirstSearch;

import Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class SymmetricTree {
    static boolean symmetricTree(BinaryTree.TreeNode node) {
        Queue<BinaryTree.TreeNode> q = new LinkedList<>();
        q.offer(node.getLeft());
        q.offer(node.getRight());
        while (!q.isEmpty()) {
            BinaryTree.TreeNode left = q.poll();
            BinaryTree.TreeNode right = q.poll();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }
            if (!Objects.equals(left.getData(), right.getData())) {
                return false;
            }
            q.offer(left.getLeft());
            q.offer(right.getRight());
            q.offer(left.getRight());
            q.offer(right.getLeft());
        }
        return true;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println(symmetricTree(tree.getRoot()));
    }
}
