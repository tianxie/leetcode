package me.txie.leetcode.jzoffer_034

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_034"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.isAlienSorted(words, order) == expected

        where: "Samples"
        words | order || expected
        ["hello","leetcode"] as String[] | "hlabcdefgijkmnopqrstuvwxyz" || true
        ["word","world","row"] as String[] | "worldabcefghijkmnpqstuvxyz" || false
        ["apple","app"] as String[] | "abcdefghijklmnopqrstuvwxyz" || false
    }
    
}
