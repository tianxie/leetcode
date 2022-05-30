package me.txie.leetcode.jzoffer_074

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_074"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.merge(intervals) == expected

        where: "Samples"
        intervals                                      || expected
        [[1, 3], [2, 6], [8, 10], [15, 18]] as int[][] || [[1, 6], [8, 10], [15, 18]] as int[][]
        [[1, 4], [4, 5]] as int[][]                    || [[1, 5]] as int[][]
    }

}
