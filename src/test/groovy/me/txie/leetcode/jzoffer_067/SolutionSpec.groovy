package me.txie.leetcode.jzoffer_067

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_067"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findMaximumXOR(nums) == expected

        where: "Samples"
        nums                                                      || expected
        [3, 10, 5, 25, 2, 8] as int[]                             || 28
        [0] as int[]                                              || 0
        [2, 4] as int[]                                           || 6
        [8, 10, 2] as int[]                                       || 10
        [14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70] as int[] || 127
    }

}
