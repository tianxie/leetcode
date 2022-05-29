package me.txie.leetcode.jzoffer_072

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_072"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.mySqrt(x) == expected

        where: "Samples"
        x || expected
        4 || 2
        8 || 2
    }

}
