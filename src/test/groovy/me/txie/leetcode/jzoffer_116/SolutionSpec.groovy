package me.txie.leetcode.jzoffer_116

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_116"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findCircleNum(isConnected) == expected

        where: "Samples"
        isConnected                                  || expected
        [[1, 1, 0], [1, 1, 0], [0, 0, 1]] as int[][] || 2
        [[1, 0, 0], [0, 1, 0], [0, 0, 1]] as int[][] || 3
    }

}
