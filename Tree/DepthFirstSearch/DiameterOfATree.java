package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class DiameterOfATree {

    static Integer getHeight(BinaryTree.TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
    }

    static Integer diameterOfTree(BinaryTree.TreeNode node) {
        if (node == null) {
            return 0;
        }
        int nodeDiameter = getHeight(node.getLeft()) + getHeight(node.getRight());
        Integer leftDiameter = diameterOfTree(node.getLeft());
        Integer rightDiameter = diameterOfTree(node.getRight());
        int max = Math.max(leftDiameter, rightDiameter);
        return Math.max(max, nodeDiameter);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println(diameterOfTree(tree.getRoot()));
    }
}
