package Tree.BreadthFirstSearch;

import Tree.BinaryTree;

import java.util.*;

public class ZigZagLevelOrder {
    static List<List<Integer>> zigZagLevelOrder(Queue<BinaryTree.TreeNode> q) {
        return zigZagLevelOrder(q, new ArrayDeque<>(), "R");
    }

    static List<List<Integer>> zigZagLevelOrder(Queue<BinaryTree.TreeNode> q, Deque<Integer> currentList, String direction) {
        List<List<Integer>> result = new ArrayList<>();
        if (q.isEmpty()) {
            return result;
        }
        int size = q.size();
        for (int i = 0; i < size; i++) {
            BinaryTree.TreeNode node = q.poll();
            if (node != null) {
                if (node.getLeft() != null) {
                    q.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    q.offer(node.getRight());
                }
                if ("R".equals(direction)) {
                    currentList.offerFirst(node.getData());
                } else {
                    currentList.offerLast(node.getData());
                }
            }
        }
        direction = "R".equals(direction) ? "L" : "R";
        result.add(new ArrayList<>(currentList));
        result.addAll(zigZagLevelOrder(q, new ArrayDeque<>(), direction));
        return result;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        Queue<BinaryTree.TreeNode> q = new LinkedList<>();
        q.offer(tree.getRoot());
        System.out.println(zigZagLevelOrder(q));
    }
}
