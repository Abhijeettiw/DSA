package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class ValidateABinarySearchTree {
    static boolean validateABinarySearchTree(BinaryTree.TreeNode node) {
        if (node == null) {
            return true;
        }
        BinaryTree.TreeNode left = node.getLeft();
        BinaryTree.TreeNode right = node.getRight();
        if (left != null && left.getData() > node.getData()) {
            return false;
        }
        if (right != null && node.getData() > right.getData()) {
            return false;
        }
        boolean a = validateABinarySearchTree(node.getLeft());
        boolean b = validateABinarySearchTree(node.getRight());
        if (!(a && b)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println(validateABinarySearchTree(tree.getRoot()));

    }
}
