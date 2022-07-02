package me.txie.leetcode.jzoffer_102

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_102"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findTargetSumWays(nums, target) == expected

        where: "Samples"
        nums                                 | target || expected
        [1, 1, 1, 1, 1] as int[]             | 3      || 5
        [1] as int[]                         | 1      || 1
        [1] as int[]                         | 2      || 0
        [0, 0, 0, 0, 0, 0, 0, 0, 1] as int[] | 1      || 256
    }

}
