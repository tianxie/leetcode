package me.txie.leetcode.p53_maximum_subarray

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p53_maximum_subarray"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.maxSubArray(nums) == expected

        where: "Samples"
        nums                                     || expected
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] as int[] || 6
        [-1] as int[]                            || -1
        [-2, -1] as int[]                        || -1
    }

}
