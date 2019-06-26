/**
 * LeetCode - p37_sudoku_solver
 */
package me.txie.leetcode.p37_sudoku_solver;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    void solveSudoku(char[][] board);
}
