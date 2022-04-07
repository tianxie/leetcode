package me.txie.leetcode.jzoffer_014

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_014"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.checkInclusion(s1, s2) == expected

        where: "Samples"
        s1   | s2         || expected
        "ab" | "eidbaooo" || true
        "ab" | "eidboaoo" || false
    }

}
