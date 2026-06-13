package Tree;

import java.util.Scanner;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
    }

    private class TreeNode {
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

    public void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Want to insert node ? (true/false)");
        while (scanner.hasNextBoolean() && scanner.nextBoolean()) {
            System.out.println("Enter value of node :");
            root = insert(root,scanner.nextInt());
            System.out.println("Want to insert node ? (true/false)");
        }
    }

    private TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        } else if (node.data >= val) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public void inOrderDisplay(){
        inOrderDisplay(root);
    }
    private void  inOrderDisplay(TreeNode node){
        if(node ==null) return;
        inOrderDisplay(node.left);
        System.out.println(node.data);
        inOrderDisplay(node.right);
    }
}
