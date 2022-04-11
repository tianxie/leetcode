package me.txie.leetcode.jzoffer_019

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_019"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.validPalindrome(s) == expected

        where: "Samples"
        s      || expected
        "aba"  || true
        "abca" || true
        "abc"  || false
    }

}
