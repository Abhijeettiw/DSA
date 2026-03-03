package LinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(30);
        l1.addNode(40);
        l1.addNode(50);
//        l1.addNode(60);
        int size = l1.size();
        int i = 0;
        int mid = size / 2 + 1;
        ListNode<Integer> midNode = null;
        ListNode<Integer> cur = (ListNode<Integer>) l1.head;
        while (cur != null && i < mid) {
            if (i + 1 == mid) {
                midNode = cur;
            }
            i++;
            cur = (ListNode<Integer>) cur.next;
        }
        System.out.println(midNode.data);
    }
}
