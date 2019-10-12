package me.txie.leetcode.p136_single_number

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p136_single_number"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.singleNumber(nums) == expected

        where: "Samples"
        nums                     || expected
        [2, 2, 1] as int[]       || 1
        [4, 1, 2, 1, 2] as int[] || 4
    }

}
