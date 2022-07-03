/**
 * LeetCode - jzoffer_103
 * https://leetcode.cn/problems/gaM7Ch/
 */

package me.txie.leetcode.jzoffer_103;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; i++) {
            Arrays.fill(dp[i], amount + 1);
        }
        dp[0][0] = 0;

        for (int i = 1; i <= coins.length; i++) { // 遍历硬币
            for (int j = 0; j <= amount; j++) { // 遍历背包
                for (int k = 0; j >= k * coins[i - 1]; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - k * coins[i - 1]] + k);
                }
            }
        }

        return (dp[coins.length][amount] == (amount + 1)) ? -1 : dp[coins.length][amount];
    }
}
// 时间复杂度：O(ntk)
// 空间复杂度：O(nt)