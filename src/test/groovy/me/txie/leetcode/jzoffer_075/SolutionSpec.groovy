package me.txie.leetcode.jzoffer_075

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_075"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.relativeSortArray(arr1, arr2) == expected

        where: "Samples"
        arr1                                        | arr2                        || expected
        [2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19] as int[] | [2, 1, 4, 3, 9, 6] as int[] || [2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19] as int[]
    }

}
