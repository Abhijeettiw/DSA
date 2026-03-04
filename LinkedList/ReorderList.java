package LinkedList;

public class ReorderList {
    static ListNode<Integer> reverseRecursion(ListNode<Integer> list) {
        if (list == null || list.next == null) {
            return list;
        }
        ListNode<Integer> newHead = reverseRecursion((ListNode<Integer>) list.next);
        list.next.next = list;
        list.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(4);
        l1.addNode(5);
        l1.addNode(6);
        ListNode<Integer> l11 = null;
        ListNode<Integer> l12 = null;
        ListNode<Integer> s = (ListNode<Integer>) l1.head;
        ListNode<Integer> f = (ListNode<Integer>) l1.head;
        while (s != null) {
            if (f != null && f.next != null) {
                if (l11 == null) {
                    l11 = new ListNode<>(s.data);
                } else {
                    l11.addNode(s.data);
                }
                f = (ListNode<Integer>) f.next.next;
            } else {
                if (l12 == null) {
                    l12 = new ListNode<>(s.data);
                } else {
                    l12.addNode(s.data);
                }
            }
            s = (ListNode<Integer>) s.next;
        }
        ListNode<Integer> reverseL12 = reverseRecursion(l12);
        ListNode<Integer> result = null;
        ListNode<Integer> c2 = (ListNode<Integer>) l11.head;
        ListNode<Integer> c3 = (ListNode<Integer>) reverseL12.head;
        while (c2 != null || c3 != null) {
            if (c2 != null && c3 != null) {
                if (result == null) {
                    result = new ListNode<>(c2.data);
                    result.addNode(c3.data);
                } else {
                    result.addNode(c2.data);
                    result.addNode(c3.data);
                }
                c2 = (ListNode<Integer>) c2.next;
                c3 = (ListNode<Integer>) c3.next;
            } else if (c2 != null) {
                if (result == null) {
                    result = new ListNode<>(c2.data);
                } else {
                    result.addNode(c2.data);
                }
                c2 = (ListNode<Integer>) c2.next;
            } else if (c3 != null) {
                if (result == null) {
                    result = new ListNode<>(c3.data);
                } else {
                    result.addNode(c3.data);
                }
                c3 = (ListNode<Integer>) c3.next;
            }
        }
        result.printNode();
    }
}
