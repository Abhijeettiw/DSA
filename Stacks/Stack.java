package Stacks;

public class Stack<T> {
    StackNode<T> head;

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
    }

    void print() {
        StackNode<T> cur = this.head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
