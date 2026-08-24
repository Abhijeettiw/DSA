package Tree.DepthFirstSearch;

import Tree.BinaryTree;

public class LowestCommonAncestor {
    static BinaryTree.TreeNode lca;

    static boolean contains(BinaryTree.TreeNode parent, BinaryTree.TreeNode node) {
        boolean contains = false;
        if (parent == null) {
            return contains;
        }
        if (parent.getData().equals(node.getData())) {
            return true;
        }
        contains = contains(parent.getLeft(), node);
        if (!contains) {
            contains = contains(parent.getRight(), node);
        }
        return contains;
    }

    public static void lowestCommonAncestor(BinaryTree.TreeNode treeNode, BinaryTree.TreeNode node1, BinaryTree.TreeNode node2) {
        if (treeNode == null) {
            return;
        }
        boolean node1Contains = contains(treeNode, node1);
        boolean node2Contains = contains(treeNode, node2);
        if (node1Contains && node2Contains) {
            lca = treeNode;
        }
        lowestCommonAncestor(treeNode.getLeft(), node1, node2);
        lowestCommonAncestor(treeNode.getRight(), node1, node2);
    }

//    LeetCode
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null){
//            return null;
//        }
//        if(root==p || root==q){
//            return root;
//        }
//        TreeNode left = lowestCommonAncestor(root.left,p,q);
//        TreeNode right = lowestCommonAncestor(root.right,p,q);
//        if(left != null && right != null){
//            return root;
//        }
//
//        return left == null?right :left;
//    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        BinaryTree.TreeNode node1 = new BinaryTree.TreeNode(6);
        BinaryTree.TreeNode node2 = new BinaryTree.TreeNode(4);
        lowestCommonAncestor(tree.getRoot(), node1, node2);
        System.out.println(lca);
    }
}
