package me.txie.leetcode.jzoffer_018

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_018"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.isPalindrome(s) == expected

        where: "Samples"
        s                                || expected
        "A man, a plan, a canal: Panama" || true
        "race a car"                     || false
    }

}
