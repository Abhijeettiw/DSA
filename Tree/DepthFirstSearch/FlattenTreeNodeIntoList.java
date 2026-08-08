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

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        List<Integer> list = flattenTreeNodeIntoList(tree.getRoot());
        System.out.println(list);
    }
}
