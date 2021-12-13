package me.txie.leetcode.jzoffer_009

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_009"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.numSubarrayProductLessThanK(nums, k) == expected

        where: "Samples"
        nums                   | k   || expected
        [10, 5, 2, 6] as int[] | 100 || 8
        [1, 2, 3] as int[]     | 0   || 0
    }

}
