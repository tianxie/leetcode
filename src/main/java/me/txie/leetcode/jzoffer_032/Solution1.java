/**
 * LeetCode - jzoffer_032
 * https://leetcode-cn.com/problems/dKk3P7/
 */
 
package me.txie.leetcode.jzoffer_032;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s.equals(t)) {
            return false;
        }

        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (counts[c - 'a'] == 0) {
                return false;
            }
            counts[c - 'a']--;
        }

        return true;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)