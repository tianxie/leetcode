package me.txie.leetcode.jzoffer_098

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_098"() {
        given: "Solution"
//        Solution solution = new Solution1()
//        Solution solution = new Solution2()
        Solution solution = new Solution3()

        expect: "Pass unit test"
        solution.uniquePaths(m, n) == expected

        where: "Samples"
        m | n || expected
        3 | 7 || 28
        3 | 2 || 3
        7 | 3 || 28
        3 | 3 || 6
    }

}
