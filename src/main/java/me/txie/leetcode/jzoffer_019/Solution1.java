/**
 * LeetCode - jzoffer_019
 * https://leetcode-cn.com/problems/RQku0D/
 */

package me.txie.leetcode.jzoffer_019;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() / 2) {
            if (s.charAt(start) != s.charAt(end)) {
                break;
            }
            start++;
            end--;
        }
        return start == s.length() / 2 // s本身是回文字符串
            || isPalindrome(s, start + 1, end) // 删除下标为start的字符
            || isPalindrome(s, start, end - 1); // 删除下标为end的字符
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
// 时间复杂度：
// 空间复杂度：