/**
 * LeetCode - jzoffer_080
 * https://leetcode.cn/problems/uUsW3B/
 */

package me.txie.leetcode.jzoffer_080;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> combination = new LinkedList<>();
        helper(1, n, k, combination, result);
        return result;
    }

    private void helper(int i, int n, int k, LinkedList<Integer> combination, List<List<Integer>> result) {
        if (combination.size() == k) {
            result.add(new LinkedList<>(combination));
        } else if (i <= n) {
            helper(i + 1, n, k, combination, result);

            combination.add(i);
            helper(i + 1, n, k, combination, result);
            combination.removeLast();
        }
    }
}
// 时间复杂度：
// 空间复杂度：