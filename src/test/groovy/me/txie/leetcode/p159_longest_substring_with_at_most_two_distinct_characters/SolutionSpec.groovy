package me.txie.leetcode.p159_longest_substring_with_at_most_two_distinct_characters

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p159_longest_substring_with_at_most_two_distinct_characters"() {
        given: "Solution"
        Solution solution = new Solution1();
//        Solution solution = new Solution2();

        expect: "Pass unit test"
        solution.lengthOfLongestSubstringTwoDistinct(s) == expected

        where: "Samples"
        s       || expected
        "eceba" || 3
        "abaac" || 4
    }

}
