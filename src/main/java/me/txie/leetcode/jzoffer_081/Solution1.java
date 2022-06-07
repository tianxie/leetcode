/**
 * LeetCode - jzoffer_081
 * https://leetcode.cn/problems/Ygoe9J/
 */

package me.txie.leetcode.jzoffer_081;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        helper(candidates, target, 0, new LinkedList<Integer>(), result);
        return result;
    }

    private void helper(int[] candidates, int target, int i,
                        LinkedList<Integer> combinations, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new LinkedList<>(combinations));
        } else if (target > 0 && i < candidates.length) {
            helper(candidates, target, i + 1, combinations, result);

            combinations.add(candidates[i]);
            helper(candidates, target - candidates[i], i, combinations, result);
            combinations.removeLast();
        }
    }
}
// 时间复杂度：
// 空间复杂度：