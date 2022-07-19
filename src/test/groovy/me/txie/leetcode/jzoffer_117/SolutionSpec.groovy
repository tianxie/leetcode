package me.txie.leetcode.jzoffer_117

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_117"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.numSimilarGroups(strs) == expected

        where: "Samples"
        strs                                         || expected
        ["tars", "rats", "arts", "star"] as String[] || 2
        ["omv", "ovm"] as String[]                   || 1
    }

}
