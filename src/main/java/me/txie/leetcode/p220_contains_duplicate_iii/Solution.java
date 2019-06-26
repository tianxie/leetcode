/**
 * LeetCode - p220_contains_duplicate_iii
 */
package me.txie.leetcode.p220_contains_duplicate_iii;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t);
}
