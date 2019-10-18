/**
 * LeetCode - p24_swap_nodes_in_pairs
 */
 
package me.txie.leetcode.p24_swap_nodes_in_pairs;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    ListNode swapPairs(ListNode head);
}
