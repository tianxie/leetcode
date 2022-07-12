package me.txie.leetcode.jzoffer_110

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_110"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.allPathsSourceTarget(graph) == expected

        where: "Samples"
        graph                                           || expected
        [[1, 2], [3], [3], []] as int[][]               || [[0, 1, 3], [0, 2, 3]]
        [[4, 3, 1], [3, 2, 4], [3], [4], []] as int[][] || [[0, 4], [0, 3, 4], [0, 1, 3, 4], [0, 1, 2, 3, 4], [0, 1, 4]]
        [[1], []] as int[][]                            || [[0, 1]]
        [[1, 2, 3], [2], [3], []] as int[][]            || [[0, 1, 2, 3], [0, 2, 3], [0, 3]]
        [[1, 3], [2], [3], []] as int[][]               || [[0, 1, 2, 3], [0, 3]]
    }

}
