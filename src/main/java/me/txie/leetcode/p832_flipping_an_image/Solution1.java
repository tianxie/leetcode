/**
 * Leetcode - p832_flipping_an_image
 */
package me.txie.leetcode.p832_flipping_an_image;

import java.util.*;

import com.ciaoshen.leetcode.util.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution1 implements Solution {


    @Override
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            flip(A[i]);
            invert(A[i]);
        }
        return A;
    }

    private void flip(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 -i];
            a[a.length - 1 - i] = tmp;
        }
    }

    private void invert(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] ^= 1;
        }
    }
}
