package me.txie.leetcode.p62_unique_paths

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p62_unique_paths"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.uniquePaths(m, n) == expected

        where: "Samples"
        m | n || expected
        3 | 2 || 3
        7 | 3 || 28
    }

}
