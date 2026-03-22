package Stacks;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<>();
        stk1.push(1);
        stk1.push(2);
        stk1.push(3);
        stk1.push(4);
        stk1.push(5);
        stk1.print();
        System.out.println("---------");
        System.out.println(stk1.pop());
        System.out.println("---------");
        stk1.print();
        System.out.println("---------");
        System.out.println(stk1.peek());
    }
}
