/**
 * LeetCode - p163_missing_ranges
 */
 
package me.txie.leetcode.p163_missing_ranges;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    List<String> findMissingRanges(int[] vals, int start, int end);
}
