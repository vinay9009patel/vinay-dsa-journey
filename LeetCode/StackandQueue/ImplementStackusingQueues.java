import java.util.*;
class MyStack {
    Stack<Integer> stak;
    Stack<Integer> temp;

    public MyStack() {
        stak = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x) {
        System.out.println(x);
        // if (stak.empty()) {
        //     stak.push(x);
        //     return;
        // }
        // while (!stak.empty()) {
        //     temp.push(stak.pop());
        // }

        stak.push(x);
        // while (!temp.empty()) {
        //     stak.push(temp.pop());
        // }
        // System.out.println(stak);
    }
    
    public int pop() {
        if (stak.empty()) {
            return -1;
        }

        return stak.pop();
    }
    
    public int top() {
        System.out.println("peek: " + stak.peek());
        return stak.peek();
    }
    
    public boolean empty() {
        return stak.empty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
