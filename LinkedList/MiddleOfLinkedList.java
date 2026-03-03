package LinkedList;


public class MiddleOfLinkedList {
    static ListNode<Integer> slowFastMethod(ListNode<Integer> list) {
        ListNode<Integer> slow = (ListNode<Integer>) list.head;
        ListNode<Integer> fast = (ListNode<Integer>) list.head;
        while (fast != null && fast.next != null) {
            slow = (ListNode<Integer>) slow.next;
            fast = (ListNode<Integer>) fast.next.next;
        }
        return slow;
    }

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
        ListNode<Integer> midNode2 = slowFastMethod(l1);
        System.out.println(midNode2.data);
    }
}
