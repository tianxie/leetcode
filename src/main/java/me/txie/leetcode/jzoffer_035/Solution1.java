/**
 * LeetCode - jzoffer_035
 * https://leetcode-cn.com/problems/569nqc/
 */

package me.txie.leetcode.jzoffer_035;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) {
            return 0;
        }

        boolean[] minuteFlags = new boolean[1440];
        for (String point : timePoints) {
            String[] split = point.split(":");
            int minute = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
            if (minuteFlags[minute]) {
                return 0;
            }

            minuteFlags[minute] = true;
        }

        return find(minuteFlags);
    }

    private int find(boolean[] minuteFlags) {
        int minDiff = minuteFlags.length - 1;
        int prev = -1;
        int first = minuteFlags.length - 1;
        int last = -1;
        for (int i = 0; i < minuteFlags.length; i++) {
            if (minuteFlags[i]) {
                if (prev >= 0) {
                    minDiff = Math.min(i - prev, minDiff);
                }

                prev = i;
                first = Math.min(i, first);
                last = Math.max(i, last);
            }
        }

        // 考虑第一个时间加上1440分钟，与最后一个时间的时间差
        minDiff = Math.min(first + minuteFlags.length - last, minDiff);
        return minDiff;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)