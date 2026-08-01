package Tree.BreadthFirstSearch;

import Tree.BinaryTree;

public class CousinsInBinaryTree {
    static boolean cousinsInBinaryTree(BinaryTree tree, int x, int y) {
        int left = findLevel(tree.getRoot(), x, 0);
        int right = findLevel(tree.getRoot(), y, 0);
        return (left == right && !isSibling(tree.getRoot(), x, y));
    }

    static int findLevel(BinaryTree.TreeNode node, int val, int lvl) {
        if (node == null) {
            return 0;
        }
        if (node.getData() == val) {
            return lvl;
        }
        int left = findLevel(node.getLeft(), val, lvl + 1);
        if (left != 0) {
            return left;
        }
        return findLevel(node.getRight(), val, lvl + 1);
    }

    static boolean isSibling(BinaryTree.TreeNode node, int x, int y) {
        if (node == null || node.getLeft() == null || node.getRight() == null) {
            return false;
        }
        return (
                x == node.getLeft().getData() && y == node.getRight().getData() ||
                        y == node.getLeft().getData() && x == node.getRight().getData() ||
                        isSibling(node.getLeft(), x, y) ||
                        isSibling(node.getRight(), x, y)
        );

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println(cousinsInBinaryTree(tree, 4, 5));
    }
}
