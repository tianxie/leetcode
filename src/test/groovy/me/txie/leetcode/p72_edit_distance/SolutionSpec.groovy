package me.txie.leetcode.p72_edit_distance

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p72_edit_distance"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minDistance(word1, word2) == expected

        where: "Samples"
        word1       | word2       || expected
        "horse"     | "ros"       || 3
        "intention" | "execution" || 5

    }

}
