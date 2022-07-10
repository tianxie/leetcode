package me.txie.leetcode.jzoffer_108

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_108"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.ladderLength(beginWord, endWord, wordList) == expected

        where: "Samples"
        beginWord | endWord | wordList                                   || expected
        "hit"     | "cog"   | ["hot", "dot", "dog", "lot", "log", "cog"] || 5
        "hit"     | "cog"   | ["hot", "dot", "dog", "lot", "log"]        || 0
    }

}
