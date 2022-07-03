package me.txie.leetcode.jzoffer_103;

public class Solution3 implements Solution {
    @Override
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
// 时间复杂度：O(nt)
// 空间复杂度：O(t)
// n是硬币的种类数，t是目标总额。