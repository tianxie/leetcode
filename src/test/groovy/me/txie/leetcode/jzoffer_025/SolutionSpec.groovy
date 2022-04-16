package me.txie.leetcode.jzoffer_025

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_025"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.addTwoNumbers(l1, l2) == expected

        where: "Samples"
        l1                      | l2                   || expected
        ListNode.of(7, 2, 4, 3) | ListNode.of(5, 6, 4) || ListNode.of(7, 8, 0, 7)
        ListNode.of(2, 4, 3)    | ListNode.of(5, 6, 4) || ListNode.of(8, 0, 7)
        ListNode.of(0)          | ListNode.of(0)       || ListNode.of(0)
    }

}
