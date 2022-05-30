/**
 * LeetCode - jzoffer_074
 * https://leetcode.cn/problems/SsGoHC/
 */

package me.txie.leetcode.jzoffer_074;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;
import sun.awt.image.ImageWatched;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);

        List<int[]> merged = new LinkedList<>();
        int i = 0;
        while (i < intervals.length) {
            int[] temp = new int[]{intervals[i][0], intervals[i][1]};
            int j = i + 1;
            while (j < intervals.length && intervals[j][0] <= temp[1]) {
                temp[1] = Math.max(temp[1], intervals[j][1]);
                j++;
            }

            merged.add(temp);
            i = j;
        }

        int[][] result = new int[merged.size()][];
        return merged.toArray(result);
    }
}
// 时间复杂度：O(nlogn)
// 空间复杂度：