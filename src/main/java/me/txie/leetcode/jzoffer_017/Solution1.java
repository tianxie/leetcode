/**
 * LeetCode - jzoffer_017
 * https://leetcode-cn.com/problems/M1oyTv/
 */

package me.txie.leetcode.jzoffer_017;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
class Solution1 implements Solution {

    @Override
    public String minWindow(String s, String t) {
        Map<Character, Integer> charToCount = new HashMap<>();
        for (char ch : t.toCharArray()) {
            charToCount.put(ch, charToCount.getOrDefault(ch, 0) + 1);
        }

        int count = charToCount.size(); // 出现在字符串t中但还没有出现在字符串s中的子字符串中的字符的个数
        int start = 0, end = 0, minStart = 0, minEnd = 0;
        int minLength = Integer.MAX_VALUE;
        while (end < s.length() || (count == 0 && end == s.length())) {
            if (count > 0) {
                char endChar = s.charAt(end);
                if (charToCount.containsKey(endChar)) {
                    charToCount.put(endChar, charToCount.get(endChar) - 1);
                    if (charToCount.get(endChar) == 0) {
                        count--;
                    }
                }

                end++;
            } else {
                // 当count为0时，start和end之间的子字符串包含t中的所有字符
                if (end - start < minLength) {
                    minLength = end - start;
                    minStart = start;
                    minEnd = end;
                }

                char startChar = s.charAt(start);
                if (charToCount.containsKey(startChar)) {
                    charToCount.put(startChar, charToCount.get(startChar) + 1);
                    if (charToCount.get(startChar) == 1) {
                        count++;
                    }
                }

                start++;
            }
        }
        return minLength < Integer.MAX_VALUE
            ? s.substring(minStart, minEnd)
            : "";
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)