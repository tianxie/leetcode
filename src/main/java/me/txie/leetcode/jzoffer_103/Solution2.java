/**
 * LeetCode - jzoffer_103
 * https://leetcode.cn/problems/gaM7Ch/
 */

package me.txie.leetcode.jzoffer_103;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int j = amount; j >= 1; j--) {
                for (int k = 1; k * coin <= j; k++) {
                    dp[j] = Math.min(dp[j], dp[j - k * coin] + k);
                }
            }
        }
        return (dp[amount] > amount) ? -1 : dp[amount];
    }
}
// 时间复杂度：O(ntk)
// 空间复杂度：O(t)