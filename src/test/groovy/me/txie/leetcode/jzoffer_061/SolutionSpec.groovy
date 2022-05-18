package me.txie.leetcode.jzoffer_061

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_061"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.kSmallestPairs(nums1, nums2, k) == expected

        where: "Samples"
        nums1               | nums2              | k || expected
        [1, 7, 11] as int[] | [2, 4, 6] as int[] | 3 || [[1, 2], [1, 4], [1, 6]]
        [1, 1, 2] as int[]  | [1, 2, 3] as int[] | 2 || [[1, 1], [1, 1]]
        [1, 2] as int[]     | [3] as int[]       | 3 || [[1, 3], [2, 3]]
    }

}
