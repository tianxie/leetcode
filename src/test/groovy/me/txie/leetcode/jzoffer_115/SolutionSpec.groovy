package me.txie.leetcode.jzoffer_115

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_115"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.sequenceReconstruction(nums, sequences) == expected

        where: "Samples"
        nums               | sequences                           || expected
        [1, 2, 3] as int[] | [[1, 2], [1, 3]] as int[][]         || false
        [1, 2, 3] as int[] | [[1, 2]] as int[][]                 || false
        [1, 2, 3] as int[] | [[1, 2], [1, 3], [2, 3]] as int[][] || true

    }

}
