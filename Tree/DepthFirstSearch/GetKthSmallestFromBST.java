package Tree.DepthFirstSearch;

import Tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class GetKthSmallestFromBST {

    static Integer getKthSmallestFromBST(BinarySearchTree.TreeNode node, int k) {
        List<Integer> allElementBst = getKthSmallestFromBST(node);
        if (k > allElementBst.size()) {
            return null;
        }
        return allElementBst.get(k - 1);
    }

    static List<Integer> getKthSmallestFromBST(BinarySearchTree.TreeNode node) {
        List<Integer> res = new ArrayList<>();
        if (node == null) {
            return res;
        }
        res.addAll(getKthSmallestFromBST(node.getLeft()));
        res.add(node.getData());
        res.addAll(getKthSmallestFromBST(node.getRight()));
        return res;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert();
        System.out.println(getKthSmallestFromBST(bst.getRoot(), 2));
    }
}
