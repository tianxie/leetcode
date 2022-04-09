package me.txie.leetcode.jzoffer_017

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_017"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minWindow(s, t) == expected

        where: "Samples"
        s               | t     || expected
        "ADOBECODEBANC" | "ABC" || "BANC"
        "a"             | "a"   || "a"
        "a"             | "aa"  || ""
    }

}
