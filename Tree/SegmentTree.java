package Tree;

public class SegmentTree {
    private TreeNode root;

    public SegmentTree() {
    }

    protected class TreeNode {
        private int data;
        private int[] interval;
        private String operationType;
        private TreeNode left;
        private TreeNode right;
        private int height;

        TreeNode(int data, int[] interval, String type) {
            this.data = data;
            this.interval = interval;
            this.operationType = type;
        }

        TreeNode() {
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

        public int getData() {
            return this.data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int[] getInterval() {
            return this.interval;
        }

        public void setInterval(int[] interval) {
            this.interval = interval;
        }

        public String getOperationType() {
            return this.operationType;
        }

        public void setOperationType(String type) {
            this.operationType = operationType;
        }

        public int getHeight() {
            return this.height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

    public void createSegmentTree(int[] input, String operationType) {
        setRoot(createSegmentTree(input, operationType, 0, input.length - 1));
    }

    public TreeNode createSegmentTree(int[] input, String operationType, int start, int end) {
        TreeNode node = new TreeNode();
        if (start == end) {
            node = new TreeNode(input[start], new int[]{start, end}, operationType);
            return node;
        }
        int mid = (start + end) / 2;
        TreeNode leftNode = createSegmentTree(input, operationType, start, mid);
        TreeNode rightNode = createSegmentTree(input, operationType, mid + 1, end);
        node.setData(leftNode.getData() + rightNode.getData());
        node.left = leftNode;
        node.right = rightNode;
        return node;
    }

    public void setRoot(TreeNode node) {
        this.root = node;
    }

    public TreeNode getRoot() {
        return this.root;
    }


}
