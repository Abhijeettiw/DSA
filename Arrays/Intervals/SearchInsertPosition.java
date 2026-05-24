package Arrays.Intervals;

public class SearchInsertPosition {

    static int bruteForce(int[] arr, int target) {
//        Using binary search
        if (arr[0] > target) {
            return 0;
        }
        if (arr[arr.length - 1] < target) {
            return arr.length;
        }
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(bruteForce(arr, target));
    }
}
