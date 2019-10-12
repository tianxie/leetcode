/**
 * LeetCode - p136_single_number
 */
 
package me.txie.leetcode.p136_single_number;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    int singleNumber(int[] nums);
}
