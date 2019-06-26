/**
 * LeetCode - p37_sudoku_solver
 */
package me.txie.leetcode.p37_sudoku_solver;

import java.util.*;

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

    private static final int DIMENSION = 9;
    private static final int CELLS = DIMENSION * DIMENSION;

    private boolean finished;

    class Point {
        int x, y;
    }

    class BoardType {
        char[][] m; /* matrix of board contents */
        int freeCount; /* how many open squares remain? */
        Point[] move; /* how did we fill the squares? */

        public BoardType(char[][] board) {
            this.m = board;
            this.freeCount = freeCount(board);
            this.move = new Point[CELLS + 1];
        }

        private int freeCount(char[][] board) {
            int count = 0;
            for (int i = 0; i < DIMENSION; i++) {
                for (int j = 0; j < DIMENSION; j++) {
                    if (board[i][j] == '.') {
                        count = count + 1;
                    }
                }
            }
            return count;
        }
    }


    @Override
    public void solveSudoku(char[][] board) {
        // TODO
        int[] a = new int[CELLS + 1];
        BoardType boardType = new BoardType(board);
        backtrack(a, 0, boardType);
    }

    private void backtrack(int[] a, int k, BoardType boardType) {
        if (isASolution(a, k, boardType)) {
            processSolution(a, k, boardType);
        } else {
            k = k + 1;
            int[] candidates = constructCandidates(a, k, boardType);
            for (int c : candidates) {
                a[k] = c;
                makeMove(a, k, boardType);
                backtrack(a, k, boardType);
                if (finished)
                    return;
                unmakeMove(a, k, boardType);
            }
        }
    }

    private void makeMove(int[] a, int k, BoardType boardType) {

    }

    private void unmakeMove(int[] a, int k, BoardType boardType) {

    }

    private int[] constructCandidates(int[] a, int k, BoardType boardType) {
        Point p = nextSquare(boardType); // which square should we fill next?

        // store our choice of next position
        boardType.move[k].x = p.x;
        boardType.move[k].y = p.y;

        if (p.x < 0 && p.y < 0)
            return new int[0];

        boolean[] possibles = possibleValues(p, boardType);
        for (int i = 1; i <= DIMENSION; i++) {

        }
        return null;
    }

    private Point nextSquare(BoardType boardType) {

        return null;
    }

    private boolean[] possibleValues(Point p, BoardType boardType) {
        return new boolean[0];
    }

    private boolean isASolution(int[] a, int k, BoardType boardType) {
        return boardType.freeCount == 0;
    }

    private void processSolution(int[] a, int k, BoardType boardType) {
        finished = true;
    }
}
