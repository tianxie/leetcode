/**
 * LeetCode - jzoffer_002
 * https://leetcode-cn.com/problems/add-binary/
 */

package me.txie.leetcode.jzoffer_002;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = digitA + digitB + carry;
            if (sum >= 2) {
                sum -= 2;
                carry = 1;
            } else {
                // 如果当前位没有进位，记得设置为0，不然carry的值仍是上一位的进位
                carry = 0;
            }
            result.insert(0, sum);
            i--;
            j--;
        }

        // 注意最高位的进位情况
        if (carry == 1) {
            result.insert(0, 1);
        }
        return result.toString();
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)