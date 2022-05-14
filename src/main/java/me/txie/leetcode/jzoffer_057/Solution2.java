/**
 * LeetCode - jzoffer_057
 * https://leetcode.cn/problems/7WqeDu/
 */

package me.txie.leetcode.jzoffer_057;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Long, Long> buckets = new HashMap<>();
        int bucketSize = t + 1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            long id = getBucketId(num, bucketSize);

            if (buckets.containsKey(id)
                || (buckets.containsKey(id - 1) && num - buckets.get(id - 1) <= t)
                || (buckets.containsKey(id + 1) && buckets.get(id + 1) - num <= t)) {
                return true;
            }

            buckets.put(id, (long) num);
            if (i >= k) {
                buckets.remove(getBucketId(nums[i - k], bucketSize));
            }
        }
        return false;
    }

    private long getBucketId(int num, int bucketSize) {
        return num >= 0
            ? num / bucketSize
            : (num + 1) / bucketSize - 1;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(k)