package me.txie.leetcode.jzoffer_039

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_039"() {
        given: "Solution"
//        Solution solution = new Solution1()
//        Solution solution = new Solution2()
        Solution solution = new Solution3()

        expect: "Pass unit test"
        solution.largestRectangleArea(heights) == expected

        where: "Samples"
        heights                     || expected
        [2, 1, 5, 6, 2, 3] as int[] || 10
        [2, 4] as int[]             || 4
    }

}
