/**
 * LeetCode - p26_remove_duplicates_from_sorted_array
 */
package me.txie.leetcode.p26_remove_duplicates_from_sorted_array;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int removeDuplicates(int[] nums);
}
