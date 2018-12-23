/**
 * Leetcode - p258_add_digit
 */
package me.txie.leetcode.p258_add_digit;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution2 implements Solution {


    @Override
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        do {
            int digitSum = 0;
            while (num > 0) {
                digitSum += (num % 10);
                num /= 10;
            }
            num = digitSum;
        } while (num >= 10);
        return num;
    }
}
