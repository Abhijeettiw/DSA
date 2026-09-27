package Tree.DepthFirstSearch;

import Tree.BinarySearchTree;
import Tree.BinaryTree;

import java.util.HashSet;
import java.util.Set;

public class TwoSumTree {
    static boolean twoSumTree(BinarySearchTree.TreeNode node, int target){
        return twoSumTree(node,target,new HashSet<>());
    }
    static boolean twoSumTree(BinarySearchTree.TreeNode node, int target, Set<Integer> integers){
        boolean exist = false;
        if(node== null){
            return false;
        }
        int remaining = target - node.getData();
        if(integers.contains(remaining)){
            return true;
        }
        integers.add(node.getData());
        exist = twoSumTree(node.getLeft(), target, integers);
        if(!exist){
            exist = twoSumTree(node.getRight(), target, integers);
        }
        return exist;
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert();
        System.out.println(twoSumTree(tree.getRoot(),9));
    }
}
