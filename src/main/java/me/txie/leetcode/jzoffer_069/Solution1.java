/**
 * LeetCode - jzoffer_069
 * https://leetcode.cn/problems/B1IidL/
 */

package me.txie.leetcode.jzoffer_069;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 1, hi = arr.length - 2;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid] > arr[mid - 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
// 时间复杂度：
// 空间复杂度：