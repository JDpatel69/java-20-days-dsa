import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        // push to minStack if it is empty or val <= current min
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = stack.pop();

        // if removed element is current minimum, pop from minStack
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    // MAIN METHOD (for VS Code testing)
    public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(3);

        System.out.println(ms.getMin()); // 3
        ms.pop();
        System.out.println(ms.getMin()); // 3
        ms.pop();
        System.out.println(ms.getMin()); // 3
        ms.pop();
        System.out.println(ms.getMin()); // 5
    }
}