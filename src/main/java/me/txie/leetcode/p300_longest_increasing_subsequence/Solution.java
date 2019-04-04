/**
 * Leetcode - p300_longest_increasing_subsequence
 */
package me.txie.leetcode.p300_longest_increasing_subsequence;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    int lengthOfLIS(int[] nums);
}
