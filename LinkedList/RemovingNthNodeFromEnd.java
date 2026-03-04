package LinkedList;

public class RemovingNthNodeFromEnd {
    static ListNode<Integer> removeNth(ListNode<Integer> list, int n) {
        /*
            Theory (slow & fast pointer)
            - Initially slow & fast both pointer will bw at start.
            - Fast will be moved n+1 times at start.
            - Both fast & slow will move one step until fast reaches to null
        */
        n = n + 1;
        ListNode<Integer> slow = (ListNode<Integer>) list.head;
        ListNode<Integer> fast = (ListNode<Integer>) list.head;
        while (n > 0) {
            if (fast == null) {
                ListNode<Integer> temp = (ListNode<Integer>) list.head;
                list.head = list.head.next;
                temp.next = null;
                return temp;
            }
            fast = (ListNode<Integer>) fast.next;
            n--;
        }
        while (fast != null) {
            slow = (ListNode<Integer>) slow.next;
            fast = (ListNode<Integer>) fast.next;
        }
        ListNode<Integer> temp = (ListNode<Integer>) slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return temp;
    }

    static ListNode<Integer> removeNthFromEnd(ListNode<Integer> list, int n) {
        if (n >= list.size() - 1 || n <= 0) {
            n = list.size() - 1;
        } else {
            n = list.size() - n;
        }
        ListNode<Integer> cur = (ListNode<Integer>) list.head;
        while (cur != null) {
            if (n == 1) {
                ListNode<Integer> temp = (ListNode<Integer>) cur.next;
                cur.next = cur.next.next;
                temp.next = null;
                return temp;
            }
            n--;
            cur = (ListNode<Integer>) cur.next;
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

//        ListNode<Integer> removedList = removeNthFromEnd(l1, -9);
//        System.out.println(removedList != null ? removedList.data : null);
        ListNode<Integer> removedList1 = removeNth(l1, 8);
        System.out.println(removedList1 != null ? removedList1.data : null);
        System.out.println("---------");
        l1.printNode();
    }
}
