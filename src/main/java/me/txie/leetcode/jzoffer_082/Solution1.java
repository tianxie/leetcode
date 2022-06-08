/**
 * LeetCode - jzoffer_082
 * https://leetcode.cn/problems/4sjJUc/
 */

package me.txie.leetcode.jzoffer_082;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // 先对数组排序
        List<List<Integer>> result = new LinkedList<>();
        helper(candidates, target, 0, new LinkedList<Integer>(), result);
        return result;
    }

    private void helper(int[] candidates, int target, int i,
                        LinkedList<Integer> combinations, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new LinkedList<>(combinations));
        } else if (target > 0 && i < candidates.length) {
            helper(candidates, target, getNext(candidates, i), combinations, result);

            combinations.addLast(candidates[i]);
            helper(candidates, target - candidates[i], i + 1, combinations, result);
            combinations.removeLast();
        }
    }

    private int getNext(int[] candidates, int index) {
        int next = index;
        while (next < candidates.length && candidates[next] == candidates[index]) {
            next++;
        }
        return next;
    }
}
// 时间复杂度：
// 空间复杂度：