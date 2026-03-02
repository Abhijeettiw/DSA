package LinkedList;

public class ReversingSinglyLinkedList {
    static ListNode<Integer> reverseLinkedList(ListNode<Integer> list) {
        ListNode<Integer> cur = (ListNode<Integer>) list.head;
        ListNode<Integer> result = null;
        while (cur != null) {
            ListNode<Integer> temp = result;
            result = new ListNode<>(cur.data);
            result.next = temp;
            cur = (ListNode<Integer>) cur.next;
        }
        return result;
    }

    static ListNode<Integer> reverseLinkedListRecursion(ListNode<Integer> list) {
        if(list == null || list.next == null){
            return list;
        }
        ListNode<Integer> newHead = reverseLinkedListRecursion((ListNode<Integer>) list.next);
        list.next.next = list;
        list.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(30);
        l1.addNode(40);
        l1.addNode(50);
        l1.addNode(60);
        l1.addNode(70);
        l1.addNode(80);
        ListNode<Integer> reverseList = reverseLinkedList(l1);
        reverseList.printNode();
        ListNode<Integer> reverseLinkedListWithRecursion = reverseLinkedListRecursion(l1);
        System.out.println("-------");
        reverseLinkedListWithRecursion.printNode();
    }
}
