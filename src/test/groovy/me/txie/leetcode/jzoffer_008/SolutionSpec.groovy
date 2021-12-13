package me.txie.leetcode.jzoffer_008

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_008"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minSubArrayLen(target, nums) == expected

        where: "Samples"
        target | nums                              || expected
        7      | [2, 3, 1, 2, 4, 3] as int[]       || 2
        4      | [1, 4, 4] as int[]                || 1
        11     | [1, 1, 1, 1, 1, 1, 1, 1] as int[] || 0
    }

}
