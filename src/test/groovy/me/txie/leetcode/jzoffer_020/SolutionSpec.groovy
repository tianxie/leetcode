package me.txie.leetcode.jzoffer_020

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_020"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.countSubstrings(s) == expected

        where: "Samples"
        s     || expected
        "abc" || 3
        "aaa" || 6
        
    }

}
