package Tree.DepthFirstSearch;

import Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrderTraversalOfTree {
    static Map<Integer, List<Integer>> resMap = new TreeMap<>();

    static void verticalOrderTraversalOfTree(BinaryTree.TreeNode node) {
        verticalOrderTraversalOfTree(node,0);
    }

    static void verticalOrderTraversalOfTree(BinaryTree.TreeNode node, int level) {
        if (node == null) {
            return;
        }
        List<Integer> ints = resMap.getOrDefault(level, new ArrayList<Integer>());
        ints.add(node.getData());
        resMap.put(level, ints);
        verticalOrderTraversalOfTree(node.getLeft(), level - 1);
        verticalOrderTraversalOfTree(node.getRight(), level + 1);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        verticalOrderTraversalOfTree(tree.getRoot());
        System.out.println(resMap.values());
    }
}
