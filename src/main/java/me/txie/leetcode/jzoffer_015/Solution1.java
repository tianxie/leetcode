/**
 * LeetCode - jzoffer_015
 * https://leetcode-cn.com/problems/VabMRr/
 */

package me.txie.leetcode.jzoffer_015;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }

        int[] counts = new int[26];

        for (int i = 0; i < p.length(); i++) {
            counts[p.charAt(i) - 'a']++;
            counts[s.charAt(i) - 'a']--;
        }

        if (areAllZeros(counts)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            counts[s.charAt(i) - 'a']--;
            counts[s.charAt(i - p.length()) - 'a']++;
            if (areAllZeros(counts)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
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
// 时间复杂度：O(n)
// 空间复杂度：O(1)