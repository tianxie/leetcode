/**
 * LeetCode - p21_merge_two_sorted_lists
 */
 
package me.txie.leetcode.p21_merge_two_sorted_lists;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    ListNode mergeTwoLists(ListNode l1, ListNode l2);
}
