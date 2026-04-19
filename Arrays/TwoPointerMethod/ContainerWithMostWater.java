package Arrays.TwoPointerMethod;

public class ContainerWithMostWater {

    static int twoPointer(int[] arr) {
        int val = 0, start = 0, end = arr.length - 1;
        while (start < end) {
            int gap = end - start;
            int height = arr[end];
            if (height > arr[start]) {
                height = arr[start];
                start++;
            } else {
                end--;
            }
            int area = height * gap;
            val = Math.max(val, area);
        }
        return val;
    }

    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 1};
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(twoPointer(arr));
    }
}
