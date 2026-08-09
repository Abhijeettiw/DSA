package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class ValidateABinarySearchTree {
    static boolean validateABinarySearchTree1(BinaryTree.TreeNode node) {
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
        boolean a = validateABinarySearchTree1(node.getLeft());
        boolean b = validateABinarySearchTree1(node.getRight());
        return a && b;
    }

    static boolean validateABinarySearchTree2(BinaryTree.TreeNode node) {
        if (node == null) {
            return true;
        }
        return validateABinarySearchTree2(node, null, null);
    }

    static boolean validateABinarySearchTree2(BinaryTree.TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }
        if (low != null && low >= node.getData()) {
            return false;
        }
        if (high != null && high <= node.getData()) {
            return false;
        }
        boolean l = validateABinarySearchTree2(node.getLeft(), low, node.getData());
        boolean r = validateABinarySearchTree2(node.getRight(), node.getData(), high);
        return l && r;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println(validateABinarySearchTree1(tree.getRoot()));

    }
}
