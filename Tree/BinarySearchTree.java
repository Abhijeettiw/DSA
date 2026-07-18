package Tree;

import java.util.Scanner;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
    }

    public void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Want to insert node ? (true/false)");
        while (scanner.hasNextBoolean() && scanner.nextBoolean()) {
            System.out.println("Enter value of node :");
            root = insert(root, scanner.nextInt());
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
        node.setHeight(getHeight(node));
        return rotate(node);
    }

    private TreeNode rotate(TreeNode node) {
//        Left heavy
        if (getHeight(node.left) - getHeight(node.right) > 1) {
//            Right rotate
            if (getHeight(node.left.left) - getHeight(node.left.right) > 0) {
                return rightRotate(node);
            }
//            Left rotate
            if (getHeight(node.left.right) - getHeight(node.left.left) > 0) {
                return leftRotate(node);
            }

        }
//        Right heavy
        if (getHeight(node.right) - getHeight(node.left) > 1) {
//            Right rotate
            if (getHeight(node.right.left) - getHeight(node.right.right) > 0) {
                return rightRotate(node);
            }
//            Left rotate
            if (getHeight(node.right.right) - getHeight(node.right.left) > 0) {
                return leftRotate(node);
            }
        }
        return node;
    }

    private TreeNode rightRotate(TreeNode node) {
        TreeNode c = node.left;
        TreeNode cr = c.right;
        c.right = node;
        node.left = cr;
        c.height = getHeight(c);
        node.height = getHeight(node);
        return c;
    }

    private TreeNode leftRotate(TreeNode node) {
        TreeNode c = node.right;
        TreeNode cl = c.left;
        c.left = node;
        node.right = cl;
        c.height = getHeight(c);
        node.height = getHeight(node);
        return c;
    }

    public void inOrderDisplay() {
        inOrderDisplay(root);
    }

    private void inOrderDisplay(TreeNode node) {
        if (node == null) return;
        inOrderDisplay(node.left);
        System.out.println(node.data);
        inOrderDisplay(node.right);
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
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
}
