package LinkedList;

public class RemovingNthNodeFromEnd {
    static ListNode<Integer> removeNthFromEnd(ListNode<Integer> list, int n) {
        if (n > 0) {
            if (n >= list.size() - 1) {
                n = list.size() - 1;
            } else {
                n = list.size() - n;
            }
            ListNode<Integer> cur = (ListNode<Integer>) list.head;
            while (cur != null) {
                if (n == 1) {
                    ListNode<Integer> temp = (ListNode<Integer>) cur.next;
                    cur.next = cur.next.next;
                    cur.next.previous = cur;
                    temp.next = null;
                    return temp;
                }
                n--;
                cur = (ListNode<Integer>) cur.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(30);
        l1.addNode(40);
        l1.addNode(50);
        l1.addNode(60);

        ListNode<Integer> removedList = removeNthFromEnd(l1, 2);
        System.out.println(removedList != null ? removedList.data : null);
        l1.printNode();
        l1.printNodeReverse();
    }
}
