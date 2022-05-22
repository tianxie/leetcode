package me.txie.leetcode.jzoffer_065

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_065"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minimumLengthEncoding(words) == expected

        where: "Samples"
        words                              || expected
        ["time", "me", "bell"] as String[] || 10
        ["t"] as String[]                  || 2
    }

}
