package me.txie.leetcode.jzoffer_092

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_092"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minFlipsMonoIncr(s) == expected

        where: "Samples"
        s          || expected
        "00110"    || 1
        "010110"   || 2
        "00011000" || 2
    }

}
