package me.txie.leetcode.jzoffer_076

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_076"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findKthLargest(nums, k) == expected

        where: "Samples"
        nums                                 | k || expected
        [3, 2, 1, 5, 6, 4] as int[]          | 2 || 5
        [3, 2, 3, 1, 2, 4, 5, 5, 6] as int[] | 4 || 4
        [1] as int[]                         | 1 || 1
    }

}
