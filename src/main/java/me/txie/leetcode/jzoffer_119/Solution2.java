/**
 * LeetCode - jzoffer_119
 * https://leetcode.cn/problems/WhsWhI/
 */

package me.txie.leetcode.jzoffer_119;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> fathers = new HashMap<>(); // 记录每个整数所在子集的父节点
        Map<Integer, Integer> counts = new HashMap<>(); // 记录以某个整数为根节点的子集中整数的数目
        Set<Integer> all = new HashSet<>();
        for (int num : nums) {
            fathers.put(num, num);
            counts.put(num, 1);
            all.add(num);
        }

        for (int num : nums) {
            if (all.contains(num + 1)) {
                union(fathers, counts, num, num + 1);
            }

            if (all.contains(num - 1)) {
                union(fathers, counts, num, num - 1);
            }
        }

        int longest = 0;
        for (int length : counts.values()) {
            longest = Math.max(longest, length);
        }
        return longest;
    }

    private void union(Map<Integer, Integer> fathers, Map<Integer, Integer> counts, int i, int j) {
        int fatherOfI = findFather(fathers, i);
        int fatherOfJ = findFather(fathers, j);
        if (fatherOfI != fatherOfJ) {
            fathers.put(fatherOfI, fatherOfJ);

            int countOfI = counts.get(fatherOfI);
            int countOfJ = counts.get(fatherOfJ);
            counts.put(fatherOfJ, countOfI + countOfJ);
        }
    }

    private int findFather(Map<Integer, Integer> fathers, int i) {
        if (fathers.get(i) != i) {
            fathers.put(i, findFather(fathers, fathers.get(i)));
        }
        return fathers.get(i);
    }
}
// 并查集
// 时间复杂度：O(n)
// 空间复杂度：