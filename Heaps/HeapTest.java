package Heaps;

import java.util.PriorityQueue;

public class HeapTest {
    public static void main(String[] args) {
//        Heaps minHeap = new MinHeap();
//        minHeap.offer(1);
//        minHeap.offer(4);
//        minHeap.offer(3);
//        minHeap.offer(2);
//        minHeap.offer(8);
//        minHeap.offer(7);
//        minHeap.offer(5);
//        minHeap.offer(-1);
//        minHeap.offer(6);
//        System.out.println(minHeap.innerList);
//        Integer poll1 = minHeap.poll();
//        System.out.println(poll1);
//        System.out.println(minHeap.innerList);
//        Integer poll2 = minHeap.poll();
//        System.out.println(poll2);
//        System.out.println(minHeap.innerList);

//        Heaps maxHeap = new MaxHeap();
//        maxHeap.offer(1);
//        maxHeap.offer(4);
//        maxHeap.offer(3);
//        maxHeap.offer(2);
//        maxHeap.offer(8);
//        maxHeap.offer(7);
//        maxHeap.offer(5);
//        maxHeap.offer(-1);
//        maxHeap.offer(6);
//        System.out.println(maxHeap.innerList);
//        Integer poll3 = maxHeap.poll();
//        System.out.println(poll3);
//        System.out.println(maxHeap.innerList);
//        Integer poll4 = maxHeap.poll();
//        System.out.println(poll4);
//        System.out.println(maxHeap.innerList);

        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        max.offer(1);
        max.offer(4);
        max.offer(3);
        max.offer(2);
        max.offer(8);
        max.offer(7);
        max.offer(5);
        max.offer(-1);
        max.offer(6);
        System.out.println(max);
        Integer poll3 = max.poll();
        System.out.println(poll3);
        System.out.println(max);
        Integer poll4 = max.poll();
        System.out.println(poll4);
        System.out.println(max);
        PriorityQueue<Integer> min = new PriorityQueue<>();
        min.offer(1);
        min.offer(4);
        min.offer(3);
        min.offer(2);
        min.offer(8);
        min.offer(7);
        min.offer(5);
        min.offer(-1);
        min.offer(6);
        System.out.println(min);
        Integer poll1 = min.poll();
        System.out.println(poll1);
        System.out.println(min);
        Integer poll2 = min.poll();
        System.out.println(poll2);
        System.out.println(min);
    }
}
