package me.txie.leetcode.jzoffer_022

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_022"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.detectCycle(head) == expected

        where: "Samples"
        head                     || expected
//        ListNode.of(1)           || null
//        ListNode.of(3, 2, 0, -4) || ListNode.of(2)
//        ListNode.of(1, 2)        || ListNode.of(1)
    }

}
