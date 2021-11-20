/**
 * LeetCode - jzoffer_001
 * https://leetcode-cn.com/problems/xoh6Oh/
 */

package me.txie.leetcode.jzoffer_001;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;


@Slf4j
class Solution1 implements Solution {

    @Override
    public int divide(int dividend, int divisor) {
        // 考虑溢出的情况
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // 转成两个负数的除法
        int negative = 2;
        if (dividend > 0) {
            negative--;
            dividend = -dividend;
        }

        if (divisor > 0) {
            negative--;
            divisor = -divisor;
        }

        // 使用减法实现两个负数的除法
        int result = divideCore(dividend, divisor);
        return negative == 1 ? -result : result;
    }

    private int divideCore(int dividend, int divisor) {
        int result = 0;

        // 前面已经将被除数和除数转成两个负数，此处用小于等于
        while (dividend <= divisor) {
            int value = divisor;
            int quotient = 1;
            // 0xc0000000是Integer.MIN_VALUE的一半
            while (value >= 0xc0000000 && dividend <= value + value) {
                quotient += quotient;
                value += value;
            }
            result += quotient;
            dividend -= value;
        }
        return result;
    }
}
// 时间复杂度：O(logn)
// 空间复杂度：