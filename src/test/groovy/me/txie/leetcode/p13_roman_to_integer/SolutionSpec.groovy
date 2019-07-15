package me.txie.leetcode.p13_roman_to_integer

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p13_roman_to_integer"() {
        given: "Solution"
        Solution solution = new Solution1();
//        Solution solution = new Solution2();

        expect: "Pass unit test"
        solution.romanToInt(s) == expected

        where: "Samples"
        s         || expected
        "III"     || 3
        "IV"      || 4
        "IX"      || 9
        "LVIII"   || 58
        "MCMXCIV" || 1994
    }

}
