package me.txie.leetcode.jzoffer_095

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_095"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.longestCommonSubsequence(text1, text2) == expected

        where: "Samples"
        text1   | text2 || expected
        "abcde" | "ace" || 3
        "abc"   | "abc" || 3
        "abc"   | "def" || 0
    }

}
