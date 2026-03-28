package Stacks;

import java.util.Arrays;

public class NextGreaterElementWithCircularLoop {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 6, 1, 3};
        java.util.Stack<Integer> stk = new java.util.Stack<>();
        stk.push(0);
        int[] res = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            while (stk.size() > 0 && arr[stk.peek()] < arr[i]) {
                res[stk.peek()] = arr[i];
                stk.pop();
            }
            stk.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            while (stk.size() > 0 && arr[stk.peek()] < arr[i]) {
                res[stk.peek()] = arr[i];
                stk.pop();
            }
        }
        while (stk.size() > 0) {
            res[stk.peek()] = -1;
            stk.pop();
        }

        System.out.println(Arrays.toString(res));
    }
}
