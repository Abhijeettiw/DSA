package LinkedList;

public class ReversingSinglyLinkedList {
    static ListNode<Integer> reverseLinkedList1(ListNode<Integer> list) {
        ListNode<Integer> cur = (ListNode<Integer>) list.head;
        ListNode<Integer> result = null;
        while (cur != null) {
            ListNode<Integer> temp = result;
            result = new ListNode<>(cur.data);
            result.next = temp;
            cur = (ListNode<Integer>) cur.next;
        }
        return result;
    }

    static ListNode<Integer> reverseLinkedList2(ListNode<Integer> list) {
        ListNode<Integer> cur = (ListNode<Integer>) list.head;
        ListNode<Integer> prev = null;
        while (cur != null) {
            ListNode<Integer> next = (ListNode<Integer>) cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

//    static ListNode<Integer> reverseLinkedListRecursion(ListNode<Integer> list) {
//        if (list == null || list.next == null) {
//            return list;
//        }
//        ListNode<Integer> newHead = reverseLinkedListRecursion((ListNode<Integer>) list.next);
//        list.next.next = list;
//        list.next = null;
//        return newHead;
//    }

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(30);
        l1.addNode(40);
        l1.addNode(50);
        l1.addNode(60);
        l1.addNode(70);
        l1.addNode(80);
        ListNode<Integer> reverseList1 = reverseLinkedList1(l1);
        reverseList1.printNode();
//        ListNode<Integer> reverseLinkedListWithRecursion = reverseLinkedListRecursion(l1);
        System.out.println("-------");
//        reverseLinkedListWithRecursion.printNode();
        System.out.println("--------");
        ListNode<Integer> reverseList2 = reverseLinkedList2(l1);
        reverseList2.printNode();
    }
}
