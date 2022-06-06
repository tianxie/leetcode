package me.txie.leetcode.jzoffer_079

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_079"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.subsets(nums) == expected

        where: "Samples"
        nums               || expected
        [1, 2, 3] as int[] || [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
        [0] as int[]       || [[], [0]]
    }

}
