package me.txie.leetcode.jzoffer_003

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_003"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.countBits(n) == expected

        where: "Samples"
        n || expected
        2 || [0, 1, 1] as int[]
        5 || [0, 1, 1, 2, 1, 2] as int[]
    }

}
