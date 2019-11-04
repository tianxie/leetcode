/**
 * LeetCode - p138_copy_list_with_random_pointer
 */
 
package me.txie.leetcode.p138_copy_list_with_random_pointer;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    Node copyRandomList(Node head);
}
