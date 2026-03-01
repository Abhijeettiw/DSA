package LinkedList;

public class ListNodeTest {

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(new ListNode<>(30), l1.size());
        l1.addNode(40);
        l1.addNode(50);
        l1.addNode(60);
        l1.printNode();
        System.out.println("---------");
        l1.printNodeReverse();
    }
}
