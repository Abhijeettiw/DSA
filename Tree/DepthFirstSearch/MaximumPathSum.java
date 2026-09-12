package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class MaximumPathSum {
    static Integer max = Integer.MIN_VALUE;

    static void maximumPathSum(BinaryTree.TreeNode node) {
        if (node == null) {
            return;
        }
        Integer left = maxSum(node.getLeft());
        Integer right = maxSum(node.getRight());
        max = Math.max(left + right + node.getData(), max);
        maximumPathSum(node.getLeft());
        maximumPathSum(node.getRight());
    }

    static Integer maxSum(BinaryTree.TreeNode node) {
        if (node == null) {
            return 0;
        }
        Integer left = maxSum(node.getLeft());
        Integer right = maxSum(node.getRight());

        return node.getData() + Math.max(left, right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        maximumPathSum(tree.getRoot());
        System.out.println(max);
    }
}
