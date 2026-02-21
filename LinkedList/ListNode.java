package LinkedList;

public class ListNode<T> {
    T data;
    ListNode<?> tail;
    ListNode<?> next;
    ListNode<?> head = this;
    ListNode<?> previous;
    ListNode(T data) {
        this.data = data;
    }

    int size() {
        ListNode<?> cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}
