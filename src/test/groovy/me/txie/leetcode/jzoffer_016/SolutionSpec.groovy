package me.txie.leetcode.jzoffer_016

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_016"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.lengthOfLongestSubstring(s) == expected

        where: "Samples"
        s          || expected
        "abcabcbb" || 3
        "bbbbb"    || 1
        "pwwkew"   || 3
        ""         || 0
    }

}
