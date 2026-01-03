
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        int result = -1;
        for(int i = 0 ;i<arr.length; i++){
            if(arr[i]==target){
                result= i;
                break;
            } else if(arr[i]>target){
                result = i;
                break;
            }
        }
        if (result == -1)
            result = arr.length;
        System.out.println(result);
    }

}
