package me.txie.leetcode.jzoffer_091

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_091"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minCost(costs) == expected

        where: "Samples"
        costs                                              || expected
        [[17, 2, 17], [16, 16, 5], [14, 3, 19]] as int[][] || 10
        [[7, 6, 2]] as int[][]                             || 2
    }

}
