package me.txie.leetcode.p70_climbing_stairs

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p70_climbing_stairs"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.climbStairs(n) == expected

        where: "Samples"
        n || expected
        2 || 2
        3 || 3
    }

}
