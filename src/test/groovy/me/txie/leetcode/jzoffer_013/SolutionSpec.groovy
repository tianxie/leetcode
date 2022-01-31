package me.txie.leetcode.jzoffer_013

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_013"() {
        given: "Solution"
        Solution solution = new NumMatrix([[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]] as int[][])
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.sumRegion(row1, col1, row2, col2) == expected

        where: "Samples"
        row1 | col1 | row2 | col2 || expected
        2    | 1    | 4    | 3    || 8
        1    | 1    | 2    | 2    || 11
        1    | 2    | 2    | 4    || 12
    }

}
