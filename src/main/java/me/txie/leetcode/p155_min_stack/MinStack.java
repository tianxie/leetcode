package me.txie.leetcode.p155_min_stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {

    private Deque<Integer> data;
    private Deque<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        data = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int x) {
        data.addFirst(x);
        if (minStack.isEmpty() || x < minStack.peekFirst()) {
            minStack.addFirst(x);
        } else {
            minStack.addFirst(minStack.peekFirst());
        }
    }

    public void pop() {
        data.removeFirst();
        minStack.removeFirst();
    }

    public int top() {
        return data.peekFirst();
    }

    public int getMin() {
        return minStack.peekFirst();
    }
}


