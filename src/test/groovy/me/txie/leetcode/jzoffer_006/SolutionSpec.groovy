package me.txie.leetcode.jzoffer_006

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_006"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.twoSum(numbers, target) == expected

        where: "Samples"
        numbers                   | target || expected
        [1, 2, 4, 6, 10] as int[] | 8      || [1, 3] as int[]
        [2, 3, 4] as int[]        | 6      || [0, 2] as int[]
        [-1, 0] as int[]          | -1     || [0, 1] as int[]
    }

}
