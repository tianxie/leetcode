/**
 * LeetCode - p292_nim_game
 */
package me.txie.leetcode.p292_nim_game;

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
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
