package me.txie.leetcode.jzoffer_100

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_100"() {
        given: "Solution"
//        Solution solution = new Solution1()
//        Solution solution = new Solution2()
        Solution solution = new Solution3()

        expect: "Pass unit test"
        solution.minimumTotal(triangle) == expected

        where: "Samples"
        triangle                               || expected
        [[2], [3, 4], [6, 5, 7], [4, 1, 8, 3]] || 11
        [[-10]]                                || -10
    }

}
