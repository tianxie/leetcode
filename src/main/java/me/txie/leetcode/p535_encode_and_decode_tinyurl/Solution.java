/**
 * LeetCode - p535_encode_and_decode_tinyurl
 */
package me.txie.leetcode.p535_encode_and_decode_tinyurl;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    String encode(String longUrl);

    String decode(String shortUrl);
}
