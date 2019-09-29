/**
 * LeetCode - p72_edit_distance
 */
 
package me.txie.leetcode.p72_edit_distance;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    int minDistance(String word1, String word2);
}
