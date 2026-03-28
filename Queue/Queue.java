package Queue;

public class Queue<T> {

    private QueueNode<T> head;
    static private Integer size = 0;

    Queue() {
    }

    public void insert(T data) {
        if (this.head == null) {
            this.head = new QueueNode<T>(data);
        } else {
            QueueNode<T> cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new QueueNode<>(data);
        }
        size++;
    }

    public T remove() {
        if (this.head == null) {
            return null;
        } else if (size() == 1) {
            QueueNode<T> cur = this.head;
            this.head = null;
            return cur.data;
        } else {
            QueueNode<T> cur = this.head;
            int count = 1;
            QueueNode<T> rem = null;
            while (cur != null) {
                if (count == size() - 1) {
                    rem = cur.next;
                    cur.next = null;
                }
                count++;
                cur = cur.next;
            }
            size--;
            return rem.data;
        }
    }

    public Integer size() {
        return size;
    }

    public void print() {
        QueueNode<T> cur = this.head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    private static class QueueNode<T> {
        T data;
        QueueNode<T> next;

        private QueueNode(T data) {
            this.data = data;
        }
    }
}
