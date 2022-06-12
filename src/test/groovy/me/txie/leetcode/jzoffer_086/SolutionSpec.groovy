package me.txie.leetcode.jzoffer_086

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_086"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.partition(s) == expected

        where: "Samples"
        s        || expected
        "google" || [["g", "o", "o", "g", "l", "e"], ["g", "oo", "g", "l", "e"], ["goog", "l", "e"]] as String[][]
        "aab"    || [["a", "a", "b"], ["aa", "b"]] as String[][]
        "a"      || [["a"]] as String[][]
    }

}
