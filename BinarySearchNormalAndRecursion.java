import java.util.Arrays;

public class BinarySearchNormalAndRecursion {

    static Integer binarySearchRecursion(int left, int right, int target, int[] array) {
        int mid = left + (right - left) / 2;
        int index = -1;
        if (left <= right) {
            if (array[mid] == target) {
                index = mid;
                return index;
            }
            if (array[mid] < target) left = mid + 1;
            if (array[mid] > target) right = mid - 1;
            index = binarySearchRecursion(left,right,target,array);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 2, 4, 10, 7, 5, 4, 16, 58, 79, 23, 54, 12, 6, 9, 10};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int target = 16;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                System.out.println(mid);
            }
            if (array[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println(binarySearchRecursion(0,array.length-1,target,array));
        System.out.println(Arrays.binarySearch(array,target));
    }
}
