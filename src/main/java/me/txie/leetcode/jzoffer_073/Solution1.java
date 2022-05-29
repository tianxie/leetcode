/**
 * LeetCode - jzoffer_073
 * https://leetcode.cn/problems/nZZqjQ/
 */

package me.txie.leetcode.jzoffer_073;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i : piles) {
            max = Math.max(i, max);
        }

        int lo = 1, hi = max;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int hours = getHours(piles, mid);
            if (hours <= h) {
                if (mid == 1 || getHours(piles, mid - 1) > h) {
                    return mid;
                }

                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    private int getHours(int[] piles, int speed) {
        int hours = 0;
        for (int i : piles) {
            hours += (i + speed - 1) / speed;
        }
        return hours;
    }
}
// 时间复杂度：mlogn，m堆香蕉，最大一堆有n个香蕉
// 空间复杂度：