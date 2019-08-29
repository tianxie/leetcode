package me.txie.leetcode.p5_longest_palindromic_substring

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p5_longest_palindromic_substring"() {
        given: "Solution"
        Solution solution = new Solution1();
//        Solution solution = new Solution2();

        expect: "Pass unit test"
        solution.longestPalindrome(s) == expected

        where: "Samples"
        s       || expected
        "babad" || "bab"
        "cbbd"  || "bb"
    }

}
