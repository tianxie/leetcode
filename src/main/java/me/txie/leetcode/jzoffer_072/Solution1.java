/**
 * LeetCode - jzoffer_072
 * https://leetcode.cn/problems/jJ0w9p/
 */

package me.txie.leetcode.jzoffer_072;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int mySqrt(int x) {
        int lo = 1, hi = x;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid <= x / mid) {
                if ((mid + 1) > x / (mid + 1)) {
                    return mid;
                }
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return 0;
    }
}
// 时间复杂度：O(logn)
// 空间复杂度：