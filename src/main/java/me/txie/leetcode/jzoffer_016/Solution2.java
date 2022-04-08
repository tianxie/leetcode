/**
 * LeetCode - jzoffer_016
 * https://leetcode-cn.com/problems/wtcaE1/
 */

package me.txie.leetcode.jzoffer_016;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int[] counts = new int[256];
        int longest = 1;
        int begin = -1, end = 0; // 双指针
        int duplication = 0; // 当前子字符串出现重复字符的个数
        for (; end < s.length(); end++) {
            counts[s.charAt(end)]++;
            if (counts[s.charAt(end)] == 2) { // 从1变成2
                duplication++;
            }
            
            while (duplication > 0) {
                ++begin;
                counts[s.charAt(begin)]--;
                if(counts[s.charAt(begin)] == 1) { // 从2变成1
                    duplication--;
                }
            }
            
            longest = Math.max(end - begin, longest);
        }
        
        return longest;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)