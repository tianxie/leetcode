/**
 * LeetCode - jzoffer_034
 * https://leetcode-cn.com/problems/lwyVBB/
 */

package me.txie.leetcode.jzoffer_034;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderArray = new int[order.length()];
        for (int i = 0; i < order.length(); i++) {
            orderArray[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!isSorted(words[i], words[i + 1], orderArray)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(String word1, String word2, int[] orderArray) {
        int i = 0;
        for (; i < word1.length() && i < word2.length(); i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            if (orderArray[ch1 - 'a'] < orderArray[ch2 - 'a']) {
                return true;
            }

            if (orderArray[ch1 - 'a'] > orderArray[ch2 - 'a']) {
                return false;
            }
        }
        return i == word1.length();
    }
}
// 时间复杂度：O(mn)，n个单词，平均每个单词m个字符
// 空间复杂度：O(1)