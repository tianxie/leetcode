/**
 * LeetCode - p922_sort_array_by_parity_ii
 */
package me.txie.leetcode.p922_sort_array_by_parity_ii;

import java.util.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution1 implements Solution {


    @Override
    public int[] sortArrayByParityII(int[] A) {
        Queue oddQueue = new Queue(A.length / 2);
        Queue evenQueue = new Queue(A.length / 2);

        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 1 && A[i] % 2 == 0) oddQueue.enqueue(i);
            if (i % 2 == 0 && A[i] % 2 == 1) evenQueue.enqueue(i);
            if (!oddQueue.isEmpty() && !evenQueue.isEmpty()) {
                int odd = oddQueue.dequeue();
                int even = evenQueue.dequeue();
                int temp = A[odd];
                A[odd] = A[even];
                A[even] = temp;
            }
        }
        return A;
    }

    class Queue {
        private int[] a;
        private int head;
        private int tail;

        Queue(int capacity) {
            a = new int[capacity];
            head = 0;
            tail = 0;
        }

        void enqueue(int n) {
            a[tail++] = n;
        }

        int dequeue() {
            return a[head++];
        }

        boolean isEmpty() {
            return head == tail;
        }
    }
}
