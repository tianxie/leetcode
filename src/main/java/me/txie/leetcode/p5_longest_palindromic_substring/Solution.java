/**
 * LeetCode - p5_longest_palindromic_substring
 */
 
package me.txie.leetcode.p5_longest_palindromic_substring;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    String longestPalindrome(String s);
}
