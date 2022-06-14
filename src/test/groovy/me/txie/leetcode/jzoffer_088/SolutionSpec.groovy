package me.txie.leetcode.jzoffer_088

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_088"() {
        given: "Solution"
//        Solution solution = new Solution1()
//        Solution solution = new Solution2()
        Solution solution = new Solution3()

        expect: "Pass unit test"
        solution.minCostClimbingStairs(cost) == expected

        where: "Samples"
        cost                                          || expected
        [10, 15, 20] as int[]                         || 15
        [1, 100, 1, 1, 1, 100, 1, 1, 100, 1] as int[] || 6
        [1, 100] as int[]                             || 1
    }

}
