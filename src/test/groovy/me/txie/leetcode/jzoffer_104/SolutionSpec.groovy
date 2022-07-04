package me.txie.leetcode.jzoffer_104

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_104"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.combinationSum4(nums, target) == expected

        where: "Samples"
        nums               | target || expected
        [1, 2, 3] as int[] | 4      || 7
        [9] as int[]       | 3      || 0
    }

}
