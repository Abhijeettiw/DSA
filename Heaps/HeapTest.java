package Heaps;

public class HeapTest {
    public static void main(String[] args) {
        Heaps heap = new MinHeap();
        heap.offer(1);
        heap.offer(4);
        heap.offer(3);
        heap.offer(2);
        heap.offer(8);
        heap.offer(7);
        heap.offer(5);
        heap.offer(-1);
        heap.offer(6);
        System.out.println(heap.innerList);
    }
}
