package me.txie.leetcode.jzoffer_085

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_085"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.generateParenthesis(n) == expected

        where: "Samples"
        n || expected
        3 || ["((()))", "(()())", "(())()", "()(())", "()()()"]
        1 || ["()"]
    }

}
