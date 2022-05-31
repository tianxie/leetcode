/**
 * LeetCode - jzoffer_075
 * https://leetcode.cn/problems/0H97ZC/
 */

package me.txie.leetcode.jzoffer_075;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] counts = new int[1001];
        for (int num : arr1) {
            counts[num]++;
        }

        int i = 0;
        for (int num : arr2) {
            while (counts[num] > 0) {
                arr1[i++] = num;
                counts[num]--;
            }
        }

        for (int j = 0; j < counts.length; j++) {
            while (counts[j] > 0) {
                arr1[i++] = j;
                counts[j]--;
            }
        }

        return arr1;
    }
}
// 时间复杂度：O(m+n)
// 空间复杂度：O(1)