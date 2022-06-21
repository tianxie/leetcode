package me.txie.leetcode.jzoffer_094

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_094"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minCut(s) == expected

        where: "Samples"
        s     || expected
        "aab" || 1
        "a"   || 0
        "ab"  || 1
    }

}
