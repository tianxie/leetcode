/**
 * LeetCode - p2_add_two_numbers
 */
package me.txie.leetcode.p2_add_two_numbers;

import me.txie.leetcode.util.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode addTwoNumbers(ListNode l1, ListNode l2);
}
