package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class MaximumDepthOfBinaryTree {
    static Integer maximumDepthOfBinaryTree(BinaryTree.TreeNode node) {
//        Need to find the height of tree
        if (node == null) {
            return 0;
        }
        return Math.max(maximumDepthOfBinaryTree(node.getLeft()), maximumDepthOfBinaryTree(node.getRight())) + 1;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println(maximumDepthOfBinaryTree(tree.getRoot()));
    }
}
