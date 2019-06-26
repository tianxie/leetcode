/**
 * LeetCode - p220_contains_duplicate_iii
 */
package me.txie.leetcode.p220_contains_duplicate_iii;

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
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        // TODO
        return false;
    }

    private class Node {
        private int key;
        private int val;
        private Node left, right;


    }
}
