/**
 * Leetcode - p242_valid_anagram
 */
package me.txie.leetcode.p242_valid_anagram;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    boolean isAnagram(String s, String t);
}
