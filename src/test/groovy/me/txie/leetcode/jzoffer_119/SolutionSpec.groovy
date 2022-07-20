package me.txie.leetcode.jzoffer_119

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_119"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.longestConsecutive(nums) == exected

        where: "Samples"
        nums                                    || exected
        [100, 4, 200, 1, 3, 2] as int[]         || 4
        [0, 3, 7, 2, 5, 8, 4, 6, 0, 1] as int[] || 9
    }

}
