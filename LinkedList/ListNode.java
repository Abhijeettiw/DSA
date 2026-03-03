package LinkedList;

public class ListNode<T> {
    T data;
    int count = 0;
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

    void addNode(T data) {
        addNode(new ListNode<>(data), this.size());
    }

    void addNode(ListNode<T> node, Integer pos) {
        ListNode<?> cur = this.head;
        if (pos == 0) {
            node.next = cur;
            cur.previous = node;
            this.head = node;
        } else if (this.size() > pos) {
            int count = 0;
            while (cur != null) {
                if (count + 1 == pos) {
                    ListNode<?> temp = cur.next;
                    cur.next = node;
                    node.previous = cur;
                    node.next = temp;
                    temp.previous = node;
                }
                count++;
                cur = cur.next;
            }
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
            cur.next.previous = cur;
            this.tail = cur.next;
        }
    }

    void printNode() {
        if (this.head != null) {
            ListNode<?> cur = this.head;
            while (cur != null) {
                System.out.println(cur.data);
                cur = cur.next;
            }
        } else System.out.println("null");
    }

    void printNodeReverse() {
        if (this.tail != null) {
            ListNode<?> cur = this.tail;
            while (cur != null) {
                System.out.println(cur.data);
                cur = cur.previous;
            }
        } else System.out.println("null");
    }


    ListNode<?> removeElement() {
        return removeElement(this.size() - 1);
    }

    ListNode<?> removeElement(int position) {
        ListNode<?> cur = this.head;
        ListNode<?> removed = null;
        if (position == 0) {
            this.head = this.head.next;
            removed = cur;
            removed.next = null;
        } else if (position < this.size()) {
            int count = 0;
            while (cur != null) {
                if (count + 1 == position) {
                    removed = cur.next;
                    cur.next = cur.next.next;
                    cur.next.previous = cur;
                    removed.next = null;
                    removed.previous = null;
                }
                count++;
                cur = cur.next;
            }
        }
        return removed;
    }

}
