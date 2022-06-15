package me.txie.leetcode.jzoffer_089

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_089"() {
        given: "Solution"
//        Solution solution = new Solution1()
//        Solution solution = new Solution2()
//        Solution solution = new Solution3()
        Solution solution = new Solution4()

        expect: "Pass unit test"
        solution.rob(nums) == expected

        where: "Samples"
        nums                     || expected
        [1, 2, 3, 1] as int[]    || 4
        [2, 7, 9, 3, 1] as int[] || 12
    }

}
