package Tree.DepthFirstSearch;

import Tree.BinaryTree;

import java.util.Arrays;

public class CreateTreeFromPreOrderAndInOrder {
    static BinaryTree.TreeNode createTreeFromPreOrderAndInOrder(int[] preOrder, int[] inOrder) {
        if (preOrder.length == 0) {
            return null;
        }
        BinaryTree.TreeNode node = new BinaryTree.TreeNode(preOrder[0]);
        int index = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if (inOrder[i] == preOrder[0]) {
                index = i;
                break;
            }
        }
        node.setLeft(
                createTreeFromPreOrderAndInOrder(
                        Arrays.copyOfRange(preOrder, 1, index + 1),
                        Arrays.copyOfRange(inOrder, 0, index)
                )
        );
        node.setRight(
                createTreeFromPreOrderAndInOrder(
                        Arrays.copyOfRange(preOrder, index + 1, inOrder.length),
                        Arrays.copyOfRange(inOrder, index + 1, inOrder.length)
                )
        );
        return node;
    }

    static String serializeTreeNodesInString(BinaryTree.TreeNode node) {
        StringBuilder res = new StringBuilder();
        if (node == null) {
            res.append("null").append(",");
            return res.toString();
        }
        res.append(node.getData()).append(",");
        res.append(serializeTreeNodesInString(node.getLeft()));
        res.append(serializeTreeNodesInString(node.getRight()));
        return res.toString();
    }
    static String serializedTree = "";
    static BinaryTree.TreeNode deSerializeTreeNodesInString() {
        BinaryTree.TreeNode node = null;
        if (serializedTree.isEmpty()) {
            return node;
        }
        String dataString = serializedTree.substring(0, serializedTree.indexOf(","));
        serializedTree = serializedTree.substring(serializedTree.indexOf(",") + 1);
        if (dataString.equals("null")) {
            return node;
        }
        int data = Integer.parseInt(dataString);
        node = new BinaryTree.TreeNode(data);
        node.setLeft(deSerializeTreeNodesInString());
        node.setRight(deSerializeTreeNodesInString());
        return node;
    }

    public static void main(String[] args) {
        BinaryTree.TreeNode root = createTreeFromPreOrderAndInOrder(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println(root);
        serializedTree = serializeTreeNodesInString(root);
        System.out.println(serializedTree);
        BinaryTree.TreeNode deSerializeTreeNode = deSerializeTreeNodesInString();
        System.out.println(deSerializeTreeNode);
    }
}
