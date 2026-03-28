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
        } else {
            QueueNode<T> rem = this.head;
            this.head = this.head.next;
            rem.next = null;
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
