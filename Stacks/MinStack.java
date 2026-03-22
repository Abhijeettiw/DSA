package Stacks;

public class MinStack {
    //    Accessing the lowest value of stack in O(1) complexity

    /*
        Theory
            - Create a auxiliary stack to store only lowest val
     */
    static Stack<Integer> stk = new Stack<>();
    static Stack<Integer> auStk = new Stack<>();

    static void add(Integer val){
        if (auStk.head == null) {
            auStk.push(val);
        } else {
            if (auStk.head.data > val){
                auStk.push(val);
            }
        }
        stk.push(val);
    }

    static Integer getMin(){
        return auStk.peek();
    }
    //    static
    public static void main(String[] args) {
        add(2);
        add(5);
        add(1);
        add(3);
        System.out.println(getMin());
        System.out.println("-----");
        auStk.print();
    }
}
