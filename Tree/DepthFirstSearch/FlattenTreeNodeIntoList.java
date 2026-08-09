package Tree.DepthFirstSearch;

import Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class FlattenTreeNodeIntoList {
    static List<Integer> flattenTreeNodeIntoList(BinaryTree.TreeNode node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }
        result.add(node.getData());
        result.addAll(flattenTreeNodeIntoList(node.getLeft()));
        result.addAll(flattenTreeNodeIntoList(node.getRight()));
        return result;
    }
    static BinaryTree.TreeNode getRightMostNode(BinaryTree.TreeNode node){
        if(node.getRight()==null){
            return node;
        }
        return getRightMostNode(node.getRight());
    }
    static BinaryTree.TreeNode flattenTreeNodeIntoListLeetCode(BinaryTree.TreeNode node) {
        if (node == null) {
            return node;
        }
        if(node.getLeft() != null){
            BinaryTree.TreeNode rightMostNode = getRightMostNode(node.getLeft());
            rightMostNode.setRight(node.getRight());
            node.setRight(node.getLeft());
            node.setLeft(null);
        }
        flattenTreeNodeIntoListLeetCode(node.getRight());
        return node;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        List<Integer> list = flattenTreeNodeIntoList(tree.getRoot());
        System.out.println(list);
        BinaryTree.TreeNode root = flattenTreeNodeIntoListLeetCode(tree.getRoot());
        System.out.println(root);
    }
}
