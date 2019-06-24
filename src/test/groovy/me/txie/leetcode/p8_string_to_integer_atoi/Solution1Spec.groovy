package me.txie.leetcode.p8_string_to_integer_atoi

import spock.lang.Specification

class Solution1Spec extends Specification {
    def "MyAtoi"() {
        given: "Solution1"
        Solution solution = new Solution1();

        expect: "Pass unit test"
        solution.myAtoi(str) == expected

        where: "Samples"
        str               || expected
        "42"              || 42
        "   -42"          || -42
        "4193 with words" || 4193
        "words and 987"   || 0
        "-91283472332"    || -2147483648
        "   +3dogs"       || 3
        "   -o798"        || 0
    }
}
