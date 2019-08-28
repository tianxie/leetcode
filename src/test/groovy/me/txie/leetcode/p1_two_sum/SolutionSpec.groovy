package me.txie.leetcode.p1_two_sum

import spock.lang.Specification

class SolutionSpec extends Specification {
    def "TwoSum"() {
        given: "Solution1"
        Solution solution = new Solution1();

        expect: "Pass unit test"
        solution.twoSum(nums, target) == expected

        where: "Samples"
        nums                    | target || expected
        [2, 7, 11, 15] as int[] | 9      || [0, 1] as int[]
    }
}
