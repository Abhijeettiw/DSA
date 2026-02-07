import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class KClosest {
    //    Using heap
    static int[][] kClosestHeap(int[][] points, int k) {
        // Max Heap: farthest point at the top
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );
        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove farthest
            }
        }
        int[][] result = new int[k][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            result[i++] = maxHeap.poll();
        }
        return result;
    }

    //    Quick sort
    static int dist(int[] innerArr, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res + (innerArr[i] * innerArr[i]);
        }
        return res;
    }

    static int partition(int[][] arr, int low, int high, int n) {
        int pivotIndex = low + new Random().nextInt(high - low + 1);
        int pivot = dist(arr[pivotIndex], n);
        int i = low - 1;
        for (int j = 0; j < arr.length; j++) {
            if (dist(arr[j], n) < pivot) {
                i++;
                int[] temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int[] temp = arr[i + 1];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;
    }

    static void quickSort(int[][] arr, int low, int high, int n) {
        if (low < high) {
            int partition = partition(arr, low, high, n);
            quickSort(arr, low, partition - 1, n);
            quickSort(arr, partition + 1, high, n);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {-2, 2}, {5, 8}};
        int n = 2;
        int[][] heapRes = kClosestHeap(arr, n);
        for (int[] hr : heapRes) {
            System.out.print(Arrays.toString(hr) + " ");
        }

        System.out.println();

        int[][] quickSortRes = new int[n][n];
        quickSort(arr, 0, arr.length - 1, n);
        for (int i = 0; i < n; i++) {
            quickSortRes[i] = arr[i];
        }
        for (int[] hr : arr) {
            System.out.print(Arrays.toString(hr) + " ");
        }
        System.out.println();
        for (int[] hr : quickSortRes) {
            System.out.print(Arrays.toString(hr) + " ");
        }
    }
}
