import java.util.Stack;

/**
 * 面试题30. 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * */
public class MinStack_30 {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack_30() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.size() == 0 || minStack.peek() > x) {
            minStack.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (minStack.size() != 0 && minStack.peek() == x) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }


}
