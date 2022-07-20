package me.txie.leetcode.jzoffer_118

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_118"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findRedundantConnection(edges) == expected

        where: "Samples"
        edges                                               || expected
        [[1, 2], [1, 3], [2, 3]] as int[][]                 || [2, 3] as int[]
        [[1, 2], [2, 3], [3, 4], [1, 4], [1, 5]] as int[][] || [1, 4] as int[]
        
    }

}
