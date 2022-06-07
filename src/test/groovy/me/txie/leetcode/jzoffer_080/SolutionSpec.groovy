package me.txie.leetcode.jzoffer_080

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_080"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.combine(n, k) == expected

        where: "Samples"
        n | k || expected
        4 | 2 || [[2, 4], [3, 4], [2, 3], [1, 2], [1, 3], [1, 4]]
        1 | 1 || [[1]]
    }

}
