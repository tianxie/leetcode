package me.txie.leetcode.jzoffer_087

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_087"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.restoreIpAddresses(s) == expected

        where: "Samples"
        s             || expected
        "25525511135" || ["255.255.11.135", "255.255.111.35"]
        "0000"        || ["0.0.0.0"]
        "1111"        || ["1.1.1.1"]
        "010010"      || ["0.10.0.10", "0.100.1.0"]
        "10203040"    || ["10.20.30.40", "102.0.30.40", "10.203.0.40"]
    }


}
