package me.txie.leetcode.p12_integer_to_roman

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p12_integer_to_roman"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.intToRoman(num) == expected

        where: "Samples"
        num  || expected
        3    || "III"
        4    || "IV"
        9    || "IX"
        58   || "LVIII"
        1994 || "MCMXCIV"
    }

}
