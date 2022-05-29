package me.txie.leetcode.jzoffer_073

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_073"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minEatingSpeed(piles, h) == expected

        where: "Samples"
        piles                        | h || expected
        [3, 6, 7, 11] as int[]       | 8 || 4
        [30, 11, 23, 4, 20] as int[] | 5 || 30
        [30, 11, 23, 4, 20] as int[] | 6 || 23
    }

}
