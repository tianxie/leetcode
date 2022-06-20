package me.txie.leetcode.jzoffer_093

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_093"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.lenLongestFibSubseq(arr) == expected

        where: "Samples"
        arr                                || expected
        [1, 2, 3, 4, 5, 6, 7, 8] as int[]  || 5
        [1, 3, 7, 11, 12, 14, 18] as int[] || 3
    }

}
