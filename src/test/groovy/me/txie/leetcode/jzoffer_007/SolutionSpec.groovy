package me.txie.leetcode.jzoffer_007

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_007"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.threeSum(nums) == expected

        where: "Samples"
        nums                           || expected
        [-1, 0, 1, 2, -1, -4] as int[] || [[-1, -1, 2], [-1, 0, 1]]
        [] as int[]                    || []
        [0] as int[]                   || []
    }

}
