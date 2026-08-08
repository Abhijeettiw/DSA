package Tree;

import java.util.*;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
    }

    void myInsertNode() {
        Scanner scanner = new Scanner(System.in);
        root = myInsertNode(scanner, root);
    }

    //    By Me
    private TreeNode myInsertNode(Scanner scanner, TreeNode node) {
        if (node == null) {
            System.out.println("Enter value for node");
            int i = scanner.nextInt();
            node = new TreeNode(i);
        }
        System.out.println("Want to add left node for -> " + node.getData() + " ? (true/false) :");
        boolean left = scanner.nextBoolean();
        if (left) {
            node.left = myInsertNode(scanner, node.left);
        }
        System.out.println("Want to add right node for -> " + node.getData() + " ? (true/false) :");
        boolean right = scanner.nextBoolean();
        if (right) {
            node.right = myInsertNode(scanner, node.right);
        }
        return node;
    }

    //    From internet
    public void populate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for root");
        root = new TreeNode(scanner.nextInt());
        populate(scanner, root);
    }

    void populate(Scanner scanner, TreeNode node) {
        System.out.print("Add left child for " + node.data + "? (true/false): ");
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.print("Enter value of left child of " + node.data + ": ");
            node.left = new TreeNode(scanner.nextInt());
            populate(scanner, node.left);
        }

        System.out.print("Add right child for " + node.data + "? (true/false): ");
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.print("Enter value of right child of " + node.data + ": ");
            node.right = new TreeNode(scanner.nextInt());
            populate(scanner, node.right);
        }
    }

    public List<List<Integer>> breadthFirstSearch() {
        Queue<TreeNode> bfsQueue = new LinkedList<>();
        bfsQueue.offer(root);
        return breadthFirstSearch(bfsQueue, new ArrayList<>());
    }

    private List<List<Integer>> breadthFirstSearch(Queue<TreeNode> bfsQueue, List<Integer> currentList) {
        List<List<Integer>> result = new ArrayList<>();
        if (bfsQueue.isEmpty()) {
            return result;
        }
        int size = bfsQueue.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = bfsQueue.poll();
            if (node != null) {
                currentList.add(node.data);
                if (node.left != null) {
                    bfsQueue.offer(node.left);
                }
                if (node.right != null) {
                    bfsQueue.offer(node.right);
                }
            }
        }
        result.add(currentList);
        result.addAll(breadthFirstSearch(bfsQueue, new ArrayList<>()));
        return result;
    }

    public Integer height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
        private int height;

        TreeNode(int data) {
            this.data = data;
        }

        public TreeNode getLeft() {
            return this.left;
        }

        public void setLeft(TreeNode node) {
            this.left = node;
        }

        public TreeNode getRight() {
            return this.right;
        }

        public void setRight(TreeNode node) {
            this.right = node;
        }

        public Integer getData() {
            return this.data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getHeight() {
            return this.height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    public TreeNode getRoot() {
        return this.root;
    }
}
