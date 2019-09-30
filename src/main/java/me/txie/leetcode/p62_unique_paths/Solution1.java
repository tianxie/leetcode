/**
 * LeetCode - p62_unique_paths
 */
 
package me.txie.leetcode.p62_unique_paths;
import java.util.*;
import me.txie.leetcode.util.*;

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
    public int uniquePaths(int m, int n) {
        int[][] numberOfPaths = new int[m][n];
        return computeNumberOfPathsToXY(m - 1, n - 1, numberOfPaths);
    }

    private int computeNumberOfPathsToXY(int x, int y, int[][] numberOfPaths) {
        if (x == 0 || y == 0) {
            return 1;
        }

        if (numberOfPaths[x][y] == 0) {
            int pathsLeft = (x == 0) ? 0 : computeNumberOfPathsToXY(x - 1, y, numberOfPaths);
            int pathsTop = (y == 0) ? 0 : computeNumberOfPathsToXY(x, y - 1, numberOfPaths);
            numberOfPaths[x][y] = pathsLeft + pathsTop;
        }
        return numberOfPaths[x][y];
    }
}