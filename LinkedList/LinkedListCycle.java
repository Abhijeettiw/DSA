package LinkedList;

public class LinkedListCycle {
/*
    Hair & Tortoise algorithm 1 slow pointer & 1 fast pointer
    - Slow pointer takes one step
    - Fast pointer takes 2 steps
    - If cycle is present Slow & Fast pointer will meet at a certain point.
 */
    public static void main(String[] args) {
        ListNode<Integer> intersectionNode = new ListNode<>(40);
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(intersectionNode, l1.size());
        l1.addNode(30);
        l1.addNode(50);
        l1.addNode(60);
        l1.addNode(intersectionNode, l1.size());

        ListNode<Integer> slow = (ListNode<Integer>) l1.head;
        ListNode<Integer> fast = (ListNode<Integer>) l1.head;
        boolean isCyclic = false;
        while (slow != null & fast != null) {
            slow = (ListNode<Integer>) slow.next;
            fast = (ListNode<Integer>) fast.next.next;
            if (slow.equals(fast)) {
                isCyclic = true;
                break;
            }
        }
        System.out.println(isCyclic);
    }
}
