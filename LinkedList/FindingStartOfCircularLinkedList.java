package LinkedList;

public class FindingStartOfCircularLinkedList {

    static ListNode<Integer> findingStart(ListNode<Integer> list){
        if(list == null) return null;
        ListNode<Integer> slow = (ListNode<Integer>) list.head;
        ListNode<Integer> fast = (ListNode<Integer>) list.head;
        while (true){
            slow = (ListNode<Integer>) slow.next;
            fast = (ListNode<Integer>) fast.next.next;
            if(slow ==null || fast == null || fast.next ==null){
                return null;
            }
            if(slow == fast){
                ListNode<Integer> temp = (ListNode<Integer>) list.head;
                while (temp != fast){
                    temp = (ListNode<Integer>) temp.next;
                    fast = (ListNode<Integer>) fast.next;
                }
                return temp;
            }
        }
    }
    public static void main(String[] args) {
        ListNode<Integer> intersectionNode = new ListNode<>(40);
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(intersectionNode, l1.size());
        l1.addNode(30);
        l1.addNode(50);
        l1.addNode(60);
        l1.addNode(intersectionNode, l1.size());
        ListNode<Integer> start = findingStart(l1);
        System.out.println(start.data);
    }
}
