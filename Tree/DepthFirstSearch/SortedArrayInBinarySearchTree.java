package Tree.DepthFirstSearch;

public class SortedArrayInBinarySearchTree {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode() {

        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    static TreeNode sortedArrayInBinarySearchTree(int[] array) {
        return sortedArrayInBinarySearchTree(array, 0, array.length - 1);
    }

    static TreeNode sortedArrayInBinarySearchTree(int[] array, int start, int end) {
        if (end < start) {
            return null;
        }
        TreeNode node = new TreeNode();
        int mid = (start + end) / 2;
        node.setData(array[mid]);
        node.setLeft(sortedArrayInBinarySearchTree(array, start, mid - 1));
        node.setRight(sortedArrayInBinarySearchTree(array, mid + 1, end));
        return node;

    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode treeNode = sortedArrayInBinarySearchTree(array);
        System.out.println(treeNode);
    }
}
