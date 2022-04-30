package me.txie.leetcode.jzoffer_040

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_040"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.maximalRectangle(matrix) == expected

        where: "Samples"
        matrix                                           || expected
        ["10100", "10111", "11111", "10010"] as String[] || 6
        [] as String[]                                   || 0
        ["0"] as String[]                                || 0
        ["1"] as String[]                                || 1
        ["00"] as String[]                               || 0
    }

}
