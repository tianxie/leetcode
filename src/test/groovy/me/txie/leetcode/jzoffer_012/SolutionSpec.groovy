package me.txie.leetcode.jzoffer_012

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_012"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.pivotIndex(nums) == expected

        where: "Samples"
        nums                        || expected
        [1, 7, 3, 6, 5, 6] as int[] || 3
        [1, 2, 3] as int[]          || -1
        [2, 1, -1] as int[]         || 0
    }

}
