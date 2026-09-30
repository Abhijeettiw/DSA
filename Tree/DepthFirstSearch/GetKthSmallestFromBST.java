package Tree.DepthFirstSearch;

import Tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class GetKthSmallestFromBST {

//    My solution
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

    //    From course
    static int cnt = 0;

    static Integer kthSmallestFromBST(BinarySearchTree.TreeNode node, int k) {
        BinarySearchTree.TreeNode treeNode = kthSmallestFromBSTHelper(node, k);
        if (treeNode != null) {
            return treeNode.getData();
        }
        return null;
    }

    static BinarySearchTree.TreeNode kthSmallestFromBSTHelper(BinarySearchTree.TreeNode node, int k) {
        if (node == null) {
            return null;
        }
        BinarySearchTree.TreeNode left = kthSmallestFromBSTHelper(node.getLeft(), k);
        if (left != null) {
            return left;
        }
        cnt++;
        if (k == cnt) {
            return node;
        }
        return kthSmallestFromBSTHelper(node.getRight(), k);

    }


    static Integer kthSmallestFromHeap(BinarySearchTree.TreeNode node, int k) {
        PriorityQueue<Integer> res = new PriorityQueue<>();
        kthSmallestFromHeap(node.getLeft(), k, 0, res);
        while (res.size() > 1) {
            res.poll();
        }
        return res.poll();
    }

    static void kthSmallestFromHeap(BinarySearchTree.TreeNode node, int k, int n, PriorityQueue<Integer> q) {
        if (node == null) {
            return;
        }
        n = n + 1;
        if (n <= k) {
            kthSmallestFromHeap(node.getLeft(), k, n, q);
            q.offer(node.getData());
            kthSmallestFromHeap(node.getRight(), k, n, q);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert();
        System.out.println(getKthSmallestFromBST(bst.getRoot(), 2));
        System.out.println(kthSmallestFromBST(bst.getRoot(), 2));
    }
}
