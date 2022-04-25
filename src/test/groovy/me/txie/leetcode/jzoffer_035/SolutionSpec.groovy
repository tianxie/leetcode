package me.txie.leetcode.jzoffer_035

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_035"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findMinDifference(timePoints) == expected

        where: "Samples"
        timePoints                  || expected
        ["23:59", "00:00"]          || 1
        ["00:00", "23:59", "00:00"] || 0
    }

}
