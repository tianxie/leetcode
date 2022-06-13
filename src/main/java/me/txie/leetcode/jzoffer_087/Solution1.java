/**
 * LeetCode - jzoffer_087
 * https://leetcode.cn/problems/0on3uN/
 */

package me.txie.leetcode.jzoffer_087;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new LinkedList<>();
        helper(s, 0, 0, "", "", result);
        return result;
    }

    private void helper(String s, int i, int segI, String seg, String ip, List<String> result) {
        if (i == s.length() && segI == 3 && isValidSeg(seg)) {
            result.add(ip + seg);
        } else if (i < s.length() && segI <= 3) {
            char c = s.charAt(i);
            if (isValidSeg(seg + c)) {
                helper(s, i + 1, segI, seg + c, ip, result);
            }

            if (seg.length() > 0 && segI < 3) {
                helper(s, i + 1, segI + 1, "" + c, ip + seg + ".", result);
            }
        }
    }

    private boolean isValidSeg(String seg) {
        return Integer.parseInt(seg) <= 255
            && ("0".equals(seg) || seg.charAt(0) != '0');
    }
}
// 时间复杂度：
// 空间复杂度：