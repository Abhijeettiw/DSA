package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class SumRootToLeaf {
    static Integer totalSum = 0;

    static void sumRootToLeaf1(BinaryTree.TreeNode node) {
        sumRootToLeaf1(node, 0);
    }

    static void sumRootToLeaf1(BinaryTree.TreeNode node, Integer currentSum) {
        if (node == null) {
            totalSum += currentSum;
            return;
        }
        currentSum = currentSum * 10 + node.getData();
        sumRootToLeaf1(node.getLeft(), currentSum);
        sumRootToLeaf1(node.getRight(), currentSum);
    }

    static Integer sumRootToLeaf2(BinaryTree.TreeNode node) {
        return sumRootToLeaf2(node, 0);
    }

    static Integer sumRootToLeaf2(BinaryTree.TreeNode node, Integer currentSum) {
        if (node == null) {
            return 0;
        }
        currentSum = currentSum * 10 + node.getData();
        if (node.getLeft() == null && node.getRight() == null) {
            return currentSum;
        }
        Integer left = sumRootToLeaf2(node.getLeft(), currentSum);
        Integer right = sumRootToLeaf2(node.getRight(), currentSum);
        return left + right;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        sumRootToLeaf1(tree.getRoot());
        System.out.println(totalSum / 2);
        System.out.println(sumRootToLeaf2(tree.getRoot()));
    }
}
