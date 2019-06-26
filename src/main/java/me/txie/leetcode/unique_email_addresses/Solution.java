/**
 * LeetCode - unique_email_addresses
 */
package me.txie.leetcode.unique_email_addresses;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int numUniqueEmails(String[] emails);
}
