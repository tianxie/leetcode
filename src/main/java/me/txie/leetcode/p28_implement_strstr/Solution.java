/**
 * LeetCode - p28_implement_strstr
 */
package me.txie.leetcode.p28_implement_strstr;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int strStr(String haystack, String needle);
}
