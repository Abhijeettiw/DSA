package Tree;

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

    public static void main(String[] args) {
        BinaryTree.TreeNode root = createTreeFromPreOrderAndInOrder(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println(root);
    }
}
