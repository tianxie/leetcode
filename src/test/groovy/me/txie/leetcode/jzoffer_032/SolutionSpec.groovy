package me.txie.leetcode.jzoffer_032

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_032"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.isAnagram(s, t) == expected

        where: "Samples"
        s         | t         || expected
        "anagram" | "nagaram" || true
        "rat"     | "car"     || false
        "a"       | "a"       || false
    }

}
