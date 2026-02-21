package LinkedList;

public class Impl {
    static void printNode(ListNode<?> head) {
        ListNode<?> cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    static void printNodeReverse(ListNode<?> tail) {
        ListNode<?> cur = tail;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.previous;
        }
    }

    static void addNode(ListNode<?> list, ListNode<?> node) {
        addNode(list, node, list.size());
    }

    static void addNode(ListNode<?> list, ListNode<?> node, Integer pos) {
        ListNode<?> cur = list.head;
        if (pos == 0) {
            node.next = cur;
            cur.previous = node;
            list.head = node;
        } else if (list.size() > pos) {
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
            list.tail = cur.next;
        }
    }

    static ListNode<?> removeElement(ListNode<?> list) {
        return removeElement(list, list.size() - 1);
    }

    static ListNode<?> removeElement(ListNode<?> list, int position) {
        ListNode<?> cur = list.head;
        ListNode<?> removed = null;
        if (position == 0) {
            list.head = list.head.next;
            removed = cur;
            removed.next = null;
        } else if (position < list.size()) {
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

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(10);
        addNode(l1,new ListNode<>(20));
        addNode(l1,new ListNode<>(30));
        addNode(l1,new ListNode<>(40));
        addNode(l1,new ListNode<>(50));
        addNode(l1,new ListNode<>(60));
        printNode(l1.head);
        System.out.println("---------");
        printNodeReverse(l1.tail);
    }
}
