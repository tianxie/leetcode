package me.txie.leetcode.jzoffer_099

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_099"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minPathSum(grid) == expected

        where: "Samples"
        grid                                         || expected
        [[1, 3, 1], [1, 5, 1], [4, 2, 1]] as int[][] || 7
        [[1, 2, 3], [4, 5, 6]] as int[][]            || 12
    }

}
