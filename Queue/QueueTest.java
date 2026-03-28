package Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q1 = new Queue<Integer>();
        q1.insert(1);
        System.out.println("Size -> " + q1.size());
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
        System.out.println("-------");
        q1.print();
        System.out.println("--------");
        System.out.println(q1.remove());
        System.out.println("--------");
        q1.print();
    }
}
