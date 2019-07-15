/**
 * LeetCode - p13_roman_to_integer
 */
 
package me.txie.leetcode.p13_roman_to_integer;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    int romanToInt(String s);
}
