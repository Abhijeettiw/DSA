package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class InvertingBinaryTree {
    static BinaryTree.TreeNode invertingBinaryTree(BinaryTree.TreeNode node) {
        if (node == null) {
            return node;
        }

        BinaryTree.TreeNode left = node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(left);
        invertingBinaryTree(node.getRight());
        invertingBinaryTree(node.getLeft());
        return node;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        BinaryTree.TreeNode node = invertingBinaryTree(tree.getRoot());
        System.out.println(node);
    }
}
