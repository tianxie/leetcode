package me.txie.leetcode.jzoffer_028

import spock.lang.Ignore
import spock.lang.Specification

class SolutionSpec extends Specification {

    @Ignore
    def "jzoffer_028"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.flatten(head) == expected

        where: "Samples"
        head || expected
    }
    
}
