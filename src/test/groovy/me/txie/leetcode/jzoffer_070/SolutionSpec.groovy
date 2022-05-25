package me.txie.leetcode.jzoffer_070

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_070"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.singleNonDuplicate(nums) == expected

        where: "Samples"
        nums                                 || expected
        [1, 1, 2, 3, 3, 4, 4, 8, 8] as int[] || 2
        [3, 3, 7, 7, 10, 11, 11] as int[]    || 10
    }

}
