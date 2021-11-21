package me.txie.leetcode.jzoffer_002

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_002"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.addBinary(a, b) == expected

        where: "Samples"
        a      | b      || expected
        "11"   | "10"   || "101"
        "1010" | "1011" || "10101"
        "0"    | "1"    || "1"
    }

}
