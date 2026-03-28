package Stacks;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] arr = {"4", "15", "5", "/", "+"};
//        String[] arr = {"2", "1", "+", "3", "*"};
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == "*" || arr[i] == "+" || arr[i] == "-" || arr[i] == "/")) {
                stk.push(Integer.parseInt(arr[i]));
            } else {
                int ans = 0;
                int a = stk.pop();
                int b = stk.pop();
                if (arr[i] == "+") {
                    ans = a + b;
                } else if (arr[i] == "-") {
                    ans = a - b;
                } else if (arr[i] == "*") {
                    ans = a * b;
                } else {
                    ans = a / b;
                }
                stk.push(ans);
            }
        }
        System.out.println(stk.peek());
    }
}
