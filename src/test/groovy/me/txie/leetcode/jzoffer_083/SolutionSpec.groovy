package me.txie.leetcode.jzoffer_083

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_083"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.permute(nums) == expected

        where: "Samples"
        nums               || expected
        [1, 2, 3] as int[] || [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
        [0, 1] as int[]    || [[0, 1], [1, 0]]
        [1] as int[]       || [[1]]
    }

}
