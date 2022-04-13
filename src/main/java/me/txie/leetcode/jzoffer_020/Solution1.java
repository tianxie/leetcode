/**
 * LeetCode - jzoffer_020
 * https://leetcode-cn.com/problems/a7VOhD/
 */

package me.txie.leetcode.jzoffer_020;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int countSubstrings(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += countPalindrome(s, i, i); // 以第i个字符为中心的回文字符串数
            result += countPalindrome(s, i, i + 1); // 以第i和i+1个字符为中心的回文字符串数
        }
        return result;
    }

    private int countPalindrome(String s, int start, int end) {
        int count = 0;
        while (start >= 0 && end < s.length()
            && s.charAt(start) == s.charAt(end)) {
            count++;
            start--;
            end++;
        }
        return count;
    }
}
// 时间复杂度：O(n^2)
// 空间复杂度：O(1)