package me.txie.leetcode.jzoffer_060

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_060"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.topKFrequent(nums, k) == expected

        where: "Samples"
        nums                        | k || expected
        [1, 1, 1, 2, 2, 3] as int[] | 2 || [1, 2] as int[]
        [1] as int[]                | 1 || [1] as int[]
    }

}
