package me.txie.leetcode.jzoffer_084

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_084"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.permuteUnique(nums) == expected

        where: "Samples"
        nums               || expected
        [1, 1, 2] as int[] || [[1, 1, 2], [1, 2, 1], [2, 1, 1]]
        [1, 2, 3] as int[] || [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    }

}
