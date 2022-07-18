/**
 * LeetCode - jzoffer_116
 * https://leetcode.cn/problems/bLyHh0/
 */

package me.txie.leetcode.jzoffer_116;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int findCircleNum(int[][] isConnected) {
        int[] fathers = new int[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            fathers[i] = i;
        }

        int count = isConnected.length;
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = i + 1; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1 && union(fathers, i, j)) {
                    count--;
                }
            }
        }
        return count;
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
}
// 并查集
// 时间复杂度：O(n^2)
// 空间复杂度：