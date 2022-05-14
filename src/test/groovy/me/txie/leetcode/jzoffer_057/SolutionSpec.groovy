package me.txie.leetcode.jzoffer_057

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_057"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.containsNearbyAlmostDuplicate(nums, k, t) == expected

        where: "Samples"
        nums                               | k | t || expected
        [1, 2, 3, 1] as int[]              | 3 | 0 || true
        [1, 0, 1, 1] as int[]              | 1 | 2 || true
        [1, 5, 9, 1, 5, 9] as int[]        | 2 | 3 || false
        [-2147483648, 2147483647] as int[] | 1 | 1 || false
    }

}
