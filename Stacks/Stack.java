package Stacks;

public class Stack<T> {
    StackNode<T> head;
    static Integer size = 0;

    public Stack() {
    }

    public static class StackNode<T> {
        T data;
        StackNode<T> next;

        StackNode(T data) {
            this.data = data;
        }
    }

    void push(T newData) {
        StackNode<T> stkNde = new StackNode<>(newData);
        stkNde.next = this.head;
        this.head = stkNde;
        size++;
    }

    T pop() {
        if (this.head != null) {
            StackNode<T> r = this.head;
            this.head = this.head.next;
            r.next = null;
            size--;
            return r.data;
        } else return null;
    }

    T peek() {
        if (this.head != null) {
            return this.head.data;
        } else return null;
    }

    Integer size() {
        return this.size;
    }

    void print() {
        StackNode<T> cur = this.head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
