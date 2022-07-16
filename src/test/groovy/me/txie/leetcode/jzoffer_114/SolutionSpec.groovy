package me.txie.leetcode.jzoffer_114

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_114"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.alienOrder(words) == expected

        where: "Samples"
        words                                           || expected
        ["wrt", "wrf", "er", "ett", "rftt"] as String[] || "wertf"
        ["z", "x"] as String[]                          || "zx"
        ["z", "x", "z"] as String[]                     || ""
    }

}
