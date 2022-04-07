/**
 * LeetCode - jzoffer_014
 * https://leetcode-cn.com/problems/MPnaiL/
 */

package me.txie.leetcode.jzoffer_014;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
            counts[s2.charAt(i) - 'a']--;
        }

        if (areAllZeros(counts)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            counts[s2.charAt(i) - 'a']--;
            counts[s2.charAt(i - s1.length()) - 'a']++;
            if (areAllZeros(counts)) {
                return true;
            }
        }

        return false;
    }

    private boolean areAllZeros(int[] counts) {
        for (int i : counts) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
// 时间复杂度：O(m+n)，m和n分别是s1和s2的长度
// 空间复杂度：O(1)