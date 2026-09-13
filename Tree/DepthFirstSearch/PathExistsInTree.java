package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class PathExistsInTree {
    static boolean pathExistsInTree(BinaryTree.TreeNode node, int[] array) {
        return pathExistsInTree(node, array, 0);
    }

    static boolean pathExistsInTree(BinaryTree.TreeNode node, int[] array, int idx) {
        if (idx == array.length) {
            return true;
        }
        if (node != null && node.getData() == array[idx]) {
            boolean b = pathExistsInTree(node.getLeft(), array, idx + 1);
            if (!b) {
                b = pathExistsInTree(node.getRight(), array, idx + 1);
            }
            return b;
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println(pathExistsInTree(tree.getRoot(), new int[]{1, 3, 6}));
    }
}
