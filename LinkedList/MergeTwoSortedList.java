package LinkedList;

public class MergeTwoSortedList {
    static ListNode<Integer> merge(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> result = null;
        ListNode<Integer> c1 = (ListNode<Integer>) l1.head;
        ListNode<Integer> c2 = (ListNode<Integer>) l2.head;
        while (c1 != null || c2 != null) {
            if (c1 != null && c2 != null) {
                if (c1.data >= c2.data) {
                    if (result == null) {
                        result = new ListNode<>(c2.data);
                    } else {
                        result.addNode(c2.data);
                    }
                    c2 = (ListNode<Integer>) c2.next;
                } else {
                    if (result == null) {
                        result = new ListNode<>(c1.data);
                    } else {
                        result.addNode(c1.data);
                    }
                    c1 = (ListNode<Integer>) c1.next;
                }
            } else if (c1 != null) {
                if (result == null) {
                    result = new ListNode<>(c1.data);
                } else {
                    result.addNode(c1.data);
                }
                c1 = (ListNode<Integer>) c1.next;
            } else {
                if (result == null) {
                    result = new ListNode<>(c2.data);
                } else {
                    result.addNode(c2.data);
                }
                c2 = (ListNode<Integer>) c2.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(30);
        l1.addNode(50);
        ListNode<Integer> l2 = new ListNode<>(-20);
        l2.addNode(20);
        l2.addNode(40);
        l2.addNode(50);
        l2.addNode(55);
//    -20,10,20,20,30,40,50,50,55
        ListNode<Integer> mergedList = merge(l1, l2);
        mergedList.printNode();
    }
}
