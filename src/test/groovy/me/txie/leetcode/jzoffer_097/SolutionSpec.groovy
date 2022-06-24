package me.txie.leetcode.jzoffer_097

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_097"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.numDistinct(s, t) == expected

        where: "Samples"
        s         | t        || expected
        "rabbbit" | "rabbit" || 3
        "babgbag" | "bag"    || 5
        
    }

}
