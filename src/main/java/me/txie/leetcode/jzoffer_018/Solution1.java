/**
 * LeetCode - jzoffer_018
 * https://leetcode-cn.com/problems/XltzEq/
 */

package me.txie.leetcode.jzoffer_018;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public boolean isPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            char loCh = s.charAt(lo);
            char hiCh = s.charAt(hi);
            if (!Character.isLetterOrDigit(loCh)) {
                lo++;
            } else if (!Character.isLetterOrDigit(hiCh)) {
                hi--;
            } else {
                if (Character.toLowerCase(loCh) != Character.toLowerCase(hiCh)) {
                    return false;
                }
                lo++;
                hi--;
            }
        }
        return true;
    }
}
// 时间复杂度：
// 空间复杂度：