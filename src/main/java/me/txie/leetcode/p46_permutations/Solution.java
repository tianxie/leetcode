/**
 * Leetcode - p46_permutations
 */
package me.txie.leetcode.p46_permutations;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    List<List<Integer>> permute(int[] nums);
}
