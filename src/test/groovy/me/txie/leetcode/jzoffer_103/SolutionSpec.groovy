package me.txie.leetcode.jzoffer_103

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_103"() {
        given: "Solution"
//        Solution solution = new Solution1()
//        Solution solution = new Solution2()
        Solution solution = new Solution3()

        expect: "Pass unit test"
        solution.coinChange(coins, amount) == expected

        where: "Samples"
        coins              | amount || expected
        [1, 2, 5] as int[] | 11     || 3
        [2] as int[]       | 3      || -1
        [1] as int[]       | 0      || 0
        [1] as int[]       | 1      || 1
        [1] as int[]       | 2      || 2
    }

}
