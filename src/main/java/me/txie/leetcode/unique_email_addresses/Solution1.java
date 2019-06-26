/**
 * LeetCode - unique_email_addresses
 */
package me.txie.leetcode.unique_email_addresses;

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


    @Override
    public int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();
        for (String email : emails) {
            int atIndex = email.indexOf("@");
            String localName = email.substring(0, atIndex);
            String domainName = email.substring(atIndex);
            int plusIndex = localName.indexOf("+");
            if (plusIndex > -1) {
                localName = localName.substring(0, plusIndex);
            }
            localName = localName.replace(".", "");
            s.add(localName + domainName);
        }
        return s.size();
    }
}
