/**
 * LeetCode - p72_edit_distance
 */
 
package me.txie.leetcode.p72_edit_distance;

import java.util.Arrays;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    @Override
    public int minDistance(String word1, String word2) {
        int[][] distances = new int[word1.length()][word2.length()];
        for (int[] row : distances) {
            Arrays.fill(row, -1);
        }
        return computeDistanceBetweenPrefixes(word1, word1.length() - 1, word2, word2.length() - 1, distances);
    }

    private int computeDistanceBetweenPrefixes(String word1, int word1Idx, String word2, int word2Idx, int[][] distances) {
        if (word1Idx < 0) {
            // word1 is empty so add all of word2's characters.
            return word2Idx + 1;
        } else if (word2Idx < 0) {
            // word2 is empty so delete all of word1's characters.
            return word1Idx + 1;
        }

        if (distances[word1Idx][word2Idx] == -1) {
            if (word1.charAt(word1Idx) == word2.charAt(word2Idx)) {
                distances[word1Idx][word2Idx] = computeDistanceBetweenPrefixes(word1, word1Idx - 1,
                    word2, word2Idx - 1, distances);
            } else {
                int substituteLast = computeDistanceBetweenPrefixes(word1, word1Idx - 1,
                    word2, word2Idx - 1, distances);
                int addLast = computeDistanceBetweenPrefixes(word1, word1Idx,
                    word2, word2Idx - 1, distances);
                int deleteLast = computeDistanceBetweenPrefixes(word1, word1Idx - 1,
                    word2, word2Idx, distances);
                distances[word1Idx][word2Idx] = 1 + Math.min(substituteLast, Math.min(addLast, deleteLast));
            }
        }
        return distances[word1Idx][word2Idx];
    }
}