/**
 * LeetCode - p53_maximum_subarray
 */
 
package me.txie.leetcode.p53_maximum_subarray;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    int maxSubArray(int[] nums);
}
