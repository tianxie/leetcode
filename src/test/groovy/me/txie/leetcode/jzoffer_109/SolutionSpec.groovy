package me.txie.leetcode.jzoffer_109

import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_109"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.openLock(deadends, target) == expected

        where: "Samples"
        deadends                                                                     | target || expected
        ["0201", "0101", "0102", "1212", "2002"] as String[]                         | "0202" || 6
        ["8888"] as String[]                                                         | "0009" || 1
        ["8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"] as String[] | "8888" || -1
        ["0000"] as String[]                                                         | "8888" || -1
        ["0201", "0101", "0102", "1212", "2002"] as String[]                         | "0000" || 0
    }

}
