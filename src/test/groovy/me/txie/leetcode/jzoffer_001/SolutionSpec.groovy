package me.txie.leetcode.jzoffer_001

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_001"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.divide(a, b) == expected

        where: "Samples"
        a                 | b  || expected
        0x80000000 as int | -1 || 0x7fffffff as int
        15                | 2  || 7
        7                 | -3 || -2
        0                 | 1  || 0
        1                 | 1  || 1
    }

}
