package me.txie.leetcode.jzoffer_011

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_011"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findMaxLength(nums) == expected

        where: "Samples"
        nums               || expected
        [0, 1] as int[]    || 2
        [0, 1, 0] as int[] || 2
    }

}
