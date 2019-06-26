/**
 * LeetCode - p292_nim_game
 */
package me.txie.leetcode.p292_nim_game;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean canWinNim(int n);
}
