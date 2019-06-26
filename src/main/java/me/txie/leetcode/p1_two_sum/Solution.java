/**
 * LeetCode - p1_two_sum
 */
package me.txie.leetcode.p1_two_sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    Logger log = LoggerFactory.getLogger(Solution.class);

    int[] twoSum(int[] nums, int target);
}
