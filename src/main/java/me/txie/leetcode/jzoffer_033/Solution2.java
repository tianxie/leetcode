/**
 * LeetCode - jzoffer_033
 * https://leetcode-cn.com/problems/sfvd7V/
 */
 
package me.txie.leetcode.jzoffer_033;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {
    
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
// 时间复杂度：O(nmlogm)，n个单词，平均每个单词m个字符
// 空间复杂度：O(n)