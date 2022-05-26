package me.txie.leetcode.jzoffer_071;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    private int[] sums;
    private int total;

    public Solution(int[] w) {
        this.sums = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            total += w[i];
            sums[i] = total;
        }
    }

    public int pickIndex() {
        Random random = new Random();
        int p = random.nextInt(total);
        int lo = 0, hi = sums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (sums[mid] > p) {
                if (mid == 0 || sums[mid - 1] <= p) {
                    return mid;
                }

                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
}
// 时间复杂度：O(logn)
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */