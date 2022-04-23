/**
 * LeetCode - jzoffer_032
 * https://leetcode-cn.com/problems/dKk3P7/
 */

package me.txie.leetcode.jzoffer_032;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s.equals(t)) {
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!counts.containsKey(c) || counts.get(c) == 0) {
                return false;
            }

            counts.put(c, counts.get(c) - 1);
        }
        return true;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)