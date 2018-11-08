/**
 * Leetcode - jewels_and_stones
 */
package me.txie.leetcode.jewels_and_stones;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    int numJewelsInStones(String J, String S);
}
