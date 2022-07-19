/**
 * LeetCode - jzoffer_117
 * https://leetcode.cn/problems/H6lPxb/
 */

package me.txie.leetcode.jzoffer_117;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int numSimilarGroups(String[] strs) {
        int[] fathers = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            fathers[i] = i;
        }

        int groups = strs.length;
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (similar(strs[i], strs[j]) && union(fathers, i, j)) { // 相似才合并
                    groups--;
                }
            }
        }

        return groups;
    }

    private boolean union(int[] fathers, int i, int j) {
        int fatherOfI = findFather(fathers, i);
        int fatherOfJ = findFather(fathers, j);
        if (fatherOfI != fatherOfJ) {
            fathers[fatherOfI] = fatherOfJ;
            return true;
        }
        return false;
    }

    private int findFather(int[] fathers, int i) {
        if (fathers[i] != i) {
            fathers[i] = findFather(fathers, fathers[i]);
        }
        return fathers[i];
    }

    private boolean similar(String str1, String str2) {
        int diffCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount <= 2;
    }
}
// 并查集
// 时间复杂度：
// 空间复杂度：