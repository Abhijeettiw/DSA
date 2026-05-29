package BinarySearch;

public class SearchInRotatedSortedArray {
    static int binarySearch(int[] arr, int target, int s, int e) {
        if (s <= e) {
            int mid = (e + s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, e);
            } else {
                return binarySearch(arr, target, s, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 11, 1, 2, 3, 4, 5, 6, 7};
        int target = 11;
        int lowestEleIdx = 0;
        int s = 0, e = arr.length - 1, idx = -1;
        while (s <= e) {
            int mid = (e + s) / 2;
            if (arr[mid] < arr[lowestEleIdx]) {
                e = mid - 1;
                lowestEleIdx = mid;
            } else {
                s = mid + 1;
            }
        }
        if (arr[lowestEleIdx] == target) {
            idx = lowestEleIdx;
        } else if (arr[lowestEleIdx] < target && target <= arr[arr.length - 1]) {
            idx = binarySearch(arr, target, lowestEleIdx, arr.length - 1);
        } else {
            idx = binarySearch(arr, target, 0, lowestEleIdx - 1);
        }
        System.out.println(idx);
    }
}
