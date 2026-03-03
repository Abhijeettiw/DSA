package LinkedList;

public class PalindromeLinkedList {
    static ListNode<Integer> reverse(ListNode<Integer> list) {
        if (list == null || list.next == null) {
            return list;
        }
        ListNode<Integer> newHead = reverse((ListNode<Integer>) list.next);
        list.next.next = list;
        list.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(30);
        l1.addNode(30);
        l1.addNode(20);
        l1.addNode(10);
        ListNode<Integer> l2 = null;
        int size = l1.size();
        int i = 0;
        int count = size % 2 == 0 ? size / 2 : size / 2 + 1;
        ListNode<Integer> cur = (ListNode<Integer>) l1.head;
        while (cur != null && i <= count){
            if(i==count){
                l2 = cur;
            }
            i++;
            cur = (ListNode<Integer>) cur.next;
        }
        ListNode<Integer> reverse = reverse(l2);
        ListNode<Integer> c1 = (ListNode<Integer>) reverse.head;
        ListNode<Integer> c2 = (ListNode<Integer>) l1.head;
        boolean isPalin = true;
        while (c1 != null){
            if (c1.data != c2.data){
                isPalin = false;
                break;
            }
            c1 = (ListNode<Integer>) c1.next;
            c2 = (ListNode<Integer>) c2.next;
        }
        System.out.println(isPalin);
    }
}
