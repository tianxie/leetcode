/**
 * LeetCode - jzoffer_003
 * https://leetcode-cn.com/problems/counting-bits/
 */
 
package me.txie.leetcode.jzoffer_003;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {
    
    @Override
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // 整数 i 的二进制形式中 1 的个数，比整数 i & (i - 1) 的
            // 二进制形式中 1 的个数多 1
            result[i] = result[i & (i - 1)] + 1;
        }
        return result;
    }
}
// 动态规划法
// 时间复杂度：O(n)
// 空间复杂度：