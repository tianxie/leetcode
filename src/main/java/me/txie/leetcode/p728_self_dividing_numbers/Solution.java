/**
 * Leetcode - p728_self_dividing_numbers
 */
package me.txie.leetcode.p728_self_dividing_numbers;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    List<Integer> selfDividingNumbers(int left, int right);
}
