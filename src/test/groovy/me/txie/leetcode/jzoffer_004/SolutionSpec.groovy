package me.txie.leetcode.jzoffer_004

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_004"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.singleNumber(nums) == expected

        where: "Samples"
        nums                             || expected
        [2, 2, 3, 2] as int[]            || 3
        [0, 1, 0, 1, 0, 1, 100] as int[] || 100
    }

}
