package me.txie.leetcode.jzoffer_036

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_036"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.evalRPN(tokens) == expected

        where: "Samples"
        tokens                                                                            || expected
        ["2", "1", "+", "3", "*"] as String[]                                             || 9
        ["4", "13", "5", "/", "+"] as String[]                                              || 6
        ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"] as String[] || 22
    }

}
