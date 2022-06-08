package me.txie.leetcode.jzoffer_082

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_082"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.combinationSum2(candidates, target) == expected

        where: "Samples"
        candidates                      | target || expected
        [10, 1, 2, 7, 6, 1, 5] as int[] | 8      || [[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
        [2, 5, 2, 1, 2] as int[]        | 5      || [[1, 2, 2], [5]]
    }

}
