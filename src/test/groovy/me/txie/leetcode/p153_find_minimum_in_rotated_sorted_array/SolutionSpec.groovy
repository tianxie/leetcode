package me.txie.leetcode.p153_find_minimum_in_rotated_sorted_array

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p153_find_minimum_in_rotated_sorted_array"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findMin(nums) == expected

        where: "Samples"
        nums                           || expected
        [3, 4, 5, 1, 2] as int[]       || 1
        [4, 5, 6, 7, 0, 1, 2] as int[] || 0
    }

}
