package me.txie.leetcode.p154_find_minimum_in_rotated_sorted_array_ii

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p154_find_minimum_in_rotated_sorted_array_ii"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findMin(nums) == expected

        where: "Samples"
        nums                     || expected
        [1, 3, 5] as int[]       || 1
        [2, 2, 2, 0, 1] as int[] || 0
    }

}
