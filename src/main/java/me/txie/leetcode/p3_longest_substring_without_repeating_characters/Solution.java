/**
 * LeetCode - p3_longest_substring_without_repeating_characters
 */
package me.txie.leetcode.p3_longest_substring_without_repeating_characters;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int lengthOfLongestSubstring(String s);
}
