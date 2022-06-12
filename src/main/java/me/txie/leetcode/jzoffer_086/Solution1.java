/**
 * LeetCode - jzoffer_086
 * https://leetcode.cn/problems/M99OJA/
 */

package me.txie.leetcode.jzoffer_086;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;
import sun.awt.image.ImageWatched;

@Slf4j
class Solution1 implements Solution {

    @Override
    public String[][] partition(String s) {
        List<List<String>> result = new LinkedList<>();
        helper(s, 0, new LinkedList<>(), result);
        return result.stream()
            .map(list -> list.toArray(new String[0]))
            .toArray(String[][]::new);
    }

    private void helper(String s, int start, LinkedList<String> substrings, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new LinkedList<>(substrings));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                substrings.add(s.substring(start, i + 1));
                helper(s, i + 1, substrings, result);
                substrings.removeLast();
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
// 时间复杂度：
// 空间复杂度：