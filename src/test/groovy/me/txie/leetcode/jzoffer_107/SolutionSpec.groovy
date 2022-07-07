package me.txie.leetcode.jzoffer_107

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_107"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.updateMatrix(mat) == expected

        where: "Samples"
        mat                                          || expected
        [[0, 0, 0], [0, 1, 0], [0, 0, 0]] as int[][] || [[0, 0, 0], [0, 1, 0], [0, 0, 0]] as int[][]
        [[0, 0, 0], [0, 1, 0], [1, 1, 1]] as int[][] || [[0, 0, 0], [0, 1, 0], [1, 2, 1]] as int[][]
    }

}
