/**
 * LeetCode - jzoffer_085
 * https://leetcode.cn/problems/IDBivT/
 */

package me.txie.leetcode.jzoffer_085;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        helper(n, n, "", result);
        return result;
    }

    private void helper(int left, int right, String parenthesis, List<String> result) {
        // left和right分别表示还要生成的左右括号的数目
        if (left == 0 && right == 0) {
            result.add(parenthesis);
            return;
        }

        if (left > 0) {
            helper(left - 1, right, parenthesis + "(", result);
        }
        if (left < right) {
            helper(left, right - 1, parenthesis + ")", result);
        }
    }
}
// 时间复杂度：
// 空间复杂度：