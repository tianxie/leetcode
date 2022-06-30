package me.txie.leetcode.jzoffer_101

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_101"() {
        given: "Solution"
//        Solution solution = new Solution1()
//        Solution solution = new Solution2()
        Solution solution = new Solution3()

        expect: "Pass unit test"
        solution.canPartition(nums) == expected

        where: "Samples"
        nums                   || expected
        [1, 5, 11, 5] as int[] || true
        [1, 2, 3, 5] as int[]  || false
    }

}
