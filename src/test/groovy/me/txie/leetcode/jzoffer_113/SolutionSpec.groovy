package me.txie.leetcode.jzoffer_113

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_113"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findOrder(numCourses, prerequisites) == expected

        where: "Samples"
        numCourses | prerequisites                               || expected
        2          | [[1, 0]] as int[][]                         || [0, 1] as int[]
        4          | [[1, 0], [2, 0], [3, 1], [3, 2]] as int[][] || [0, 1, 2, 3] as int[]
        1          | [] as int[][]                               || [0] as int[]
    }

}
