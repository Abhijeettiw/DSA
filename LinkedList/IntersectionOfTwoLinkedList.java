package LinkedList;


public class IntersectionOfTwoLinkedList {

    public static void main(String[] args) {
        ListNode<Integer> intersectionNode = new ListNode<>(40);
        ListNode<Integer> l1 = new ListNode<>(10);
        l1.addNode(20);
        l1.addNode(30);
        l1.addNode(50);
        l1.addNode(intersectionNode, l1.size());
        l1.addNode(60);
        ListNode<Integer> l2 = new ListNode<>(70);
        l2.addNode(intersectionNode, l1.size());

        ListNode<Integer> biggerList = null;
        ListNode<Integer> smallerList = null;
        int sizeDiff = l1.size() - l2.size();
        if (sizeDiff <= 0) {
            biggerList = l2;
            smallerList = l1;
            sizeDiff *= -1;
        } else {
            biggerList = l1;
            smallerList = l2;
        }
        ListNode<Integer> c1 = (ListNode<Integer>) biggerList.head;
        ListNode<Integer> c2 = (ListNode<Integer>) smallerList.head;
        ListNode<Integer> resIntersection = null;
        outer:
        while (c1 != null && c2 != null) {
            while (sizeDiff > 0) {
                c1 = (ListNode<Integer>) c1.next;
                sizeDiff--;
            }
            if (c1.equals(c2)) {
                resIntersection = c1;
                break outer;
            }
            c1 = (ListNode<Integer>) c1.next;
            c2 = (ListNode<Integer>) c2.next;
        }
        System.out.println("Intersection input: " + intersectionNode.data + " --- " + "Result: " + resIntersection.data);
    }

}
