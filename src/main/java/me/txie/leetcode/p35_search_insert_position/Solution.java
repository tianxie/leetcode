/**
 * LeetCode - p35_search_insert_position
 */
 
package me.txie.leetcode.p35_search_insert_position;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    int searchInsert(int[] nums, int target);
}
