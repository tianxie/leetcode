package me.txie.leetcode.jzoffer_041;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private Queue<Integer> queue;
    private int capacity;
    private int sum;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        capacity = size;
        sum = 0;
    }

    public double next(int val) {
        queue.offer(val);
        sum += val;
        if (queue.size() > capacity) {
            sum -= queue.poll();
        }

        return (double) sum / queue.size();
    }

    /**
     * Your MovingAverage object will be instantiated and called as such:
     * MovingAverage obj = new MovingAverage(size);
     * double param_1 = obj.next(val);
     */
    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1)); // 返回 1.0 = 1 / 1
        System.out.println(movingAverage.next(10)); // 返回 5.5 = (1 + 10) / 2
        System.out.println(movingAverage.next(3)); // 返回 4.66667 = (1 + 10 + 3) / 3
        System.out.println(movingAverage.next(5)); // 返回 6.0 = (10 + 3 + 5) / 3
    }
}
