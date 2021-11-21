/**
 * LeetCode - jzoffer_003
 * https://leetcode-cn.com/problems/counting-bits/
 */

package me.txie.leetcode.jzoffer_003;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int num = i;
            while (num != 0) {
                result[i]++;
                num = num & (num -1); // n & (n - 1) 把 n 的二进制表示中最右边的 1 变成 0
            }
        }
        return result;
    }
}
// 时间复杂度：O(nk)，k 是二进制表示中 1 的个数
// 空间复杂度：O(n)