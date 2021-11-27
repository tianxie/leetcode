package me.txie.leetcode.jzoffer_005

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_005"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.maxProduct(words) == expected

        where: "Samples"
        words                                                       || expected
        ["abcw", "baz", "foo", "bar", "fxyz", "abcdef"] as String[] || 16
        ["a", "ab", "abc", "d", "cd", "bcd", "abcd"] as String[]    || 4
        ["a", "aa", "aaa", "aaaa"] as String[]                      || 0
    }

}
