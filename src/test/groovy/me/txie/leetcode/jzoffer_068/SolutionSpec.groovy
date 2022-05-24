package me.txie.leetcode.jzoffer_068

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_068"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.searchInsert(nums, target) == expected

        where: "Samples"
        nums                  | target || expected
        [1, 3, 5, 6] as int[] | 5      || 2
        [1, 3, 5, 6] as int[] | 2      || 1
        [1, 3, 5, 6] as int[] | 7      || 4
        [1, 3, 5, 6] as int[] | 0      || 0
        [1] as int[]          | 0      || 0
    }

}
