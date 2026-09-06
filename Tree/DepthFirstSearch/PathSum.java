package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class PathSum {
    static Boolean pathSum(BinaryTree.TreeNode node, int target) {
        Boolean res = false;
        if (node == null) {
            return false;
        }
        if (target - node.getData() == 0) {
            return true;
        }
        if (0 > target - node.getData()) {
            return false;
        }
        res = pathSum(node.getLeft(), target - node.getData());
        if (!res) {
            res = pathSum(node.getRight(), target - node.getData());
        }
        return res;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println(pathSum(tree.getRoot(), 8));
    }
}
