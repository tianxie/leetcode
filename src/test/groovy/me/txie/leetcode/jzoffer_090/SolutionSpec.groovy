package me.txie.leetcode.jzoffer_090

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_090"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.rob(nums) == expected

        where: "Samples"
        nums                  || expected
        [2, 3, 2] as int[]    || 3
        [1, 2, 3, 1] as int[] || 4
        [0] as int[]          || 0
    }

}
