package me.txie.leetcode.jzoffer_069

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_069"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.peakIndexInMountainArray(arr) == expected

        where: "Samples"
        arr                                                || expected
        [0, 1, 0] as int[]                                 || 1
        [1, 3, 5, 4, 2] as int[]                           || 2
        [0, 10, 5, 2] as int[]                             || 1
        [3, 4, 5, 1] as int[]                              || 2
        [24, 69, 100, 99, 79, 78, 67, 36, 26, 19] as int[] || 2
        [3, 5, 3, 2, 0] as int[]                           || 1
    }

}
