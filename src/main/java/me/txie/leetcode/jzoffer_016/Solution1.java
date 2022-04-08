/**
 * LeetCode - jzoffer_016
 * https://leetcode-cn.com/problems/wtcaE1/
 */

package me.txie.leetcode.jzoffer_016;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int[] counts = new int[256];
        int longest = 1;
        int begin = -1, end = 0;
        for (; end < s.length(); end++) {
            counts[s.charAt(end)]++;
            while (hasGreaterThanOne(counts)) {
                ++begin;
                counts[s.charAt(begin)]--;
            }
            longest = Math.max(end - begin, longest);
        }
        return longest;
    }

    private boolean hasGreaterThanOne(int[] counts) {
        for (int count : counts) {
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)