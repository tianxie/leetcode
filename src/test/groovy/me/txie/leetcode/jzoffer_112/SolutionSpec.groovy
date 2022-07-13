package me.txie.leetcode.jzoffer_112

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_112"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.longestIncreasingPath(matrix) == expected

        where: "Samples"
        matrix                                       || expected
        [[9, 9, 4], [6, 6, 8], [2, 1, 1]] as int[][] || 4
        [[3, 4, 5], [3, 2, 6], [2, 2, 1]] as int[][] || 4
        [[1]] as int[][]                             || 1
    }

}
