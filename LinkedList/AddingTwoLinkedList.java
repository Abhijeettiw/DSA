package LinkedList;

public class AddingTwoLinkedList {
    static ListNode<Integer> reverse(ListNode<Integer> list) {
        ListNode<Integer> cur = (ListNode<Integer>) list.head;
        ListNode<Integer> prev = null;
        while (cur != null) {
            ListNode<Integer> nxt = (ListNode<Integer>) cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(1);
        l1.addNode(7);
        l1.addNode(3);
        l1.addNode(9);
        ListNode<Integer> l2 = new ListNode<>(4);
        l2.addNode(5);
        l2.addNode(6);
        ListNode<Integer> l1Reverse = reverse(l1);
        ListNode<Integer> l2Reverse = reverse(l2);
        int carry = 0;
        ListNode<Integer> res = null;
        ListNode<Integer> c1 = (ListNode<Integer>) l1Reverse.head;
        ListNode<Integer> c2 = (ListNode<Integer>) l2Reverse.head;
        while (c1 != null || c2 != null) {
            int sum = 0;
            if (c1 != null && c2 != null) {
                sum = c1.data + c2.data + carry;
                carry = sum / 10;
                if (res == null) {
                    res = new ListNode<>(sum >= 10 ? sum % 10 : sum);
                } else {
                    res.addNode(sum >= 10 ? sum % 10 : sum);
                }
                c1 = (ListNode<Integer>) c1.next;
                c2 = (ListNode<Integer>) c2.next;
            } else if (c1 != null) {
                sum = c1.data + carry;
                carry = sum / 10;
                if (res == null) {
                    res = new ListNode<>(sum >= 10 ? sum % 10 : sum);
                } else {
                    res.addNode(sum >= 10 ? sum % 10 : sum);
                }
                c1 = (ListNode<Integer>) c1.next;
            } else if (c2 != null) {
                sum = c2.data + carry;
                carry = sum / 10;
                if (res == null) {
                    res = new ListNode<>(sum >= 10 ? sum % 10 : sum);
                } else {
                    res.addNode(sum >= 10 ? sum % 10 : sum);
                }
                c2 = (ListNode<Integer>) c2.next;
            }
        }
        ListNode<Integer> resReverse = reverse(res);
        resReverse.printNode();
    }
}
