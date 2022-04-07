package me.txie.leetcode.jzoffer_015

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_015"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findAnagrams(s, p) == expected

        where: "Samples"
        s            | p     || expected
        "cbaebabacd" | "abc" || [0, 6]
        "abab"       | "ab"  || [0, 1, 2]
    }

}
