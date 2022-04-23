/**
 * LeetCode - jzoffer_033
 * https://leetcode-cn.com/problems/sfvd7V/
 */

package me.txie.leetcode.jzoffer_033;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        // 每个字母对应一个质数
        int[] hash = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
            43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        Map<Long, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            long hashCode = 1;
            for (char ch : s.toCharArray()) {
                hashCode *= hash[ch - 'a'];  // 单词太长，可能溢出
            }
            groups.putIfAbsent(hashCode, new ArrayList<>());
            groups.get(hashCode).add(s);
        }
        
        return new ArrayList<>(groups.values());
    }
}
// 时间复杂度：O(mn)，n个单词，平均每个单词m个字母
// 空间复杂度：O(n)