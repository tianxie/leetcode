/**
 * LeetCode - p119_pascals_triangle_ii
 */
package me.txie.leetcode.p119_pascals_triangle_ii;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Integer> getRow(int rowIndex);
}
