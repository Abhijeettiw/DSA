package Heaps;

public class HeapTest {
    public static void main(String[] args) {
        Heaps minHeap = new MinHeap();
        minHeap.offer(1);
        minHeap.offer(4);
        minHeap.offer(3);
        minHeap.offer(2);
        minHeap.offer(8);
        minHeap.offer(7);
        minHeap.offer(5);
        minHeap.offer(-1);
        minHeap.offer(6);
        System.out.println(minHeap.innerList);
        Integer poll1 = minHeap.poll();
        System.out.println(poll1);
        System.out.println(minHeap.innerList);
        Integer poll2 = minHeap.poll();
        System.out.println(poll2);
        System.out.println(minHeap.innerList);
    }
}
