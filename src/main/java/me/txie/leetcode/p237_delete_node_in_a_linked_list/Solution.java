/**
 * LeetCode - p237_delete_node_in_a_linked_list
 */
package me.txie.leetcode.p237_delete_node_in_a_linked_list;

import java.util.*;

import me.txie.leetcode.util.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    void deleteNode(ListNode node);
}
